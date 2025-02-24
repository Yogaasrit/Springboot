package com.dependency_injection.dependency_injection.service;

import org.springframework.stereotype.Component;

@Component
public class AxisCreditCard implements CreditCard{
    @Override
    public String getCreditCardDetails() {
        return "Axis bank offers 2 years free card :)!!!";
    }
}
