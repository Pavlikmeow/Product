package com.shop.product.service;

import com.shop.product.data.dto.PurchaseCart;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OperationService {

    private final ProductService productService;

    public void purchase(List<PurchaseCart> purchaseCartList) {
        productService.purchase(purchaseCartList);
    }
}
