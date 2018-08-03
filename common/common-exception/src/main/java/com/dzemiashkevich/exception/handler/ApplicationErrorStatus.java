package com.dzemiashkevich.exception.handler;

import org.springframework.http.HttpStatus;

public enum ApplicationErrorStatus {

    ENTITY_NOT_FOUND(HttpStatus.NOT_FOUND, "The %s with id %s not found in database"),
    ENTITY_NOT_SAVED(HttpStatus.INTERNAL_SERVER_ERROR, "The %s with id %s not saved in database");

    private HttpStatus statusCode;
    private String errorMessage;

    ApplicationErrorStatus(HttpStatus statusCode, String errorMessage) {
        this.statusCode = statusCode;
        this.errorMessage = errorMessage;
    }

    public HttpStatus getStatusCode() {
        return statusCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

}
