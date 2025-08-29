package com.qoormthon.empty_wallet.global.exception;

public abstract class CustomException extends RuntimeException {
    private final ErrorCode errorCode;

    public CustomException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public int getStatusCode() {
        return errorCode.getHttpStatus().value();
    }

    @Override
    public String getMessage() {
        return errorCode.getMessage();
    }

}
