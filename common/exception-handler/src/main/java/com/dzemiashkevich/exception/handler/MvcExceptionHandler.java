package com.dzemiashkevich.exception.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.web.util.WebUtils;

@ControllerAdvice
public class MvcExceptionHandler extends ResponseEntityExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(MvcExceptionHandler.class);

    @ExceptionHandler(value = ApplicationException.class)
    public ResponseEntity handleException(ApplicationException exception, WebRequest webRequest) {
        ResponseStatus responseStatus = new ResponseStatus(exception);
        HttpStatus httpStatus = exception.getApplicationErrorStatus().getStatusCode();
        LOGGER.error("{} caught an ApplicationException: {}, response code: {}", MvcExceptionHandler.class.getSimpleName(), exception.getMessage(), exception.getApplicationErrorStatus());
        return handleExceptionInternal(exception, responseStatus, null, httpStatus, webRequest);
    }

    @Override
    protected ResponseEntity<Object> handleExceptionInternal(Exception exception,
                                                             Object body,
                                                             HttpHeaders headers,
                                                             HttpStatus status,
                                                             WebRequest request) {
        if (HttpStatus.INTERNAL_SERVER_ERROR.equals(status)) {
            request.setAttribute(WebUtils.ERROR_EXCEPTION_ATTRIBUTE, exception, WebRequest.SCOPE_REQUEST);
        }
        return new ResponseEntity<>(new ResponseStatus(exception), headers, status);
    }

}
