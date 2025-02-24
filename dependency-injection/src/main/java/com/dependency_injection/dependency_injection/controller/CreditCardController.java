package com.dependency_injection.dependency_injection.controller;

import com.dependency_injection.dependency_injection.service.AxisCreditCard;
import com.dependency_injection.dependency_injection.service.HdfcCreditCard;
import com.dependency_injection.dependency_injection.service.SbiCreditCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditCardController {

    private final HdfcCreditCard hdfcCreditCard;
    private AxisCreditCard axisCreditCard;

    // Constructor injection - Recommended
    @Autowired
    public CreditCardController(HdfcCreditCard hdfcCreditCard){
        this.hdfcCreditCard = hdfcCreditCard;
    }

    //Setter injection - Recommended
    @Autowired
    public void setAxisCreditCard(AxisCreditCard axisCreditCard){
        this.axisCreditCard = axisCreditCard;
    }

    //Field injection - Not recommended(Hard for Unit testing)
    @Autowired
    SbiCreditCard sbiCreditCard;

    @GetMapping("/getHdfcCard")
    public String getCreditCardDetails(){
        return hdfcCreditCard.getCreditCardDetails();
    }

    @GetMapping("/getAxisCard")
    public String getAxisCreditCardDetails(){
        return axisCreditCard.getCreditCardDetails();
    }

    @GetMapping("/getSbiCard")
    public String getSbiCreditCardDetails(){
        return sbiCreditCard.getCreditCardDetails();
    }
}
