package com.motorcorp.inventorymgmt.presentation.rest.dto;

import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ConfirmMessageFactory {
    private final static String applicationId ="inventory-mgmt";
    private final MessageSource messageSource;

    public ConfirmMessageResponseDto createConfirmMessage(final String requestStatus, final String messageCode, final String messageText){
        return ConfirmMessageResponseDto.builder()
                .applicationId(applicationId)
                .requestStatus(requestStatus)
                .messageDto(List.of(buildMessage(messageCode,messageText)))
                .build();
    }

    private MessageDto buildMessage(final String messageCode, final String messageText){
        return MessageDto.builder()
                .messageCode(messageSource.getMessage(messageCode,null, LocaleContextHolder.getLocale()))
                .build();
    }
}
