package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by jang on 17. 7. 1.
 */

@RestController
public class ProductController {
    @RequestMapping("/products")
    public ResponseEntity<List<Product>> getProducts() {
        List<Product> products = Arrays.asList(
                new Product(1L, "신라면", 700L),
                new Product(2L, "너구리", 600L),
                new Product(3L, "삼양라면", 800L)
        );

        return ResponseEntity.ok(products);
    }

    public static class Product {
        private Long id;
        private String name;
        private Long amount;

        public Product(Long id, String name, Long amount) {
            this.id = id;
            this.name = name;
            this.amount = amount;
        }
    }
}
