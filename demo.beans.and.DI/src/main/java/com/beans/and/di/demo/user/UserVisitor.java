package com.beans.and.di.demo.user;

import com.beans.and.di.demo.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("userVisitor")
@PropertySource("file:src\\user.properties")
public class UserVisitor implements Visitor{

    @Value("${user1.username}")
    private String username;

    @Value("${user1.email}")
    private String email;

    private PurchaseService purchaseService;

    // constructor injection
    @Autowired
    public UserVisitor(@Qualifier("paypalPurchaseService") PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    @Override
    public String whatAmI() {
        return "I'm signed user";
    }

    @Override
    public String doThePurchase() {
        return purchaseService.doThePurchase();
    }

    @Override
    public String toString() {
        return "UserVisitor{" +
                "username='" + username + '\'' +
                ", password='" + email + '\'' +
                '}';
    }
}
