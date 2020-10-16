package com.kodilla.good.patterns.challenges.allegro;


import java.time.LocalDateTime;

public class OrderService {
    public boolean order(final User user, final Product product, final LocalDateTime orderTime) {
        System.out.println("You " + user.getName() + " " + user.getSurname() + " purchased " + product.getProduct() + " on " + orderTime.getYear() + " " + orderTime.getMonth() + " " + orderTime.getDayOfMonth() + " at: " + orderTime.getHour() + "h " + orderTime.getMinute() + "m ");

        return true;
    }
}
