package ro.fasttrackit.productsapp;

import lombok.Builder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fasttrackit.productsapp.entity.Category;
import ro.fasttrackit.productsapp.entity.Product;
import ro.fasttrackit.productsapp.repository.ProductRepository;

import java.util.List;

@SpringBootApplication
public class Curs6HomeWorkApplication {

    public static void main(String[] args) {
        SpringApplication.run (Curs6HomeWorkApplication.class, args);
    }

    @Bean
    CommandLineRunner atStartup(ProductRepository repository){
        return args -> {
            repository.saveAll (List.of (
                    new Product ("Laptop", 900.99, "very good", Category.ELECTRONICS),
                    new Product ("T-Shirt", 150, " good", Category.CLOTHING)
            ));
        };
    }
}
