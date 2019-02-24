package com.customer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {

    @RequestMapping(name = "/customer" ,method = RequestMethod.GET)
    public String customersPage(){
        return "request";
    }

}
