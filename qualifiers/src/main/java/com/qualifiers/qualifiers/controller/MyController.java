package com.qualifiers.qualifiers.controller;

import com.qualifiers.qualifiers.service.CreditCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private CreditCard creditCard;

    @Autowired
    public MyController(@Qualifier("hdfcCreditCard") CreditCard creditCard){
        this.creditCard = creditCard;
    }

    @GetMapping("/getCard")
    public String getCreditCardDetails(){
        return creditCard.getCreditCardDetails();
    }
}
