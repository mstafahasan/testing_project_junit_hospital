package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Doctor_dashboard_controller {

    private Doctor doctor;
    HelloController h = new HelloController();

    @FXML
    private Button ViewMedicalRecordsButton;

    @FXML
    private Text id_text;

    @FXML
    private Button signOutButton;

    @FXML
    private Button viewAppointmentsButton;

    @FXML
    private Button CreateMedicalRecordsButton;

    @FXML
    private Button Manage_InventoryItems;


    @FXML
    void onSignOut(ActionEvent event) {
        h.got_to(signOutButton,"login_form.fxml",null,null);
    }

    @FXML
    void onViewAppointments(ActionEvent event) {

    }

    @FXML
    void onViewMedicalRecords(ActionEvent event) {

    }

    @FXML
    public void onManage_InventoryItems(){

    }

    @FXML
    public void setCreateMedicalRecordsButton(){
        h.got_to(CreateMedicalRecordsButton,"create_medicalrecord.fxml",null,doctor);
    }


    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

}

