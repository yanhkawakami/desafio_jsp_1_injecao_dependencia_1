package com.desafio.injecaodependencia.services;

import com.desafio.injecaodependencia.entities.Order;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class BrazilShippingService implements ShippingService{
    @Override
    public Double shipment(Order order) {
        double basic = order.getBasic();

        if (basic < 100){
            return 20.0;
        } else if (basic > 100.00 && basic < 200.0) {
            return 12.0;
        }
        return 0.0;
    }
}
