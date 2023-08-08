package com.ingress.orderms.controller;

import com.ingress.orderms.model.request.OrderRequest;
import com.ingress.orderms.model.response.OrderResponse;
import com.ingress.orderms.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/orders")
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void saveUser(@RequestBody OrderRequest orderRequest) {
        orderService.createOrder(orderRequest);
    }

    @GetMapping("/{user-id}")
    @ResponseStatus(HttpStatus.OK)
    public List<OrderResponse> getOrders(@PathVariable("user-id") Long userId) {
        return orderService.getOrdersByUserId(userId);
    }
}
