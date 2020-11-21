package org.aditya.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ProductModel implements Subject {
    String productID;
    String productName;
    int productStock;
    List<Observer> stockObserversList = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        stockObserversList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        stockObserversList.remove(o);

    }

    @Override
    public void notifyObservers() {

        if (!(stockObserversList.isEmpty())) {

            System.out.println("Publishing updated stock to this observers list "+getStockObserversList().toString());

            for (Observer o : stockObserversList) {
                ProductData productData = new ProductData();
                productData.setProductStock(this.productStock);
                o.update(productData);
            }
        }

    }

    public void updateStock(int updatedQuantity) {
        System.out.println("Updating Product quantity from " + getProductStock() + " to " + updatedQuantity);

        this.productStock = updatedQuantity;
        notifyObservers();
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductStock() {
        return productStock;
    }

    protected void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public List<Observer> getStockObserversList() {
        return stockObserversList;
    }

}
