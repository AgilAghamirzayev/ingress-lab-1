package com.example.ticketms.mapping;

import com.example.ticketms.entity.Ticket;
import com.example.ticketms.model.queue.OrderDetailMessage;
import com.example.ticketms.model.response.TicketResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TicketMapper {

    @Mapping(target = "ticketDetails.finCode", source = "finCode")
    @Mapping(target = "ticketDetails.mobilNumber", source = "mobilNumber")
    @Mapping(target = "ticketDetails.cardType", source = "cardType")
    @Mapping(target = "ticketDetails.currencyType", source = "currencyType")
    Ticket toTicketEntity(OrderDetailMessage orderDetailMessage);

    List<TicketResponse> toTicketResponseList(List<Ticket> tickets);
}
