package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashBoardController {
    public AnchorPane root;

    public void btnStuentFormOnAction(ActionEvent actionEvent) throws IOException {
        Parent Parent = FXMLLoader.load(this.getClass().getResource("../view/StudentForm.fxml"));
        Scene StudentFormScene = new Scene(Parent);

        Stage primaaryStage = (Stage) this.root.getScene().getWindow();

        primaaryStage.setScene(StudentFormScene);
        primaaryStage.setTitle("Student Form");
        primaaryStage.centerOnScreen();
    }

    public void btnTeaccherFormAction(ActionEvent actionEvent) throws IOException {
        Parent Parent = FXMLLoader.load(this.getClass().getResource("../view/TeacherForm.fxml"));
        Scene TeacherFormScene = new Scene(Parent);

        Stage primaaryStage = (Stage) this.root.getScene().getWindow();

        primaaryStage.setScene(TeacherFormScene);
        primaaryStage.setTitle("Student Form");
        primaaryStage.centerOnScreen();
    }
}
