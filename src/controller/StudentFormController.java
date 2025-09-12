package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class StudentFormController {
    public TextField txtStudentName;
    public TextField txtStudentAddress;
    public Label lblMassage;


    public void btnPrintStudentName(ActionEvent actionEvent) {
        String studentName = txtStudentName.getText();

        System.out.println(studentName);

        txtStudentName.clear();
        txtStudentName.requestFocus();
    }

    public void btnPrintStudentAdress(ActionEvent actionEvent) {
        String stidentAddress = txtStudentAddress.getText();

        System.out.println(stidentAddress);
        txtStudentAddress.clear();
        txtStudentName.requestFocus();
    }


    public void btnHelloWorldOnAction(ActionEvent actionEvent) {
        String massage = "Hello "+txtStudentName.getText()+"!,Your Address is "+txtStudentAddress.getText()+".";
        System.out.println(massage);
        lblMassage.setText(massage);

    }
}
