package com.devsuperior.desafio01.services;

import com.devsuperior.desafio01.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private ShippingService shipping;

    public Double total(Order order) {
        return (order.getBasic() - order.getDiscount()) + this.shipping.shipment(order);
    }
}
