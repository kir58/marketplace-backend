package com.marketplace.repository;

import com.marketplace.model.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import java.util.List;

public class ProductRepositoryCustomImpl implements ProductRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Product> searchByKeyword(String keyword) {
        // Приведение ключевого слова к нижнему регистру и добавление подстановочных знаков для поиска
        String searchPattern = "%" + keyword.toLowerCase() + "%";
        // JPQL-запрос для поиска по name, description и category
        String jpql = "SELECT p FROM Product p " +
                "WHERE LOWER(p.name) LIKE :searchPattern " +
                "OR LOWER(p.description) LIKE :searchPattern " +
                "OR LOWER(p.category) LIKE :searchPattern";

        TypedQuery<Product> query = entityManager.createQuery(jpql, Product.class);
        query.setParameter("searchPattern", searchPattern);

        return query.getResultList();
    }
}
