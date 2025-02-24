package com.dependency_injection.dependency_injection.service;

import org.springframework.stereotype.Component;

@Component
public class HdfcCreditCard implements CreditCard{
    @Override
    public String getCreditCardDetails() {
        return "HDFC offering lifetime credit card!!!";
    }
}
