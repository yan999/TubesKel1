/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Arian Nurrifqhi
 */
public abstract class Orang {
    
    private String name;
    private String gender;
    private String idktp;
    private String address;
    
    public Orang(String name, String gender, String idktp){
        this.name = name;
        this.gender = gender;
        this.idktp = idktp;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getAddress(){
        return address;
    }
    
    public String getName(){
        return name;
    }
    
    public String getGender(){
        return gender;
    }
    
    public String getIdKtp(){
        return idktp;
    }
    
}
    

