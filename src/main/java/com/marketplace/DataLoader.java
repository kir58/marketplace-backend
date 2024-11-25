package com.marketplace;

import com.marketplace.model.Product;
import com.marketplace.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    private final ProductRepository productRepository;

    // Внедрение зависимости ProductRepository через конструктор
    public DataLoader(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args)   {
        List<Product> products = ProductDataGenerator.getGeneratedData();
        productRepository.saveAll(products);


        // Выводим сообщение в консоль, чтобы удостовериться, что данные были добавлены
        System.out.println("Products have been added to the database.");
    }
}
