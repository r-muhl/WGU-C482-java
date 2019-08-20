/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmuhlestein_pa.View_Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author robmu
 */
public class ProductScreenController implements Initializable {

    @FXML
    private Button SearchButton;
    @FXML
    private Button AddButton;
    @FXML
    private Button CancelButton;
    @FXML
    private Button DeleteButton;
    @FXML
    private Button SaveButton;
    @FXML
    private Label IDLabel;
    @FXML
    private Label NameLabel;
    @FXML
    private Label InvLabel;
    @FXML
    private Label PriceLabel;
    @FXML
    private Label MaxLabel;
    @FXML
    private Label MinLabel;
    @FXML
    private TextField IDTextField;
    @FXML
    private TextField NameTextField;
    @FXML
    private TextField InvTextField;
    @FXML
    private TextField PriceTextField;
    @FXML
    private TextField MaxTextField;
    @FXML
    private TextField MinTextField;
    @FXML
    private TextField SearchButtonTextField;
    @FXML
    private Label AddProductLabel;
    @FXML
    private TableView<ProductClass> table2;
    @FXML
    private TableColumn<?, ?> PartID2;
    @FXML
    private TableColumn<?, ?> PartName2;
    @FXML
    private TableColumn<?, ?> InvLevel2;
    @FXML
    private TableColumn<?, ?> Cost2;
    @FXML
    private TableView<ProductClass> table1;
    @FXML
    private TableColumn<?, ?> PartID1;
    @FXML
    private TableColumn<?, ?> InvLevel1;
    @FXML
    private TableColumn<?, ?> Cost1;
    public ObservableList<ProductClass> data=FXCollections.observableArrayList();   
    public ObservableList<ProductClass> data2=FXCollections.observableArrayList();  
    @FXML
    private TableColumn<?, ?> PartName1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        if (MainScreenController.modify == 1){
            AddProductLabel.setText ("Add Product");
        }
        if (MainScreenController.modify ==2) {
            AddProductLabel.setText ("Modify Product");
        }
        
    }    

    @FXML
    private void SearchButtonHandler(ActionEvent event) {
              
        String searchItem = SearchButtonTextField.getText();
        boolean found = false;
        try {
             int itemNumber = Integer.parseInt(searchItem);
             for (ProductClass p: data){
                 if (p.getPartID() == itemNumber){
                     System.out.println("This is part"+ itemNumber);
                     found=true;
                     data2 = table2.getItems();
                     data2.add(p);
                     
                        PartID2.setCellValueFactory( new PropertyValueFactory<>("partID"));
                        PartName2.setCellValueFactory (new PropertyValueFactory<>("partName"));
                        InvLevel2.setCellValueFactory (new PropertyValueFactory<> ("invLevel"));
                        Cost2.setCellValueFactory(new PropertyValueFactory<> ("cost"));
                    
                    table2.setItems(data2);
                 }
             }
                if (found == false){
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Information Dialog");
                    alert.setHeaderText("Error!");
                    alert.setContentText("Part not found");
                    
                    alert.showAndWait();
                }
            }
        catch(NumberFormatException e){
            for(ProductClass p: data){
                if(p.getPartName().equals(searchItem)){
                    System.out.println("This is part "+ p.getPartID());
                    found = true;
                    
                    data2 = table2.getItems();
                    data2.add(p);
                    
                    PartID2.setCellValueFactory( new PropertyValueFactory<>("partID"));
                    PartName2.setCellValueFactory (new PropertyValueFactory<>("partName"));
                    InvLevel2.setCellValueFactory (new PropertyValueFactory<> ("invLevel"));
                    Cost2.setCellValueFactory(new PropertyValueFactory<> ("cost"));
                    
                    table2.setItems(data2);
                }
            }
            if (found == false){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Information Dialog");
                alert.setHeaderText("Error");
                alert.setContentText("Part not found");

                alert.showAndWait();
            }
        }
    }

    @FXML
    private void AddButtonHandler(ActionEvent event) {
        data = table1.getItems();
        String partID = IDTextField.getText();
        String partName = NameTextField.getText();
        String invLevel = InvTextField.getText();
        String cost = PriceTextField.getText();
        data.add(new ProductClass (Integer.parseInt(partID),partName,Integer.parseInt(invLevel),Double.parseDouble(cost)
        ));
        
        PartID1.setCellValueFactory(new PropertyValueFactory<>("partID"));
        PartName1.setCellValueFactory(new PropertyValueFactory<>("partName"));
        InvLevel1.setCellValueFactory(new PropertyValueFactory<>("invLevel"));
        Cost1.setCellValueFactory(new PropertyValueFactory<>("cost"));
        table1.setItems(data);
        IDTextField.setText("");
        NameTextField.setText("");
        InvTextField.setText("");
        PriceTextField.setText("");
        
    }

    @FXML
    private void CancelButtonHandler(ActionEvent event) throws IOException {
        
        Stage stage; 
        Parent root;       
        stage=(Stage) AddProductLabel.getScene().getWindow();
        //load up OTHER FXML document
        FXMLLoader loader=new FXMLLoader(getClass().getResource(
               "MainScreen.fxml"));
        root =loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void DeleteButtonHandler(ActionEvent event) {
        System.out.println("You clicked the Delete button!");
    }

    @FXML
    private void SaveButtonHandler(ActionEvent event) {
        System.out.println("You clicked the Save button!");
    }
    
}
