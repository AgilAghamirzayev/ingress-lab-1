package com.ingress.orderms.model.queue;

import com.ingress.orderms.entity.enums.CardType;
import com.ingress.orderms.entity.enums.CurrencyType;
import lombok.*;

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
