package com.beans.and.di.demo.service;

import org.springframework.stereotype.Component;

@Component("bankPurchaseService")
public class BankPurchaseService implements PurchaseService{

    @Override
    public String doThePurchase() {
        return "Starting transaction via Bank";
    }
}
