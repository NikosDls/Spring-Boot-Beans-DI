package com.beans.and.di.demo.service;

import org.springframework.stereotype.Component;

@Component("paypalPurchaseService")
public class PaypalPurchaseService implements PurchaseService{

    @Override
    public String doThePurchase() {
        return "Starting transaction via PayPal";
    }
}
