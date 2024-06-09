package com.housedev.studyspringboot.order;

import org.springframework.stereotype.Service;

import com.housedev.studyspringboot.sharedServices.ShippingService;

@Service
public class OrderService {

    private ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total(OrderEntity orderDAO) {
        double basic = orderDAO.getBasic();

        double basicWithDiscount = basic - (basic * (orderDAO.getDiscount() / 100));
        
         return basicWithDiscount + shippingService.shipment(orderDAO);
    }

}
