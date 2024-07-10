package com.heroku.java.models;

import javax.persistence.*;

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

    // You might want to add a toString() method for debugging
    @Override
    public String toString() {
        return "Petfood{" +
                "inventoryID=" + getInventoryID() +
                ", inventoryName='" + getInventoryName() + '\'' +
                ", inventoryCategory='" + getInventoryCategory() + '\'' +
                ", inventoryBrand='" + getInventoryBrand() + '\'' +
                ", inventoryPrice=" + getInventoryPrice() +
                ", inventoryQuantityExisting=" + getInventoryQuantityExisting() +
                ", inventoryReorderPoint=" + getInventoryReorderPoint() +
                ", staffID=" + getStaffID() +
                ", foodWeight=" + foodWeight +
                ", quantityIn=" + quantityIn +
                ", foodType='" + foodType + '\'' +
                '}';
    }
}