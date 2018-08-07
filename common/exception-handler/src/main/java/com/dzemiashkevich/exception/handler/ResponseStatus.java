package com.dzemiashkevich.exception.handler;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.ObjectUtils;

public class ResponseStatus {

    private String errorMessage;
    private String causeMessage;

    public ResponseStatus(Exception exception) {
        this.errorMessage = exception.getMessage();
        this.causeMessage = extractCausedMessage(exception);
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getCauseMessage() {
        return causeMessage;
    }

    public void setCauseMessage(String causeMessage) {
        this.causeMessage = causeMessage;
    }

    private String extractCausedMessage(Exception exception) {
        Throwable cause = exception.getCause();
        if (!ObjectUtils.isEmpty(cause)) {
            return cause.getMessage() == null ? StringUtils.EMPTY : cause.getMessage();
        }
        return StringUtils.EMPTY;
    }

}
