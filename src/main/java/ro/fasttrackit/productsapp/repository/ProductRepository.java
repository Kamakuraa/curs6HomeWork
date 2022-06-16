package ro.fasttrackit.productsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.productsapp.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
