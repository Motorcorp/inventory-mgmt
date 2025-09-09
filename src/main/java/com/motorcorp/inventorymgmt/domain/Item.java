package com.motorcorp.inventorymgmt.domain;

import lombok.Builder;
import lombok.Getter;

@Builder(toBuilder = true)
@Getter
public class Item {

    private String id;
    private String itemName;
    private String description;
    private double price;
    private String status;
}
