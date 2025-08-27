package com.motorcorp.inventorymgmt.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "items")
@Getter
@Builder(toBuilder = true)
@ToString(exclude = "category")
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    private String id;
    private String itemName;
    private String description;
    private double price;
    private String status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
}
