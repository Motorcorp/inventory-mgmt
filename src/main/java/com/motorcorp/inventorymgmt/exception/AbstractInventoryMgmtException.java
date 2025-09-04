package com.motorcorp.inventorymgmt.exception;

import lombok.Getter;
import lombok.NonNull;

@Getter
public class AbstractInventoryMgmtException extends RuntimeException{

    private final String messageKey;

    protected AbstractInventoryMgmtException(final @NonNull String messageKey, final @NonNull String message){
        super(message);
        this.messageKey =messageKey;
    }

    protected AbstractInventoryMgmtException(final @NonNull String messageKey, final @NonNull String message, Throwable throwable){
        super(message, throwable);
        this.messageKey =messageKey;
    }
}
