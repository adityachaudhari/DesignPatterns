package org.aditya.designpatterns.observer.observers.impl;

import org.aditya.designpatterns.observer.Observer;
import org.aditya.designpatterns.observer.ProductData;

public class UpdateViaEmail implements Observer {

    @Override
    public void update(ProductData productData) {
        System.out.println("updating stock notification sending via email, updated stock is : "+productData.getProductStock());
        stockUpdateEmail();

    }

    public void stockUpdateEmail() {
        System.out.println("Executing Stock update via email logic");
    }

    @Override
    public String toString() {
        return "updating_via_email";
    }
}
