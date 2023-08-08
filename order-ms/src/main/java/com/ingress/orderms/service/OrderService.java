package com.ingress.orderms.service;

import com.ingress.orderms.entity.Order;
import com.ingress.orderms.entity.enums.OrderStatus;
import com.ingress.orderms.mapper.OrderMapper;
import com.ingress.orderms.model.queue.OrderDetailMessage;
import com.ingress.orderms.model.request.OrderRequest;
import com.ingress.orderms.model.response.OrderResponse;
import com.ingress.orderms.queue.MessagePublisher;
import com.ingress.orderms.repository.OrderRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
public class OrderService {

    @Value("${rabbitmq.queue.order.name}")
    private String orderCreateQ;

    private final OrderMapper orderMapper = OrderMapper.INSTANCE;

    private final OrderRepository orderRepository;

    private final MessagePublisher messagePublisher;


    @Transactional
    public void createOrder(OrderRequest orderRequest) {
        Order order = orderMapper.mapToOrderEntity(orderRequest);
        order.setUserId(1L); //TODO: get user id from request-header
        order.setOrderStatus(OrderStatus.CREATED);
        Order savedOrder = orderRepository.save(order);

        OrderDetailMessage orderDetailMessage = orderMapper.mapToOrderDetailsMessage(savedOrder, orderRequest);
        log.info("OrderDetailMessage: {}", orderDetailMessage);

        messagePublisher.publishMessage(orderCreateQ, orderDetailMessage);
    }

    public OrderResponse getOrdersByUserId(Long userId) {
        List<Order> order = orderRepository.findAllByUserId(userId);
        return orderMapper.mapToOrderResponseList(order);
    }

}
