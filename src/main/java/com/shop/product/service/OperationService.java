package com.shop.product.service;

import com.shop.product.data.dto.PurchaseCart;
import com.shop.product.data.entity.Product;
import com.shop.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OperationService {

    private final ProductRepository productRepository;

    @Transactional
    public void purchase(List<PurchaseCart> purchaseCartList) {
        purchaseCartList.forEach(purchaseCart -> {
            Product product = productRepository.findProductById(purchaseCart.getProductId());
            product.setInStock(product.getInStock() - purchaseCart.getQuantity());
        });
    }
}
