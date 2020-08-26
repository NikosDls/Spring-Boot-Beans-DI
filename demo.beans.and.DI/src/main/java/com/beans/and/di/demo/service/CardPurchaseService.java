package com.beans.and.di.demo.service;

import org.springframework.stereotype.Component;

@Component("cardPurchaseService")
public class CardPurchaseService implements PurchaseService{

    @Override
    public String doThePurchase() {
        return "Starting transaction with Card";
    }
}
