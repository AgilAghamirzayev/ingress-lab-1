package com.example.ticketms.model.response;

import com.example.ticketms.entity.TicketDetails;
import com.example.ticketms.entity.enums.TicketStatus;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class TicketResponse {
    private Long id;
    private UUID tracingId;
    private Long userId;
    private Long orderId;
    private TicketStatus ticketStatus;
    private TicketDetailsResponse ticketDetails;
}
