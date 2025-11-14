package de.fhdo.sama.capstone;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/medi_track_view.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("MediTrack");

            // show real full-screen (exit hint available)
            primaryStage.setFullScreenExitHint("Welcome to MediTrack");
            primaryStage.setFullScreenExitKeyCombination(KeyCombination.keyCombination("ESCAPE"));
            primaryStage.setFullScreen(true);

            primaryStage.show();

            // ensure the stage is front and focused (avoid being backgrounded)
            Platform.runLater(() -> {
                primaryStage.toFront();
                primaryStage.requestFocus();
            });

        } catch (IOException e) {
            System.err.println("Failed to load MeditrackView FXML.");
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("An error occurred during application startup.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}