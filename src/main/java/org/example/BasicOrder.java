package org.example;

public class BasicOrder implements Order{
    private double price;
    private String description;
    public BasicOrder(double price, String description){
        this.price=price;
        this.description=description;
    }

    @Override
    public double calculateTotal(){
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
