package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class TeacherFormController {
    public TextField txtTeacherName;
    public TextField txtTeacherAddress;
    public TextField txtTeachSubject;
    public Label lblMassage;
    public AnchorPane rootTeacherForm;

    public void btnPrintMassageOnAction(ActionEvent actionEvent) {
        String massage = "Hello "+txtTeacherName.getText()+".Your Next Class is Grade 6 "+txtTeachSubject.getText();

        lblMassage.setText(massage);
        txtTeacherAddress.clear();
        txtTeachSubject.clear();
        txtTeacherName.clear();
        txtTeacherName.requestFocus();
    }

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("../view/DashBoard.fxml"));
        Scene daschBoardScene = new Scene(parent);

        Stage primaryStage = (Stage) this.rootTeacherForm.getScene().getWindow();

        primaryStage.setScene(daschBoardScene);
        primaryStage.setTitle("Dash Board Form");
        primaryStage.centerOnScreen();
    }
}
