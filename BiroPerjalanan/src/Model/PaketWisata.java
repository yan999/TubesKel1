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
import java.util.*;
import java.io.*;

public class PaketWisata {
    private ArrayList<TempatWisata> daftarTempatWisata;
    private String namaPaket;
    private int harga;
    private String durasi;
    
    public PaketWisata(String nama, String namaT, String fasilitas, int harga,String type, String durasi){
       daftarTempatWisata = new ArrayList<>();
       daftarTempatWisata.add(new TempatWisata(namaT, fasilitas, type));
       namaPaket = nama;
       this.durasi = durasi;
       this.harga = harga;
    }
    
    public PaketWisata(){
        
    }
    
    public TempatWisata getTempatWisata(){
        return daftarTempatWisata.get(0);
    }
    
    
    
//public void addTempatWisata(TempatWisata w){}
    
//public

    public ArrayList<TempatWisata> getDaftarTempatWisata() {
        return daftarTempatWisata;
    }

    public void setDaftarTempatWisata(ArrayList<TempatWisata> daftarTempatWisata) {
        this.daftarTempatWisata = daftarTempatWisata;
    }

    public String getNamaPaket() {
        return namaPaket;
    }

    public void setNamaPaket(String namaPaket) {
        this.namaPaket = namaPaket;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getDurasi() {
        return durasi;
    }

    public void setDurasi(String durasi) {
        this.durasi = durasi;
    }
    
}

