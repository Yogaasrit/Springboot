package com.dependency_injection.dependency_injection.service;

import org.springframework.stereotype.Component;

@Component
public class SbiCreditCard implements CreditCard{
    @Override
    public String getCreditCardDetails() {
        return "SBI offering 1 year free credit card!!";
    }
}
