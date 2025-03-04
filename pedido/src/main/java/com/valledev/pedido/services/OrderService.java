package com.valledev.pedido.services;

import com.valledev.pedido.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    @Autowired
    private DiscountService discountService;

    public double calculateTotal(Order order) {

        return (order.getBasic() - discountService.applyDiscount(order.getBasic(), order.getDiscount()))
                + shippingService.shipment(order.getBasic());
    }
}
