package com.luisguilherme.services;

import org.springframework.stereotype.Service;
import com.luisguilherme.entities.Order;

@Service
public class ShippingService {	

	
	public Double shipment(Order order) {
		
		Double total = order.getBasic();
		Double shipingCost = 0.0;
		
		if(total < 100.0) {
			shipingCost = 20.0;
		}
		else if(total < 200.0) {
			shipingCost = 12.0;
		}
		
		return shipingCost;
		
	}

}
