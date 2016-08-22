/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxml2;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author ialsmadi
 */
public class FXMLDocumentController implements Initializable {
     LinkedList<Accounts> accounts;
     TextField[] fields;
     public FXMLDocumentController(){
        fields[0]=nameField;
         fields[1]=positionField;
          fields[2]=departmentField;
           fields[3]=cityField;
            fields[4]=stateField;
             fields[5]=zipField;
         accounts= new  LinkedList<Accounts>();   
             
     //   = {nameField, positionField, departmentField, cityField,
      //  stateField, zipField};
     }
    @FXML
    private Label label;
    @FXML
     private TextField nameField = new TextField();
    @FXML
    private TextField positionField = new TextField();
    @FXML
     private TextField departmentField = new TextField();
    @FXML
    private TextField cityField = new TextField();
    @FXML
    private TextField stateField = new TextField();
    @FXML
    private TextField zipField = new TextField();
    private long length;
    
    private int numOfEntries;
    
    //fields = {nameField, positionField,departmentField,  cityField,
      //  stateField, zipField};
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @FXML
    private void AddHandelr(ActionEvent event) {
        writeAccount();
    }
    void clearFields() {
        for(TextField tf : fields)
            tf.setText("");
    }
    void writeAccount(){
       Accounts act = new Accounts(this.nameField.getText(), this.positionField.getText(), this.departmentField.getText(),this.cityField.getText()
       , this.stateField.getText(),this.zipField.getText());
        
         
               try{
                   accounts.add(act);
             // oout.writeObject(st);
         //     oout.flush();
              clearFields();
                
                numOfEntries++;
              // oout.close();
             
               }
               catch(Exception ex){
                   ex.printStackTrace();
               }
               
           
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
