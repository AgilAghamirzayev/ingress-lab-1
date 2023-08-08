package com.ingress.orderms.model.request;

import com.ingress.orderms.entity.enums.CardType;
import com.ingress.orderms.entity.enums.CurrencyType;
import com.ingress.orderms.entity.enums.OrderStatus;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderRequest {
    private CardType cardType;
    private CurrencyType currencyType;
    private OrderStatus orderStatus;
}
