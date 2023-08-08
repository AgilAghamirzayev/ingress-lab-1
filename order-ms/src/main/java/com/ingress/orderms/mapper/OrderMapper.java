package com.ingress.orderms.mapper;

import com.ingress.orderms.entity.Order;
import com.ingress.orderms.model.queue.OrderDetailMessage;
import com.ingress.orderms.model.request.OrderRequest;
import com.ingress.orderms.model.response.OrderResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    Order mapToOrderEntity(OrderRequest orderRequest);


    List<OrderResponse> mapToOrderResponseList(List<Order> order);

    @Mapping(target = "cardType", source = "orderRequest.cardType")
    @Mapping(target = "currencyType", source = "orderRequest.currencyType")
    @Mapping(target = "finCode", source = "orderRequest.finCode")
    @Mapping(target = "mobilNumber", source = "orderRequest.mobilNumber")
    OrderDetailMessage mapToOrderDetailsMessage(OrderRequest orderRequest, Long orderId);
}
