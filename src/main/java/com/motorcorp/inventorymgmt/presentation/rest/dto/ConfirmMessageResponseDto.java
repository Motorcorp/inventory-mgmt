package com.motorcorp.inventorymgmt.presentation.rest.dto;

import lombok.Builder;

import java.util.List;

@Builder(toBuilder = true)
public class ConfirmMessageResponseDto {
    private final String applicationId;
    private final String requestStatus;
    private final List<MessageDto> messageDto;
}
