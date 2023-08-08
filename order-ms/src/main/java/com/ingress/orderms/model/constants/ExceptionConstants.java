package com.ingress.orderms.model.constants;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ExceptionConstants {

    UNEXPECTED_EXCEPTION("UNEXPECTED_EXCEPTION", "Unexpected exception occurred"),
    ORDER_NOT_FOUND("ORDER_NOT_FOUND", "Order not found"),
    ;

    private final String code;
    private final String message;
}