package com.ingress.orderms.model.response;

import com.ingress.orderms.entity.enums.OrderStatus;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderResponse {
    private Long id;
    private OrderStatus orderStatus;
}
