package com.shop.product.controller;

import com.shop.product.data.dto.PurchaseCart;
import com.shop.product.service.OperationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product/purchase")
@RequiredArgsConstructor
public class PurchaseController {

    private final OperationService operationService;

    @PostMapping
    void purchase(@RequestBody List<PurchaseCart> purchaseCartList) {
        operationService.purchase(purchaseCartList);
    }
}
