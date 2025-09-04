package com.motorcorp.inventorymgmt.presentation.rest.controller;

import com.motorcorp.inventorymgmt.domain.Item;
import com.motorcorp.inventorymgmt.presentation.rest.UrlConstants;
import com.motorcorp.inventorymgmt.service.ItemService;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(UrlConstants.BASE_URL)
@AllArgsConstructor
public class ItemController {
    @NonNull
    private final ItemService itemService;

    @GetMapping("/{id}/item")
    public Item getItem(@NonNull @PathVariable("id") final String id){
        return itemService.getItemById(id);
    }


}
