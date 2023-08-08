package com.example.ticketms.queue;

import com.example.ticketms.model.queue.OrderDetailMessage;
import com.example.ticketms.service.TicketService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Log4j2
@Component
@RequiredArgsConstructor
public class MessageConsumer {

    private final TicketService ticketService;

    @RabbitListener(queues = {"${rabbitmq.queue.order.name}"})
    public void listener(OrderDetailMessage orderDetailMessage) {
        log.info("publishMessage.START");
        ticketService.createTicket(orderDetailMessage);
        log.info("publishMessage.END");
    }
}
