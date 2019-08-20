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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author robmu
 */
public class MainScreenController implements Initializable {
    public static int modify;

    @FXML
    private TableColumn<?, ?> Parts_PartIDColumn;
    @FXML
    private TableColumn<?, ?> Parts_PartNameColumn;
    @FXML
    private TableColumn<?, ?> Parts_InventoryLevelColumn;
    @FXML
    private TableColumn<?, ?> Parts_CostPerUnit;
    @FXML
    private Button Parts_SearchButton;
    @FXML
    private TextField Parts_SearchTextField;
    @FXML
    private Button Parts_AddButton;
    @FXML
    private Button Parts_ModifyButton;
    @FXML
    private Button Parts_DeleteButton;
    @FXML
    private Label Parts_Label;
    @FXML
    private Label IMSLabel;
    @FXML
    private Button ExitButton;
    @FXML
    private TableColumn<?, ?> Products_ProductIDColumn;
    @FXML
    private TableColumn<?, ?> Products_ProductNameColumn;
    @FXML
    private TableColumn<?, ?> Products_InventoryLevelColumn;
    @FXML
    private TableColumn<?, ?> Products_CostPerUnit;
    @FXML
    private Button Products_SearchButton;
    @FXML
    private TextField Products_SearchTextField;
    @FXML
    private Button Products_AddButton;
    @FXML
    private Button Products_ModifyButton;
    @FXML
    private Button Products_DeleteButton;
    @FXML
    private Label Products_Label;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }     
    
    @FXML
    void Parts_AddButtonHandler(ActionEvent event) throws IOException {
        modify =1;
        Stage stage; 
        Parent root;       
        stage=(Stage) IMSLabel.getScene().getWindow();
        //load up OTHER FXML document
        FXMLLoader loader=new FXMLLoader(getClass().getResource(
               "PartScreen.fxml"));
        root =loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void Parts_DeleteButtonHandler(ActionEvent event) {
        System.out.println("You clicked the Parts Delete button!");
    }
    @FXML
    void Parts_ModifyButtonHandler(ActionEvent event) throws IOException {
        modify = 2;
        Stage stage; 
        Parent root;       
        stage=(Stage) IMSLabel.getScene().getWindow();
        //load up OTHER FXML document
        FXMLLoader loader=new FXMLLoader(getClass().getResource(
               "PartScreen.fxml"));
        root =loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void Parts_SearchButtonHandler(ActionEvent event) {
        System.out.println("You clicked the Parts Search button!");
    }
    @FXML
    private void ExitButtonHandler(ActionEvent event) {
        System.out.println("You clicked The Exit Button!");
    }
    @FXML
    private void Products_SearchButtonHandler(ActionEvent event) {
        System.out.println("You clicked Products Search!");   
    }
    @FXML
    private void Products_AddButtonHandler(ActionEvent event) throws IOException {
        modify = 1;
        Stage stage; 
        Parent root;       
        stage=(Stage) IMSLabel.getScene().getWindow();
        //load up OTHER FXML document
        FXMLLoader loader=new FXMLLoader(getClass().getResource(
               "ProductScreen.fxml"));
        root =loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void Products_ModifyButtonHandler(ActionEvent event) throws IOException {
        
        modify = 2;
        Stage stage; 
        Parent root;       
        stage=(Stage) IMSLabel.getScene().getWindow();
        //load up OTHER FXML document
        FXMLLoader loader=new FXMLLoader(getClass().getResource(
               "ProductScreen.fxml"));
        root =loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void Products_DeleteButtonHandler(ActionEvent event) {
        System.out.println("You clicked Products Delete!");
    }
    
}
