package de.fhdo.sama.capstone.model;

import java.time.LocalDate;

public class Medicine {
    private String id;
    private String name;
    private int quantity;
    private LocalDate expiryDate;
    private String warehouseId;
    private String location;
    private String category;
    private int reorderPoint;
    private double unitPrice;

    public Medicine(String id, String name, int quantity, LocalDate expiryDate, String warehouseId, String location, String category, int reorderPoint, double unitPrice) {
        this.id = id; this.name = name; this.quantity = quantity; this.expiryDate = expiryDate; this.warehouseId = warehouseId;
        this.location = location; this.category = category; this.reorderPoint = reorderPoint; this.unitPrice = unitPrice;
    }

    // copy constructor
    public Medicine(Medicine other) {
        this(other.id, other.name, other.quantity, other.expiryDate, other.warehouseId, other.location, other.category, other.reorderPoint, other.unitPrice);
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public LocalDate getExpiryDate() { return expiryDate; }
    public String getWarehouseId() { return warehouseId; }
    public String getLocation() { return location; }
    public String getCategory() { return category; }
    public int getReorderPoint() { return reorderPoint; }
    public double getUnitPrice() { return unitPrice; }
}
