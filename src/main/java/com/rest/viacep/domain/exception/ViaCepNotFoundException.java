package com.rest.viacep.domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ViaCepNotFoundException extends RuntimeException {

    public ViaCepNotFoundException(String msg) {
        super(msg);
    }
}
