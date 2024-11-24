package com.marketplace.repository;

import com.marketplace.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, String>, ProductRepositoryCustom {
    // Можно добавить дополнительные методы поиска, если нужно
    // Например, поиск продукта по имени
    // List<Product> findByNameContaining(String name);
}

