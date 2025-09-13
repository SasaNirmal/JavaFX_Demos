package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TeacherFormController {
    public TextField txtTeacherName;
    public TextField txtTeacherAddress;
    public TextField txtTeachSubject;
    public Label lblMassage;

    public void btnPrintMassageOnAction(ActionEvent actionEvent) {
        String massage = "Hello "+txtTeacherName.getText()+".Your Next Class is Grade 6 "+txtTeachSubject.getText();

        lblMassage.setText(massage);
        txtTeacherAddress.clear();
        txtTeachSubject.clear();
        txtTeacherName.clear();
        txtTeacherName.requestFocus();
    }
}
