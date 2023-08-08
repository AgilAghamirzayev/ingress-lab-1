package com.example.ticketms.model.response;

import com.example.ticketms.entity.enums.TicketStatus;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Builder
@EqualsAndHashCode
public class TicketResponse {
    private Long id;
    private UUID tracingId;
    private Long userId;
    private Long orderId;
    private TicketStatus ticketStatus;
}
