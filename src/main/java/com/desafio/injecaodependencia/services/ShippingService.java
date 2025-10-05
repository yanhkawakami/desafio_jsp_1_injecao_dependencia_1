package com.desafio.injecaodependencia.services;

import com.desafio.injecaodependencia.entities.Order;
import org.springframework.stereotype.Service;

@Service
public interface ShippingService {
    public Double shipment(Order order);
}
