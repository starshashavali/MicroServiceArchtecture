package com.tcs.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.feign.IOrderFeignClient;

@RestController
@RequestMapping("/placeOrder/api")
public class PlaceOrderRestController {

	@Autowired
	private IOrderFeignClient orderFeign;

	@GetMapping("/order")
	public String getOderPlace() {
		return orderFeign.getOrder();
	}

}
