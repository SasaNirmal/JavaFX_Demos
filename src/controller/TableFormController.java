package controller;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import tm.Coustmer_tm;

import java.io.IOException;

public class TableFormController {
    public TableView<Coustmer_tm> tblCountermenDetails;
    public TextField txtID;
    public TextField txtCntt;
    public TextField txtNIC;
    public TextField txtAds;
    public TextField txtNM;
    public AnchorPane rootTbl;

    public void initialize(){
        tblCountermenDetails.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("ID"));
        tblCountermenDetails.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("Name"));
        tblCountermenDetails.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("Address"));
        tblCountermenDetails.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("NIC"));
        tblCountermenDetails.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>("Contact"));
    }


    public void btnCoustmerAddOnAction(ActionEvent actionEvent) {

        String id = txtID.getText();
        String name = txtNM.getText();
        String address = txtAds.getText();
        String nic = txtNIC.getText();
        String contact = txtCntt.getText();

        ObservableList<Coustmer_tm> coustmers = tblCountermenDetails.getItems();

        Coustmer_tm newcoustmer = new Coustmer_tm(id, name, address, nic, contact);

        coustmers.add(newcoustmer);


        tblCountermenDetails.refresh();

        txtID.clear();
        txtCntt.clear();
        txtNIC.clear();
        txtAds.clear();
        txtNM.clear();

        txtID.requestFocus();
    }

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../view/DashBoard.fxml"));
        Scene dashBoardScene = new Scene(parent);

        Stage primaryStage = (Stage) this.rootTbl.getScene().getWindow();

        primaryStage.setScene(dashBoardScene);
        primaryStage.setTitle("Dash Board Form");
        primaryStage.centerOnScreen();
    }
}
