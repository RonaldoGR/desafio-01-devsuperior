package com.devsuperior.desafio01.services;

import com.devsuperior.desafio01.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public Double shipment(Order order) {
        if (order.getBasic() < 100.00) return 20.00;
        if (order.getBasic() >= 100.00 && order.getBasic() <= 200.00) return 12.00;
        return 0.0;
    }
}
