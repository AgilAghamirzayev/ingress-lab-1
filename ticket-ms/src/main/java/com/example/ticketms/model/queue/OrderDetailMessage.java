package com.example.ticketms.model.queue;

import com.example.ticketms.model.enums.CardType;
import com.example.ticketms.model.enums.CurrencyType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailMessage {
    private Long orderId;
    private CardType cardType;
    private CurrencyType currencyType;
    private String finCode;
    private String mobilNumber;
}
