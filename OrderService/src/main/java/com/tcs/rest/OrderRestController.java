package com.tcs.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order/api")
public class OrderRestController {

	@GetMapping("/order")
	public String getOrder() {
		return "Order placed successfully...";
	}

}
