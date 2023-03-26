package com.shop.product.controller;

import com.shop.product.data.dto.PurchaseCart;
import com.shop.product.data.dto.RefundRequest;
import com.shop.product.service.OperationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class OperationController {

    private final OperationService operationService;

    @PostMapping("/purchase")
    void purchase(@RequestBody List<PurchaseCart> purchaseCartList) {
        operationService.purchase(purchaseCartList);
    }

    @PostMapping("/refund")
    void refund(@RequestBody RefundRequest refundRequest) {
        operationService.refund(refundRequest);
    }
}
