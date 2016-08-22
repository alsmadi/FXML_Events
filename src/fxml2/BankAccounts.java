/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxml2;

//import static chapter17.StudentRecords.loadObject;
import java.io.*;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage; 
import javafx.geometry.Insets;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Pos;
import javafx.scene.control.ContentDisplay;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import java.util.*;

public class BankAccounts extends Application {
      LinkedList<Accounts> accounts;
    public static void main(String[] args) { Application.launch(args); }
     private TextField nameField = new TextField();
    private TextField positionField = new TextField();
     private TextField departmentField = new TextField();
    private TextField cityField = new TextField();
    private TextField stateField = new TextField();
    private TextField zipField = new TextField();
    private long length;
    
    private int numOfEntries;
    
    TextField[] fields = {nameField, positionField,departmentField,  cityField,
        stateField, zipField};
    void clearFields() {
        for(TextField tf : fields)
            tf.setText("");
    }
    void nextAccount(){
        Accounts act = new Accounts(this.nameField.getText(), this.positionField.getText(), this.departmentField.getText(),this.cityField.getText()
       , this.stateField.getText(),this.zipField.getText());
        
        Accounts act1=null;
        boolean flag=false;
        
        try{
            
     //      Iterator it =students.iterator();
       //    while(it.hasNext()){
         //  st1= (Student)it.next();
        for(int k=0; k< accounts.size();k++){
            
            act1= accounts.get(k); 
            if(flag==true){
                break;
            }
            if(act1.equalsOv(act)){
                flag=true;
               continue; 
            }
        }
        }
        catch(Exception ex){
            
        }
        
        this.cityField.setText(act1.getCity());
        this.nameField.setText(act1.getName());
        this.positionField.setText(act1.getPosition());
        this.departmentField.setText(act1.getDepartment());
        this.stateField.setText(act1.getState());
        this.zipField.setText(act1.getZip());
    }
    void previousAccount(){
        Accounts act = new Accounts(this.nameField.getText(), this.positionField.getText(), this.departmentField.getText(),this.cityField.getText()
       , this.stateField.getText(),this.zipField.getText());
        
        Accounts actPrev=null;
        Accounts act1=null;
        boolean flag=false;
        
        try{
            
     //      Iterator it =students.iterator();
       //    while(it.hasNext()){
         //  st1= (Student)it.next();
        for(int k=0; k< accounts.size();k++){
            
            try{
                 actPrev= accounts.get(k-1); 
            }
            catch(Exception ex){
                
            }
            act1= accounts.get(k); 
        //    if(flag==true){
          //      break;
          //  }
            if(act1.equalsOv(act)){
                flag=true;
               break; 
            }
        }
        
        
       this.cityField.setText(actPrev.getCity());
        this.nameField.setText(actPrev.getName());
        this.positionField.setText(actPrev.getPosition());
        this.departmentField.setText(actPrev.getDepartment());
        this.stateField.setText(actPrev.getState());
        this.zipField.setText(actPrev.getZip());
        }
        catch(Exception ex){
            
        }
    }
    void lastAccount(){
     
        Accounts act1=new Accounts();
     //   boolean flag=false;
        
        try{
            
     
        for(int k=0; k< accounts.size();k++){
            
            
            act1= accounts.get(k); 
        
        }
        
        
        this.cityField.setText(act1.getCity());
        this.nameField.setText(act1.getName());
        this.positionField.setText(act1.getPosition());
        this.departmentField.setText(act1.getDepartment());
        this.stateField.setText(act1.getState());
        this.zipField.setText(act1.getZip());
        }
        catch(Exception ex){
            
        }
    }
    void saveAccounts(){
     File file = new File ("file.txt");
    PrintWriter printWriter = null;
   
        Accounts act=null;
         try{
           printWriter=new PrintWriter (file);
     printWriter.println ("seq"+"..."+"Name"+ "City"+
                        "Department"+"Position"+
                        "City"+"Zip");
             for(int k=0; k< accounts.size();k++){
                 act = accounts.get(k);
                printWriter.println (k+"..."+act.getName()+ act.getCity()+
                        act.getDepartment()+act.getPosition()+
                        act.getCity()+act.getZip());
             }
        
         }
         catch(Exception ex){
             
         }
          printWriter.close ();
    }
    void readAccount(){
        Accounts act=null;
         try{
           
             for(int k=0; k< accounts.size();k++){
                 act = accounts.get(k);
                 break;
             }
        
         }
         catch(Exception ex){
             
         }
        
       this.cityField.setText(act.getCity());
        this.nameField.setText(act.getName());
        this.positionField.setText(act.getPosition());
        this.departmentField.setText(act.getDepartment());
        this.stateField.setText(act.getState());
        this.zipField.setText(act.getZip());
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
    public void start(Stage primaryStage) throws IOException {
        
    FlowPane pane = new FlowPane();
    accounts = new LinkedList<Accounts>();
   // TextField nameField = new TextField();
   // TextField positionField = new TextField();
   // TextField departmentField = new TextField();
   // TextField cityField = new TextField();
   // TextField stateField = new TextField();
   // TextField zipField = new TextField();
    long length;
    
    int numOfEntries;
    pane.setPadding(new Insets(10,10,10,10));
        pane.setVgap(5);
        pane.setHgap(8);
        
        nameField.setMinWidth(310);
        positionField.setMinWidth(310);
        departmentField.setMinWidth(310);
        cityField.setMaxWidth(140);
        stateField.setMaxWidth(40);
        zipField.setMaxWidth(70);
        pane.getChildren().addAll(new Label("Name "), nameField,
                new Label("Position"), positionField,new Label("Department"), departmentField, new Label("City   "),
                cityField, new Label("State"), stateField, new Label("Zip"),
                zipField);
        Button add = new Button("Add");
        Button first = new Button("First");
        Button next = new Button("Next");
        Button previous = new Button("Previous");
        Button last = new Button("Last");
        Button update = new Button("Update");
        Button save = new Button("Save");
        Button DeSerialize = new Button("DeSerialize");
         Button Serialize = new Button("Serialize");

        pane.getChildren().addAll(add, first, next, previous, last, update, save);
        
        add.setOnAction(e -> writeAccount());
        first.setOnAction(e -> readAccount());
        next.setOnAction(e -> nextAccount());
        previous.setOnAction(e -> previousAccount());
        last.setOnAction(e -> lastAccount());
        save.setOnAction(e -> saveAccounts());
        
        //length = file.length();
    
    TextField[] fields = {nameField, positionField, departmentField, cityField,
        stateField, zipField};
        Scene scene = new Scene(pane, 400, 150);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Bank Accounts");
        primaryStage.show(); 
        
        
        
    }
    
    
}
