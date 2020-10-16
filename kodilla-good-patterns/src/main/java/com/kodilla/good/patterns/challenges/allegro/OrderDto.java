package com.kodilla.good.patterns.challenges.allegro;


public class OrderDto {
    private final User user;
    private final Product product;
    private final boolean isOrdered;

    public OrderDto (final User user, final Product product, final boolean isOrdered) {
        this.user = user;
        this.product = product;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
