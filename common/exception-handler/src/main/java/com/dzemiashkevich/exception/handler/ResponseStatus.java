package com.dzemiashkevich.exception.handler;

public class ResponseStatus {

    private String errorMessage;
    private String causeMessage;

    public ResponseStatus(Exception exception) {
        this.errorMessage = exception.getMessage();
        this.causeMessage = exception.getCause().getMessage();
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

}
