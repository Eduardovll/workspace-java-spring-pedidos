package com.valledev.pedido.services;

import org.springframework.stereotype.Service;

@Service
public class DiscountService {

    public double applyDiscount(double basicValue, double discountPercent) {
        return basicValue * (discountPercent / 100);
    }
}
