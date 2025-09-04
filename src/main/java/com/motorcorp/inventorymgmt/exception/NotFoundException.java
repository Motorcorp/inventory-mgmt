package com.motorcorp.inventorymgmt.exception;

public class NotFoundException extends AbstractInventoryMgmtException{

    public NotFoundException(final String messageKey, final String message) {
        super(messageKey,message);
    }

}
