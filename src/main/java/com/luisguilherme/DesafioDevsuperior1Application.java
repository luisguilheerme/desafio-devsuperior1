package com.luisguilherme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.luisguilherme.entities.Order;
import com.luisguilherme.services.OrderService;


@SpringBootApplication

public class DesafioDevsuperior1Application implements CommandLineRunner{
	
	
	@Autowired
	private OrderService orderService;		
	
	public static void main(String[] args) {
		SpringApplication.run(DesafioDevsuperior1Application.class, args);		

	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub		,
		Order order = new Order(1034, 150.0, 20.);
		
		
		System.out.print("Pedido código " + order.getCode() + "\n Valor total: " + orderService.total(order) );
	}

}	
