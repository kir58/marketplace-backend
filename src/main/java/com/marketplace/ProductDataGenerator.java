package com.marketplace;

import com.marketplace.model.Product;

import java.util.Arrays;
import java.util.List;

public class ProductDataGenerator {
    public static List<Product> getGeneratedData() {

        return Arrays.asList(
                new Product("1", "Elegant Wooden Chair", "A beautifully crafted wooden chair perfect for any modern living room or office.", "Furniture", 120.0, "https://via.placeholder.com/150?text=Elegant+Wooden+Chair", 150.0, 4.5, 12),
                new Product("2", "Smart LED TV 50\" 4K", "A high-resolution 4K television with smart features and an elegant, slim design.", "Electronics", 320.0, "https://via.placeholder.com/150?text=Smart+LED+TV+50\"", 350.0, 4.0, 8),
                new Product("3", "Vintage Coffee Table", "Stylish vintage coffee table made from reclaimed wood, adds charm to any room.", "Furniture", 40.0, "https://via.placeholder.com/150?text=Vintage+Coffee+Table", 43.0, 2.0, 0),
                new Product("4", "Designer Winter Jacket", "Warm and trendy winter jacket that keeps you cozy and stylish in cold weather.", "Clothing", 30.0, "https://via.placeholder.com/150?text=Designer+Winter+Jacket", 35.0, 4.3, 45),
                new Product("5", "Professional Basketball", "Official size basketball made with premium materials for better grip and durability.", "Sports", 80.0, "https://via.placeholder.com/150?text=Professional+Basketball", 100.0, 3.8, 15),
                new Product("6", "Organic Skin Care Kit", "A complete skincare set with organic ingredients, perfect for nourishing and glowing skin.", "Beauty", 60.0, "https://via.placeholder.com/150?text=Organic+Skin+Care+Kit", 65.0, 4.9, 32),
                new Product("7", "Modern Floor Lamp", "Stylish and adjustable floor lamp to enhance lighting in any room.", "Furniture", 240.0, "https://via.placeholder.com/150?text=Modern+Floor+Lamp", 250.0, 4.6, 23),
                new Product("8", "Educational Toy Blocks", "Colorful building blocks that help children develop cognitive and motor skills.", "Toys", 10.0, "https://via.placeholder.com/150?text=Educational+Toy+Blocks", 12.0, 3.5, 9),
                new Product("9", "Noise-Cancelling Headphones", "High-quality headphones with noise-cancelling features for an immersive sound experience.", "Electronics", 199.0, "https://via.placeholder.com/150?text=Noise-Cancelling+Headphones", 220.0, 4.2, 17),
                new Product("10", "Casual Leather Boots", "Comfortable leather boots suitable for casual wear and long-lasting comfort.", "Clothing", 40.0, "https://via.placeholder.com/150?text=Casual+Leather+Boots", 50.0, 4.1, 28),
                new Product("11", "Antique Bookshelf", "Solid wood bookshelf with a classic design to organize your collection in style.", "Furniture", 180.0, "https://via.placeholder.com/150?text=Antique+Bookshelf", 200.0, 4.8, 50),
                new Product("12", "Luxury Face Cream", "Moisturizing face cream enriched with vitamins and minerals for radiant skin.", "Beauty", 90.0, "https://via.placeholder.com/150?text=Luxury+Face+Cream", 95.0, 4.3, 19),
                new Product("13", "Yoga Mat with Extra Grip", "High-quality yoga mat with extra grip for stability during workouts.", "Sports", 60.0, "https://via.placeholder.com/150?text=Yoga+Mat+with+Extra+Grip", 70.0, 3.9, 12),
                new Product("14", "Rustic Dining Table", "Handmade dining table with a rustic finish that seats up to six people comfortably.", "Furniture", 150.0, "https://via.placeholder.com/150?text=Rustic+Dining+Table", 160.0, 4.7, 25),
                new Product("15", "Plush Teddy Bear", "Soft and cuddly teddy bear, perfect for gifting and comforting children.", "Toys", 20.0, "https://via.placeholder.com/150?text=Plush+Teddy+Bear", 22.0, 3.8, 10),
                new Product("16", "Smartphone 128GB", "Sleek and powerful smartphone with 128GB storage and long battery life.", "Electronics", 500.0, "https://via.placeholder.com/150?text=Smartphone+128GB", 600.0, 4.0, 6),
                new Product("17", "Rainproof Windbreaker", "Stylish windbreaker that keeps you dry and comfortable in rainy weather.", "Clothing", 90.0, "https://via.placeholder.com/150?text=Rainproof+Windbreaker", 100.0, 4.6, 30),
                new Product("18", "Luxury Perfume Set", "Exclusive set of luxury perfumes with various fragrances for special occasions.", "Beauty", 120.0, "https://via.placeholder.com/150?text=Luxury+Perfume+Set", 130.0, 4.7, 18),
                new Product("19", "Fitness Tracker Watch", "Advanced fitness tracker with heart rate monitor and GPS features.", "Sports", 70.0, "https://via.placeholder.com/150?text=Fitness+Tracker+Watch", 80.0, 3.7, 22),
                new Product("20", "Convertible Sofa Bed", "Multifunctional sofa bed with easy conversion, perfect for guests.", "Furniture", 300.0, "https://via.placeholder.com/150?text=Convertible+Sofa+Bed", 350.0, 4.9, 40),
                new Product("21", "Wooden Jigsaw Puzzle", "Challenging jigsaw puzzle with intricate designs made from durable wood.", "Toys", 15.0, "https://via.placeholder.com/150?text=Wooden+Jigsaw+Puzzle", 18.0, 4.0, 5),
                new Product("22", "Wireless Bluetooth Speaker", "Compact and powerful Bluetooth speaker for quality sound on the go.", "Electronics", 100.0, "https://via.placeholder.com/150?text=Wireless+Bluetooth+Speaker", 110.0, 4.3, 7),
                new Product("23", "Classic Denim Jacket", "Timeless denim jacket suitable for all seasons and various outfits.", "Clothing", 50.0, "https://via.placeholder.com/150?text=Classic+Denim+Jacket", 60.0, 4.5, 35),
                new Product("24", "Table Tennis Set", "Complete table tennis set with two paddles and a net, ideal for quick games.", "Sports", 85.0, "https://via.placeholder.com/150?text=Table+Tennis+Set", 90.0, 4.1, 8),
                new Product("25", "Velvet Armchair", "Luxurious velvet armchair to add a touch of sophistication to any room.", "Furniture", 220.0, "https://via.placeholder.com/150?text=Velvet+Armchair", 240.0, 4.7, 32),
                new Product("26", "Digital Camera 20MP", "High-resolution digital camera for capturing stunning photos and videos.", "Electronics", 350.0, "https://via.placeholder.com/150?text=Digital+Camera+20MP", 400.0, 4.3, 5),
                new Product("27", "Wooden Train Set", "Classic wooden train set that sparks imagination and creativity in children.", "Toys", 40.0, "https://via.placeholder.com/150?text=Wooden+Train+Set", 45.0, 4.2, 10),
                new Product("28", "Herbal Hair Oil", "Natural herbal hair oil that promotes hair growth and strengthens roots.", "Beauty", 75.0, "https://via.placeholder.com/150?text=Herbal+Hair+Oil", 80.0, 4.4, 15),
                new Product("29", "Adjustable Dumbbells Set", "Set of adjustable dumbbells perfect for strength training at home.", "Sports", 120.0, "https://via.placeholder.com/150?text=Adjustable+Dumbbells+Set", 130.0, 4.8, 18),
                new Product("30", "Vintage Leather Belt", "Durable leather belt with a classic buckle, adding a vintage touch to any outfit.", "Clothing", 25.0, "https://via.placeholder.com/150?text=Vintage+Leather+Belt", 30.0, 3.9, 14),
                new Product("31", "Product 31", "Description of product 31", "Electronics", 250.0, "https://via.placeholder.com/150", 300.0, 4.5, 20),
                new Product("32", "Product 32", "Description of product 32", "Furniture", 280.0, "https://via.placeholder.com/150", 300.0, 4.6, 45),
                new Product("33", "Product 33", "Description of product 33", "Beauty", 65.0, "https://via.placeholder.com/150", 70.0, 4.4, 10),
                new Product("34", "Product 34", "Description of product 34", "Sports", 110.0, "https://via.placeholder.com/150", 120.0, 4.3, 22),
                new Product("35", "Product 35", "Description of product 35", "Clothing", 55.0, "https://via.placeholder.com/150", 60.0, 4.7, 17),
                new Product("36", "Product 36", "Description of product 36", "Furniture", 90.0, "https://via.placeholder.com/150", 100.0, 4.5, 5),
                new Product("37", "Product 37", "Description of product 37", "Beauty", 80.0, "https://via.placeholder.com/150", 85.0, 4.3, 15),
                new Product("38", "Product 38", "Description of product 38", "Electronics", 400.0, "https://via.placeholder.com/150", 450.0, 4.8, 25),
                new Product("39", "Product 39", "Description of product 39", "Sports", 140.0, "https://via.placeholder.com/150", 150.0, 4.1, 9),
                new Product("40", "Product 40", "Description of product 40", "Clothing", 60.0, "https://via.placeholder.com/150", 65.0, 4.6, 32),
                new Product("41", "Product 41", "Description of product 41", "Electronics", 500.0, "https://via.placeholder.com/150", 550.0, 4.5, 20),
                new Product("42", "Product 42", "Description of product 42", "Beauty", 150.0, "https://via.placeholder.com/150", 160.0, 4.7, 18),
                new Product("43", "Product 43", "Description of product 43", "Sports", 90.0, "https://via.placeholder.com/150", 95.0, 4.2, 5),
                new Product("44", "Product 44", "Description of product 44", "Furniture", 180.0, "https://via.placeholder.com/150", 190.0, 4.5, 22),
                new Product("45", "Product 45", "Description of product 45", "Clothing", 70.0, "https://via.placeholder.com/150", 75.0, 4.7, 11),
                new Product("46", "Product 46", "Description of product 46", "Electronics", 250.0, "https://via.placeholder.com/150", 270.0, 4.0, 10),
                new Product("47", "Product 47", "Description of product 47", "Beauty", 130.0, "https://via.placeholder.com/150", 140.0, 4.6, 8),
                new Product("48", "Product 48", "Description of product 48", "Sports", 95.0, "https://via.placeholder.com/150", 100.0, 4.4, 7),
                new Product("49", "Product 49", "Description of product 49", "Toys", 25.0, "https://via.placeholder.com/150", 30.0, 3.9, 18),
                new Product("50", "Product 50", "Description of product 50", "Furniture", 500.0, "https://via.placeholder.com/150", 550.0, 4.8, 50)
        );
    }
}
