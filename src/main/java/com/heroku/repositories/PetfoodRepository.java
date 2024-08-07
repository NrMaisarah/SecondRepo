package com.heroku.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

//import org.springframework.stereotype.Repository;
import com.heroku.java.models.Petfood;

import java.util.List;


public interface PetfoodRepository extends JpaRepository<Petfood, Integer> {
@Query("SELECT p FROM Petfood p WHERE p.inventoryID = :inventoryID")
    Petfood getPetFoodById(@Param("inventoryID") int inventoryID);

    @Query("SELECT p FROM Petfood p ORDER BY p.inventoryID")
    List<Petfood> getAllPetFoods();


}
