package com.lld.rest.orderservice.service;

import com.lld.rest.orderservice.domain.Order;

public interface OrderService {
    public Order saveOrder(Order order);
}
