/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmuhlestein_pa.View_Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author robmu
 */
public class PartScreenController implements Initializable {
    public static int outsourced;

    @FXML
    private Button CancelButton;
    @FXML
    private Button SaveButton;
    @FXML
    private RadioButton OutsourcedButton;
    @FXML
    private RadioButton InHouseButton;
    @FXML
    private Label AddPartsLabel;
    @FXML
    private Label NameLabel;
    @FXML
    private Label InvLabel;
    @FXML
    private Label CostLabel;
    @FXML
    private Label MaxLabel;
    @FXML
    private Label CompanyNameLabel;
    @FXML
    private Label MinLabel;
    @FXML
    private TextField IDTextField;
    @FXML
    private TextField NameTextField;
    @FXML
    private TextField InvTextField;
    @FXML
    private TextField CostTextField;
    @FXML
    private TextField CompanyNameTextField;
    @FXML
    private TextField MaxTextField;
    @FXML
    private TextField MinTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if(MainScreenController.modify == 1){
            AddPartsLabel.setText("Add Part");
        }
        if (MainScreenController.modify == 2){
            AddPartsLabel.setText ("Modify Part");
        }
        ToggleGroup outsourced = new ToggleGroup();
        InHouseButton.setToggleGroup(outsourced);
        OutsourcedButton.setToggleGroup(outsourced);
        InHouseButton.setSelected(true);
        // TODO
    }    

    @FXML
    private void CancelButtonHandler(ActionEvent event) throws IOException {
       
        Stage stage; 
        Parent root;       
        stage=(Stage) CancelButton.getScene().getWindow();
        //load up OTHER FXML document
        FXMLLoader loader=new FXMLLoader(getClass().getResource(
               "MainScreen.fxml"));
        root =loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void SaveButtonHandler(ActionEvent event) {
        System.out.println("YOu clicked the save button!");
    }

    @FXML
    private void OutsourcedButtonHandler(ActionEvent event) {
        System.out.println("YOu clicked the outsourced button!");
        outsourced = 1;
        if (outsourced == 1){
            CompanyNameLabel.setText ("Company Name");
        }
    }

    @FXML
    private void InHouseButtonHandler(ActionEvent event) {
        System.out.println("YOu clicked the in house button!");
        outsourced = 2;
        if (outsourced ==2){
            CompanyNameLabel.setText ("Machine ID");
        }
    }
    
}
