package com.example.ticketms.entity;


import com.example.ticketms.model.enums.CardType;
import com.example.ticketms.model.enums.CurrencyType;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ticket_details")
public class TicketDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private CardType cardType;
    @Enumerated(EnumType.STRING)
    private CurrencyType currencyType;
    private String finCode;
    private String mobilNumber;
}
