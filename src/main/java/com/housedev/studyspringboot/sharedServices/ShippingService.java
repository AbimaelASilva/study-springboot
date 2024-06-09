package com.housedev.studyspringboot.sharedServices;

import org.springframework.stereotype.Service;

import com.housedev.studyspringboot.order.OrderEntity;

@Service
public class ShippingService {

    public double shipment(OrderEntity orderDAO) {

        final double basic = orderDAO.getBasic();
        double shipping = 0;

        if (basic < 100) {
            shipping = 20;
        } else if (basic < 200) {
            shipping = 12;
        }

        return shipping;
    }

}
