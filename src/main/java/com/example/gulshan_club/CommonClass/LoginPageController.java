package com.example.gulshan_club.CommonClass;

import com.example.gulshan_club.CommonClass.Switcher;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginPageController
{
    @javafx.fxml.FXML
    private TextField enterIdTextField;
    @javafx.fxml.FXML
    private PasswordField enterPasswordPasswordField;

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void handleLoginButton(ActionEvent actionEvent) {

        String id = enterIdTextField.getText().trim();
        String password = enterPasswordPasswordField.getText().trim();

        if (id.isEmpty() || password.isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("Field can not be empty");

            alert.showAndWait();


        }else if (id.equals("mar1002")&& password.equals("1234")) {
            Switcher.switcher((Node) actionEvent.getSource(), "Marketing_Manager", "Marketing_Manager_Dashboard.fxml", "Marketing_Manager_Dashboard");


        } else if (id.equals("ser1002")&& password.equals("1234")) {
            Switcher.switcher((Node) actionEvent.getSource(), "Security_Supervisor", "Security_Supervisor_Dashboard.fxml", "Security_Supervisor_Dashboard");


        } else if (id.equals("eve1002")&& password.equals("1234")) {
            Switcher.switcher((Node) actionEvent.getSource(), "Event_Coordinator", "Event_Coordinator_Dashboard.fxml", "Event_Coordinator_Dashboard");


        } else if (id.equals("man1002")&& password.equals("1234")) {
            Switcher.switcher((Node) actionEvent.getSource(), "Club_Manager", "Club_Manager_Dashboard.fxml", "Club_Manager_Dashboard");


        }

        else {
            Alert erroralert = new Alert(Alert.AlertType.ERROR);
            erroralert.setTitle("Error");
            erroralert.setContentText("Wrong password");

            erroralert.showAndWait();

        }
    }
}