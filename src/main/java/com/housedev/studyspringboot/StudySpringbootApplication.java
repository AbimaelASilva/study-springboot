package com.housedev.studyspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.housedev.studyspringboot.order.OrderDAO;
import com.housedev.studyspringboot.order.OrderService;
import com.housedev.studyspringboot.sharedServices.ShippingService;

@SpringBootApplication
public class StudySpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudySpringbootApplication.class, args);
		printTotal();
	}

	public static void printTotal() {

		// OrderDAO(double code, double basic, double discount) 
		OrderDAO order = new OrderDAO(1034, 95.90, 0);
		OrderService orderService = new OrderService(new ShippingService());
		System.out.println("Total: " + orderService.total(order));
	}

}
