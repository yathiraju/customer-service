package com.tech20.customerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @Value("${server.port}")
    String port ;

    @GetMapping("/getCustomername")
    public String getCustomerName() {
        return "raju : port :"+port+"";
    }

    @GetMapping("/orderPort")
    public String getOrderPort(){
        return customerService.getOrderPort();
    }




}
