import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class AppInitializer extends Application {

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("/view/StudentForm.fxml"));//load the fxml file
        Scene scene = new Scene(parent);//create a scene

        primaryStage.setScene(scene);//set the scene to the stage
        primaryStage.setTitle("Student Form");
        primaryStage.centerOnScreen();
        primaryStage.show();//show the stage
    }
}
