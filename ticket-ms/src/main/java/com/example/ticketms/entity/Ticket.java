package com.example.ticketms.entity;

import com.example.ticketms.entity.enums.TicketStatus;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tracingId;
    private Long userId;
    private Long orderId;
    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "ticket_details_id")
    private TicketDetails ticketDetails;

    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
