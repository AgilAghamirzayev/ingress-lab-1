package com.ingress.authenticationms.exception.handler;

import com.ingress.authenticationms.model.constants.ExceptionConstants;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ExceptionResponse {
    private String code;
    private String message;

    public ExceptionResponse(ExceptionConstants exceptionConstants) {
        this.code = exceptionConstants.getCode();
        this.message = exceptionConstants.getMessage();
    }
}
