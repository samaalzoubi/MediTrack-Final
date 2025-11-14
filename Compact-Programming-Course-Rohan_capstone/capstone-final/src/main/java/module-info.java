/**
 * Module descriptor for the Meditrack Capstone Application.
 * This explicitly defines which JavaFX modules are required and
 * opens the packages containing controllers and FXML files.
 */
module de.fhdo.sama.capstone {
    // 1. Required JavaFX Modules
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    // 2. Open packages for runtime access by JavaFX (CRITICAL)
    // The FXML loader needs access to instantiate the App and Controllers.
    opens de.fhdo.sama.capstone to javafx.fxml;
    
    // 3. Export the main application package
    exports de.fhdo.sama.capstone;
}