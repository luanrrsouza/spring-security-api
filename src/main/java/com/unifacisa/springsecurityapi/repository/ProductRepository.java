package com.unifacisa.springsecurityapi.repository;

import com.unifacisa.springsecurityapi.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}