package com.beans.and.di.demo.user;

import com.beans.and.di.demo.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("nonUserVisitor")
public class NonUserVisitor implements Visitor{

    // field injection
    @Autowired
    @Qualifier("cardPurchaseService")
    private PurchaseService purchaseService;

    @Override
    public String whatAmI() {
        return "I'm just a visitor";
    }

    @Override
    public String doThePurchase() {
        return purchaseService.doThePurchase();
    }
}
