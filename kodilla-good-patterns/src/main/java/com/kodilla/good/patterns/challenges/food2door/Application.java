package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.domain.OrderProcessor;
import com.kodilla.good.patterns.challenges.food2door.api.OrderRequest;
import com.kodilla.good.patterns.challenges.food2door.domain.OrderService;
import com.kodilla.good.patterns.challenges.food2door.infrastructure.InformationService;
import com.kodilla.good.patterns.challenges.food2door.infrastructure.OrderRepository;
import com.kodilla.good.patterns.challenges.food2door.infrastructure.OrderRequestRetriever;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

       OrderProcessor orderProcessor = new OrderProcessor(new InformationService(), new OrderService(), new OrderRepository());
       orderProcessor.process(orderRequest);


    }
}
