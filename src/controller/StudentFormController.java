package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class StudentFormController {
    public TextField txtStudentName;
    public TextField txtStudentAddress;
    public Label lblMassage;
    public Button btnHide;
    public Button btnShow;


    public void initialize(){
        txtStudentName.setDisable(true);
    }
    public void btnPrintStudentName(ActionEvent actionEvent) {
        String studentName = txtStudentName.getText();

        System.out.println(studentName);

        txtStudentName.clear();
        txtStudentName.setDisable(true);
        lblMassage.setText(studentName);
    }

    public void btnPrintStudentAdress(ActionEvent actionEvent) {
        String stidentAddress = txtStudentAddress.getText();

        txtStudentAddress.clear();
        txtStudentName.requestFocus();
    }


    public void btnHelloWorldOnAction(ActionEvent actionEvent) {
        String massage = "Hello "+txtStudentName.getText()+"!,Your Address is "+txtStudentAddress.getText()+".";
        System.out.println(massage);
        lblMassage.setText(massage);

    }

    public void btnAddStudentName(ActionEvent actionEvent) {
        txtStudentName.setDisable(false);
        txtStudentName.requestFocus();
    }

    public void btnHideOnAction(ActionEvent actionEvent) {
        lblMassage.setVisible(false);
        btnHide.setVisible(false);
        btnShow.setVisible(true);
    }

    public void btnShowOnAction(ActionEvent actionEvent) {
        lblMassage.setVisible(true);
        btnShow.setVisible(false);
        btnHide.setVisible(true);
    }
}
