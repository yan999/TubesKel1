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
public class TempatWisata {
    
    private String namaT;
    private double jarak;
    private String fasilitas;
    private String type;
    
    public TempatWisata(String namaT, String fasilitas, String type){
        this.namaT = namaT;
        this.fasilitas = fasilitas;
        this.type = type;
    }
    
    public void setJarak(int jarak){
        this.jarak = jarak;
    }
    
    public double getJarak(){
        return jarak;
    }
    
}
