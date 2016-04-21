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
public class Petugas extends Orang {
    
    private String idpetugas;
    private int produk;
    private String password;
    private String username;
    
    public Petugas(String name, String gender, String idktp) {
        super(name, gender, idktp);
    }
    
    public void addIdPetugas(String id){
        idpetugas = id;
    }
    
    
    public void addUsername(String username){
        this.username = username;
    }
    
    public void addPassword(String password){
        this.password = password;
    }
    
    public String getIdPetugas(){
        return idpetugas;
    }
    
    public String getName(){
        return super.getName();
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
    
    // public String toString(){
    //    return ("Nama: "+super.getName+"\nGender: "+getGender+"\nID KTP: "+getIdKtp);
    //}
   
}
