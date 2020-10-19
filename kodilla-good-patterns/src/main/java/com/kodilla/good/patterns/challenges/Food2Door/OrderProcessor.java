package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService, final OrderService orderService, final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getProducer(), orderRequest.getProductsOrdered(), orderRequest.getOrderTime());


        if (isOrdered) {
            informationService.inform(orderRequest.getProducer());
            orderRepository.createOrder(orderRequest.getProducer(), orderRequest.getProductsOrdered(), orderRequest.getOrderTime());
        }
        return new OrderDto(orderRequest.getProducer(), orderRequest.getProductsOrdered(), isOrdered, orderRequest.getOrderTime());
    }

}

