package com.example.demo1;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class PatientRegistrationController {

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtPhone;

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtAge;

    @FXML
    private ComboBox<String> gender;

    @FXML
    private Button btnSignUp;



    @FXML
    private void Register() {
        String name = txtName.getText();
        String phone = txtPhone.getText();
        String address = txtAddress.getText();
        String ageText = txtAge.getText();
        String Gender = gender.getValue();

        // Validate input
        if (name.isEmpty() || phone.isEmpty() || address.isEmpty() || ageText.isEmpty() || Gender.isEmpty()) {
            showAlert("Error", "All fields are required", "Please fill in all the fields.");
            return;
        }

        int age;
        try {
            age = Integer.parseInt(ageText);
            if (age <= 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            showAlert("Error", "Invalid Age", "Please enter a valid age as a positive integer.");
            return;
        }

        Patient newPatient = new Patient(name, age, Gender, phone, address);

    }


    private void showAlert(String title, String header, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }



}