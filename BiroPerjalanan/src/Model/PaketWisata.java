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
    
    public PaketWisata(String nama, String durasi, String namaT, String type, String fasilitas){
       daftarTempatWisata = new ArrayList<>();
       daftarTempatWisata.add(new TempatWisata(namaT, fasilitas, type));
        namaPaket = nama;
       this.durasi = durasi;
    }
    
//public void addTempatWisata(TempatWisata w){}
    
//public
    
}

