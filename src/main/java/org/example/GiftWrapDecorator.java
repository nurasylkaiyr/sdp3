package org.example;

public class GiftWrapDecorator implements Order {
    private Order order;
    public GiftWrapDecorator(Order order) {
        this.order=order;
    }

    @Override
    public double calculateTotal() {
        return order.calculateTotal() + 5.0;
    }
    @Override
    public String getDescription() {
        return order.getDescription() + ", Gift Wrap";
    }
}
