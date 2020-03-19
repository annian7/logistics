package ren.annian.logistics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ren.annian.logistics.entity.Customer;
import ren.annian.logistics.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService service;

    @RequestMapping(value = "/customers")
    public Customer getCustomerById(String id){
        Customer customer = service.getCustomerById(id);
        return customer;
    }

    @RequestMapping("/customer")
    public String testCustomer(){
        System.out.println("customer");
        return "ok";
    }
}
