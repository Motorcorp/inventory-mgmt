package com.motorcorp.inventorymgmt.service;

import com.motorcorp.inventorymgmt.domain.Item;
import com.motorcorp.inventorymgmt.exception.NotFoundException;
import com.motorcorp.inventorymgmt.presentation.rest.UrlConstants;
import com.motorcorp.inventorymgmt.repository.ItemRepository;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class ItemService {

    @NonNull
    private final ItemRepository itemRepository;

    @Transactional(readOnly = true)
    public Item getItemById(@NonNull final String id){

        return mapItem(itemRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(UrlConstants.ITEM_NOT_FOUND,"item: "+id+ " not found")));



    }

    private final Item mapItem(@NonNull final com.motorcorp.inventorymgmt.entities.Item item){
        return Item.builder()
                .id(item.getId())
                .itemName(item.getItemName())
                .description(item.getDescription())
                .price(item.getPrice())
                .status(item.getStatus())
                .build();
    }
}
