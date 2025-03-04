package com.valledev.pedido.services;

import org.springframework.stereotype.Service;

@Service
public class EventCalculateService {

    public double calculateDiscount(double basicValue, double discountPercent) {
        return basicValue * (discountPercent / 100);
    }
}
