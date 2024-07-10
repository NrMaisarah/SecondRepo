package com.heroku.java.models;

import jakarta.persistence.*;

@Entity
@Table(name = "inventory")
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inventory_id")
    private Integer inventoryID;

    @Column(name = "inventory_name")
    private String inventoryName;

    @Column(name = "inventory_category")
    private String inventoryCategory;

    @Column(name = "inventory_brand")
    private String inventoryBrand;

    @Column(name = "inventory_price")
    private Double inventoryPrice;

    @Column(name = "inventory_quantity_existing")
    private Integer inventoryQuantityExisting;

    @Column(name = "inventory_reorder_point")
    private Integer inventoryReorderPoint;

    @Column(name = "staff_id")
    private Integer staffID;

    // Constructors, getters, and setters

    public Inventory() {}

    // Getters and setters (keep your existing ones)

    // You might want to add a toString() method for debugging
    @Override
    public String toString() {
        return "Inventory{" +
                "inventoryID=" + inventoryID +
                ", inventoryName='" + inventoryName + '\'' +
                ", inventoryCategory='" + inventoryCategory + '\'' +
                ", inventoryBrand='" + inventoryBrand + '\'' +
                ", inventoryPrice=" + inventoryPrice +
                ", inventoryQuantityExisting=" + inventoryQuantityExisting +
                ", inventoryReorderPoint=" + inventoryReorderPoint +
                ", staffID=" + staffID +
                '}';
    }
}