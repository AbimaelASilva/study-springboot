package com.housedev.studyspringboot.sharedServices;

import org.springframework.stereotype.Service;

import com.housedev.studyspringboot.order.OrderDAO;

@Service
public class ShippingService {

    public double shipment(OrderDAO orderDAO) {

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
