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
    public Petugas(String name, String gender, String idktp) {
        super(name, gender, idktp);
    }
    
    public void addIdPetugas(String id){
        idpetugas = id;
    }
    
    public String getIdPetugas(){
        return idpetugas;
    }
    
    
   
}
