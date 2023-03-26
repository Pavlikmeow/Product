package com.shop.product.service;

import com.shop.product.data.dto.PurchaseCart;
import com.shop.product.data.entity.Product;
import com.shop.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public void createNewProduct(Product product) {
        productRepository.save(product);
    }

    public void deleteProductById (UUID id) {
        productRepository.deleteById(id);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(UUID id) {
        return productRepository.findProductById(id);
    }
    @Transactional
    public void refund(UUID id, int quantity) {
        Product product = productRepository.findProductById(id);
        product.setInStock(product.getInStock() + quantity);
    }

}
