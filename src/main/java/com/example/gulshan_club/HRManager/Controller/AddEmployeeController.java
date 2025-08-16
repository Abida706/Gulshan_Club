package com.example.gulshan_club.HRManager.Controller;

import com.example.gulshan_club.CommonClass.Switcher;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;


public class AddEmployeeController
{
    @javafx.fxml.FXML
    private TextField salaryTextField;
    @javafx.fxml.FXML
    private TextField positionTextField;
    @javafx.fxml.FXML
    private TextField deptTextField;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TextField contactTextField;

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "HRManager", "HRManagerDashboard.fxml", "HR Manager Dashboard");
    }

    @javafx.fxml.FXML
    public void handleSubmitButton(ActionEvent actionEvent) {
        String name = nameTextField.getText().trim();
        String dept = deptTextField.getText().trim();
        String position = positionTextField.getText().trim();
        String salaryStr = salaryTextField.getText().trim();
        String contact = contactTextField.getText().trim();

        if (name.isEmpty() || dept.isEmpty() || position.isEmpty() || salaryStr.isEmpty() || contact.isEmpty()) {
            showAlert("All fields must be filled.");
            return;
        }

        double salary;
        try {
            salary = Double.parseDouble(salaryStr);
            if (salary < 0) {
                showAlert("Salary must be a positive numeric value.");
                return;
            }
        } catch (NumberFormatException e) {
            showAlert("Salary must be a valid number.");
            return;
        }

        showAlert("Employee added successfully!\n\nName: " + name
                + "\nDepartment: " + dept
                + "\nPosition: " + position
                + "\nSalary: " + salary
                + "\nContact: " + contact);

    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Add Employee");
        alert.setContentText(message);
        alert.showAndWait();
    }

}
