package com.marketplace.service;

import com.marketplace.model.Product;
import com.marketplace.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Метод для получения продукта по ID
    public Product getProductById(String productId) {
        return productRepository.findAll().stream()
                .filter(product -> product.getId().equals(productId))
                .findFirst()
                .orElse(null);
    }

    // Метод для сохранения продукта
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> searchProducts(String keyword) {
        return productRepository.searchByKeyword(keyword);
    }
}
