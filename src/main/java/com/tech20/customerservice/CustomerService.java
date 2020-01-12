package com.tech20.customerservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="order-service")
public interface CustomerService {

    @GetMapping("/order/orderPort")
    public String getOrderPort();
}
