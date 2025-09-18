package controller;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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

        loadStartCoustermerData();

        tblCountermenDetails.refresh();

        //Anonyemous Inner Class
        tblCountermenDetails.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Coustmer_tm>() {
            @Override
            public void changed(ObservableValue<? extends Coustmer_tm> observableValue, Coustmer_tm coustmerTm, Coustmer_tm t1) {

                Coustmer_tm selectedItem = tblCountermenDetails.getSelectionModel().getSelectedItem();

                txtID.setText(selectedItem.getID());
                txtNM.setText(selectedItem.getName());
                txtAds.setText(selectedItem.getAddress());
                txtNIC.setText(selectedItem.getNIC());
                txtCntt.setText(selectedItem.getContact());
            }
        });
    }

    public void loadStartCoustermerData(){
        Coustmer_tm coustermer1 = new Coustmer_tm("C001","Kasun","Galle","123456789V","0771234567");
        Coustmer_tm coustermer2 = new Coustmer_tm("C002","Nimal","Matara","987654321V","0717654321");
        Coustmer_tm coustermer3 = new Coustmer_tm("C003","Sunil","Colombo","456789123V","0759876543");
        Coustmer_tm coustermer4 = new Coustmer_tm("C004","Kamal","Kandy","321654987V","0723456789");
        Coustmer_tm coustermer5 = new Coustmer_tm("C005","Ruwan","Jaffna","654321789V","0788765432");

        ObservableList<Coustmer_tm> items = tblCountermenDetails.getItems();

        items.add(coustermer1);
        items.add(coustermer2);
        items.add(coustermer3);
        items.add(coustermer4);
        items.add(coustermer5);
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
