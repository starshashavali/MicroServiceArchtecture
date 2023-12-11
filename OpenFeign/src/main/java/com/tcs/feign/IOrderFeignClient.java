package com.tcs.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "ORDERSERVICE")
public interface IOrderFeignClient {

	@GetMapping("/order/api/order")
	public String getOrder();

}
