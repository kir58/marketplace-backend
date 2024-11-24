package com.marketplace.repository;

import com.marketplace.model.Product;

import java.util.List;

public interface ProductRepositoryCustom {
    List<Product> searchByKeyword(String keyword);
}
