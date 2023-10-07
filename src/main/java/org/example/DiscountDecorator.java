package org.example;

public class DiscountDecorator implements Order{
    private Order order;
    private double discount;
    public DiscountDecorator(Order order, double discount){
        this.order = order;
        this.discount = discount;
    }

    @Override
    public double calculateTotal() {
        return order.calculateTotal() * (1 - discount);
    }
    @Override
    public String getDescription() {
        return order.getDescription() + ", Discount Applied";
    }
}
