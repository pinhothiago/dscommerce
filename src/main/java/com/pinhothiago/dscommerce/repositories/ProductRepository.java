package com.pinhothiago.dscommerce.repositories;

import com.pinhothiago.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
