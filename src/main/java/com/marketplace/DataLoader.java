package com.marketplace;

import com.marketplace.model.Product;
import com.marketplace.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final ProductRepository productRepository;

    // Внедрение зависимости ProductRepository через конструктор
    public DataLoader(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args)   {
        // Добавляем несколько продуктов с дефолтными значениями
        Product product1 = new Product("1", "Product 1", "Description of product 1", "Electronics",  20.0, "https://via.placeholder.com/150", 44.0, 4.0, 1);
        Product product2 = new Product("2", "Product 2", "Description of product 2", "Electronics", 30.0,  "https://via.placeholder.com/150", 42.0, 3.0, 10);
        Product product3 = new Product("3", "Product 3", "Description of product 3", "Furniture", 40.0, "https://via.placeholder.com/150", 43.0, 2.0, 0);
        Product product4 = new Product("4", "Product 4", "Description of product 4", "Furniture", 50.0, "https://via.placeholder.com/150", null, 3.0, 5);

        // Сохраняем продукты в базе данных
        productRepository.save(product1);
        productRepository.save(product2);
        productRepository.save(product3);
        productRepository.save(product4);

        // Выводим сообщение в консоль, чтобы удостовериться, что данные были добавлены
        System.out.println("Products have been added to the database.");
    }
}
