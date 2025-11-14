# MediTrack-Capstone Project
Java-based AGV simulation for automating medicine delivery in hospitals. Includes real-time AGV monitoring, thread-safe inventory control, and autonomous battery management.
# Features
* End-to-end delivery simulation (Medicine → Warehouse → AGV → Hospital)

* Real-time AGV status & battery monitoring

* Autonomous battery management (auto-return to charge ≤30%)

* Thread-safe inventory control

* Warehouse restock UI and simple order processing

* Auditable, realtime event logging
# Quick Demo
1. Launch the Java app (App.java) on Eclipse IDE
2. Start a delivery: select Warehouse, Medicine, Quantity, Hospital, AGV.
3. Monitor AGV states, battery levels, and logs.
# Requirements 
* Java 11+
* JavaFX
* Maven or Gradle (optional)
# Project Structure

- src/main/java — models: AGV, Warehouse, Medicine, Hospital, Location

- src/main/java — controller: MediTrackController

- src/main/resources — medi_track_view.fxml, images, config

# Key Concepts
- Concurrency: ExecutorService + Platform.runLater()

- Thread-safe Inventory: synchronized blocks to avoid race conditions

- Battery Logic: AGVs auto-charge when ≤30% battery

- Logging: All events captured in the UI for traceability
# Screenshots
![109e7735-ad5b-45b1-bfab-fb11cab32694](https://github.com/user-attachments/assets/9b1aa028-4ec6-4f2a-bd8b-3f2019c33afa)
![90dd9369-9214-4594-9e6a-7a434e8292c7](https://github.com/user-attachments/assets/9bb98ef8-5628-4e16-96cd-2ce022479ab3)

# Authors
- Sama Al Zou'bi 7224312
- Mario Cyril 7224009
- Rohan Ramachandra 7223330
- Sanjana Joshi 7223329
