package com.example.ticketms.mapping;

import com.example.ticketms.entity.Ticket;
import com.example.ticketms.model.queue.OrderDetailMessage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TicketMapper {
    TicketMapper INSTANCE = Mappers.getMapper(TicketMapper.class);


    @Mapping(target = "ticketDetails.finCode", source = "finCode")
    @Mapping(target = "ticketDetails.mobilNumber", source = "mobilNumber")
    @Mapping(target = "ticketDetails.cardType", source = "cardType")
    @Mapping(target = "ticketDetails.currencyType", source = "currencyType")
    Ticket toTicketEntity(OrderDetailMessage orderDetailMessage);
}
