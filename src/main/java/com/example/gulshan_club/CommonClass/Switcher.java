package com.example.gulshan_club.CommonClass;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Switcher {

    public static void switcher(Node sourceNode, String path, String fxmlFileName, String title) {
        try {
            FXMLLoader loader = new FXMLLoader(Switcher.class.getResource("/"+ path + "/" + fxmlFileName));
            Parent root = loader.load();

            Stage stage = (Stage) sourceNode.getScene().getWindow();
            stage.setTitle(title);
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

