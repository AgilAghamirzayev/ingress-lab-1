package com.example.ticketms.model.queue;

import com.example.ticketms.model.enums.CardType;
import com.example.ticketms.model.enums.CurrencyType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class OrderDetailMessage {
    private Long orderId;
    private CardType cardType;
    private CurrencyType currencyType;
    private String finCode;
    private String mobilNumber;
}
