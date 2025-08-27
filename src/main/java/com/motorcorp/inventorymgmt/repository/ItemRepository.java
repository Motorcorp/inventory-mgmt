package com.motorcorp.inventorymgmt.repository;

import com.motorcorp.inventorymgmt.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, String> {
}
