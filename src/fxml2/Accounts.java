/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxml2;
import java.io.*;
/**
 *
 * @author IAlsmadi
 */
public class Accounts implements Serializable{
    private String name;
    private String Position;
     private String Department;
    private String city;
    private String state;
    private String zip;
    public Accounts(){
        
    }
    public Accounts(String name1, String position1, String department, String city1, String state1, String zip1 ){
        this.city=city1;
        this.name=name1;
        this.state=state1;
        this.Department=department;
        this.zip=zip1;
        this.Position=position1;
    }
    
    public boolean equalsOv(Accounts o) {
        if(this.city.equals(o.getCity()) && this.name.equals(o.getName()) &&
         this.state.equals(o.getState()) && this.Department.equals(o.getDepartment()) &&
                this.zip.equals(o.getZip()) && this.Position.equals(o.getPosition())){
            return true;
        }
        return false;
    }
    public String getName(){
        return this.name;
    }
     public String getPosition(){
        return this.Position;
    }
     public String getDepartment(){
        return this.Department;
    }
      public String getCity(){
        return this.city;
    }
       public String getState(){
        return this.state;
    }
        public String getZip(){
        return this.zip;
    }
    
}
