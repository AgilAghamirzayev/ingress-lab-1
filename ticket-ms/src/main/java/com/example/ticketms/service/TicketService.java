package com.example.ticketms.service;

import com.example.ticketms.entity.Ticket;
import com.example.ticketms.entity.enums.TicketStatus;
import com.example.ticketms.mapping.TicketMapper;
import com.example.ticketms.model.queue.OrderDetailMessage;
import com.example.ticketms.repository.TicketRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Log4j2
@Service
@RequiredArgsConstructor
public class TicketService {

    private final TicketMapper ticketMapper = TicketMapper.INSTANCE;
    private final TicketRepository ticketRepository;

    public void createTicket(OrderDetailMessage orderDetailMessage) {

        Ticket ticket = ticketMapper.toTicketEntity(orderDetailMessage);
        ticket.setUserId(1L); // TODO: get from request header
        ticket.setTracingId(UUID.randomUUID().toString());
        ticket.setTicketStatus(TicketStatus.PENDING);

        ticketRepository.save(ticket);
    }
}
