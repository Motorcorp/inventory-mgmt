package com.motorcorp.inventorymgmt.presentation.rest.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class MessageDto {
    private final String messageCode;
    private final String messageText;
}
