package com.motorcorp.inventorymgmt.repository;

import com.motorcorp.inventorymgmt.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, String> {
}
