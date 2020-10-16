package com.kodilla.good.patterns.challenges.allegro;


public class OrderDto {
    public User user;
    public Product product;
    public boolean isRented;

    public OrderDto (final User user, final Product product, final boolean isRented) {
        this.user = user;
        this.product = product;
        this.isRented = isRented;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isRented() {
        return isRented;
    }
}
