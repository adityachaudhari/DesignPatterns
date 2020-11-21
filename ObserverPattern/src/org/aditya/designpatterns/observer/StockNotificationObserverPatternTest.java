package org.aditya.designpatterns.observer;

import org.aditya.designpatterns.observer.observers.impl.UpdateViaCall;
import org.aditya.designpatterns.observer.observers.impl.UpdateViaEmail;

public class StockNotificationObserverPatternTest {

    public static void main(String[] args) {
        System.out.println("****** Program Begin ****** ");

        // setting initial  product properties along with stock 0
        ProductModel productModel1 = new ProductModel();
        productModel1.setProductID("1111");
        productModel1.setProductName("iPhone7");
        productModel1.setProductStock(0);

        // adding observers to this product to get notified for new stock change.
        productModel1.registerObserver(new UpdateViaCall());
        productModel1.registerObserver(new UpdateViaEmail());

        // external services updating stock for this product by calling it method
        productModel1.updateStock(100);


    }
}
