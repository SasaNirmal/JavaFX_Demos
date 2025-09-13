package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class StudentFormController {
    public TextField txtStudentName;
    public TextField txtStudentAddress;
    public Label lblMassage;
    public Button btnHide;
    public Button btnShow;
    public AnchorPane rootStudentForm;


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

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../view/DashBoard.fxml"));
        Scene dashBoardScene = new Scene(parent);

        Stage primaryStage = (Stage) this.rootStudentForm.getScene().getWindow();

        primaryStage.setScene(dashBoardScene);
        primaryStage.setTitle("Dash Board Form");
        primaryStage.centerOnScreen();
    }
}
