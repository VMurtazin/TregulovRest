package com.tregulov.spring.rest.controller;


import com.tregulov.spring.rest.service.EmoloyeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRESTController {

    @Autowired
    private EmoloyeeService emoloyeeService;


}
