package de.fhdo.sama.capstone.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Warehouse {
    private final String id;
    private final String name;
    private final Location location;
    private final List<Medicine> medicines = new ArrayList<>();

    public Warehouse(String id, String name, Location location) {
        this.id = id; this.name = name; this.location = location;
    }

    // copy-constructor helper
    public void addMedicine(Medicine m) { medicines.add(m); }
    public List<Medicine> getMedicines() { return medicines; }
    public String getId() { return id; }
    public String getName() { return name; }
    public Location getLocation() { return location; }

    public boolean removeMedicineByName(String name, int qty) {
        Optional<Medicine> opt = medicines.stream().filter(m -> m.getName().equals(name)).findFirst();
        if (opt.isEmpty()) return false;
        Medicine m = opt.get();
        if (m.getQuantity() < qty) return false;
        m.setQuantity(m.getQuantity() - qty);
        return true;
    }

    /**
     * Restocks an existing medicine in the warehouse by adding quantity.
     * @param medicineName Name of the medicine to restock
     * @param quantity Quantity to add
     * @return true if medicine was found and restocked, false otherwise
     */
    public boolean restockMedicine(String medicineName, int quantity) {
        Optional<Medicine> opt = medicines.stream().filter(m -> m.getName().equals(medicineName)).findFirst();
        if (opt.isEmpty()) return false;
        Medicine m = opt.get();
        m.setQuantity(m.getQuantity() + quantity);
        return true;
    }

    /**
     * Adds a new medicine to the warehouse stock.
     * @param medicine The medicine to add (warehouseId will be updated to this warehouse's ID)
     */
    public void addMedicineStock(Medicine medicine) {
        // Create a new medicine instance with this warehouse's ID
        Medicine stockMedicine = new Medicine(
            medicine.getId(),
            medicine.getName(),
            medicine.getQuantity(),
            medicine.getExpiryDate(),
            this.id, // Set warehouse ID to this warehouse
            medicine.getLocation(),
            medicine.getCategory(),
            medicine.getReorderPoint(),
            medicine.getUnitPrice()
        );
        medicines.add(stockMedicine);
    }

    /**
     * Finds a medicine by name in this warehouse.
     * @param medicineName Name of the medicine
     * @return Optional containing the medicine if found
     */
    public Optional<Medicine> findMedicineByName(String medicineName) {
        return medicines.stream().filter(m -> m.getName().equals(medicineName)).findFirst();
    }

    public String toDisplayString() {
        int total = medicines.stream().mapToInt(Medicine::getQuantity).sum();
        return name + " (" + total + " items)";
    }
}
