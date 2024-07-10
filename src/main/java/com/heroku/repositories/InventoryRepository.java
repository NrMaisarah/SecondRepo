package com.heroku.java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.heroku.java.models.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Integer> {
}