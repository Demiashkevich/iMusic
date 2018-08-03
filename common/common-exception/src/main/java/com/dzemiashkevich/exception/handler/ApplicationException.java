package com.dzemiashkevich.exception.handler;

public class ApplicationException extends RuntimeException {

    private final ApplicationErrorStatus applicationErrorStatus;

    public ApplicationException(ApplicationErrorStatus errorStatus, Object...parameters) {
        super(String.format(errorStatus.getErrorMessage(), parameters));
        this.applicationErrorStatus = errorStatus;
    }

    public ApplicationErrorStatus getApplicationErrorStatus() {
        return applicationErrorStatus;
    }
}
