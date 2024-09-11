package com.desafio.desafio1.services;

import com.desafio.desafio1.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {

        Double fare = 0.0;
        if (order.getBasic() < 100.00) {
            fare = 20.00;
        } else if (order.getBasic() >= 200.00) {
            fare = 0.00;
        } else {
            fare = 12.00;
        }

        return fare;
    }


}
