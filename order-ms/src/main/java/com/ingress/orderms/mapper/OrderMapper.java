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
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    Order mapToOrderEntity(OrderRequest orderRequest);


    List<OrderResponse> mapToOrderResponseList(List<Order> order);

    @Mapping(target = "orderId", source = "id")
    @Mapping(target = "orderStatus", source = "orderStatus")
    @Mapping(target = "cardType", source = "cardType")
    @Mapping(target = "currencyType", source = "currencyType")
    @Mapping(target = "finCode", source = "userDetails.finCode")
    @Mapping(target = "mobilNumber", source = "userDetails.mobilNumber")
    OrderDetailMessage mapToOrderDetailsMessage(Order savedOrder, OrderRequest orderRequest);
}
