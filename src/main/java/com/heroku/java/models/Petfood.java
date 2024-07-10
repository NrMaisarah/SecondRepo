package com.heroku.java.models;

import jakarta.persistence.*;

@Entity
@Table(name = "petfood")
@PrimaryKeyJoinColumn(name = "inventory_id")
public class Petfood extends Inventory {

    @Column(name = "food_weight")
    private Double foodWeight;

    @Column(name = "quantity_in")
    private Integer quantityIn;

    @Column(name = "food_type")
    private String foodType;

    // Constructors

    public Petfood() {
        super();
    }

    // Getters and setters

    public Double getFoodWeight() {
        return foodWeight;
    }

    public void setFoodWeight(Double foodWeight) {
        this.foodWeight = foodWeight;
    }

    public Integer getQuantityIn() {
        return quantityIn;
    }

    public void setQuantityIn(Integer quantityIn) {
        this.quantityIn = quantityIn;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    
    
}