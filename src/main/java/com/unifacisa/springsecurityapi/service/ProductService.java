package com.unifacisa.springsecurityapi.service;

import com.unifacisa.springsecurityapi.domain.product.Product;
import com.unifacisa.springsecurityapi.dto.ProductDTO;
import com.unifacisa.springsecurityapi.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Product create(ProductDTO dto) {
        Product product = new Product();
        product.setName(dto.name());
        product.setPrice(dto.price());

        return productRepository.save(product);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product update(Long id, ProductDTO dto) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        product.setName(dto.name());
        product.setPrice(dto.price());

        return productRepository.save(product);
    }

    public void delete(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        productRepository.delete(product);
    }
}