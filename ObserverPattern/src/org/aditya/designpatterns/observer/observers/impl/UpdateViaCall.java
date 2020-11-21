package org.aditya.designpatterns.observer.observers.impl;

import org.aditya.designpatterns.observer.Observer;
import org.aditya.designpatterns.observer.ProductData;

public class UpdateViaCall implements Observer {

    @Override
    public void update(ProductData productData) {
        System.out.println("updating stock notification sending via phone call , updated stock is : "+productData.getProductStock());
        stockUpdateCall();

    }

    public void stockUpdateCall() {
        System.out.println("Executing Stock update via call logic");
    }

    @Override
    public String toString() {
        return "Updating_via_call";
    }
}
