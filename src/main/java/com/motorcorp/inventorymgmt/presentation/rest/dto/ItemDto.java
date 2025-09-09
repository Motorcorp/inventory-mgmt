package com.motorcorp.inventorymgmt.presentation.rest.dto;

import lombok.NonNull;
import lombok.Value;

@Value(staticConstructor = "of")
public class ItemDto {

    @NonNull
    private String id;

    @NonNull
    private String itemName;

    private String description;

    @NonNull
    private Double price;

    @NonNull
    private String status;


}
