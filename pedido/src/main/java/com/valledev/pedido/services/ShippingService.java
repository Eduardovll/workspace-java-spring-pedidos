package com.valledev.pedido.services;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment (double basic) {
        if (basic < 100.00) return 20.00;
        if (basic < 200.00) return 12.00;
        return 0.00;
    }
}
