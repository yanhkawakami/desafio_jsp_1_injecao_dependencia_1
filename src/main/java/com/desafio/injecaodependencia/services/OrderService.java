package com.desafio.injecaodependencia.services;

import com.desafio.injecaodependencia.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total(Order order){
        double basic = order.getBasic();
        double discount = order.getDiscount();

        return (basic - (basic * (discount/100))) + shippingService.shipment(order);
    }
}
