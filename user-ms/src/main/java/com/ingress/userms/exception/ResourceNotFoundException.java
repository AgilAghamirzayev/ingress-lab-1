package com.ingress.userms.exception;

import com.ingress.userms.model.constants.ExceptionConstants;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class ResourceNotFoundException extends RuntimeException {

    private final String code;
    private final Integer httpStatus;

    public ResourceNotFoundException(ExceptionConstants exceptionConstants, HttpStatus httpStatus) {
        super(exceptionConstants.getMessage());
        this.code = exceptionConstants.getCode();
        this.httpStatus = httpStatus.value();
    }
}
