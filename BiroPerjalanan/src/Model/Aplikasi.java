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

public class Aplikasi {
    
    private ArrayList<Petugas> daftarPetugas;
    private ArrayList<Pelanggan> daftarPelanggan;
    private ArrayList<Perjalanan> daftarPerjalanan;
    private ArrayList<PaketWisata> daftarPaketWisata;
    private ArrayList<TempatWisata> daftarTempatWisata;
    
    public Aplikasi(){
        daftarPelanggan = new ArrayList<>();
        daftarPetugas = new ArrayList<>();
        daftarPerjalanan = new ArrayList<>();
        daftarPaketWisata = new ArrayList<>();
      //  daftarTempatWisata = new ArrayList<>();
    } 
    
    public void addPetugas(String name, String gender, String idktp){
        daftarPetugas.add(new Petugas(name, gender, idktp));
    }
    
    public void addPelanggan(String name, String gender, String idktp){
        daftarPelanggan.add(new Pelanggan(name, gender, idktp));
    }
    
    public int findPelangganbyId(String id){
        for (Pelanggan p : daftarPelanggan){
            if(p.getIdKtp().equals(id))
                return daftarPelanggan.indexOf(p);
                
        }
        return -1;
    }
    
    public Pelanggan getPelanggan(String id){
        if (findPelangganbyId(id) != -1){
            return daftarPelanggan.get(findPelangganbyId(id));
        }
        return null;
    }
    
    public void deletePelanggan(String id){
        if(findPelangganbyId(id) != -1){
            daftarPelanggan.remove(findPelangganbyId(id));
        }    
    }
    
    public void addPaketWisata(){
        
    }
    
    public void createPaketWisata(String nama, String namaT, String fasilitas, int harga, String type, String durasi){
        daftarPaketWisata.add(new PaketWisata(nama, namaT, fasilitas, harga, type, durasi));
    }
    
    public ArrayList<PaketWisata> getPaketWisata(){
        return daftarPaketWisata;
    }
    
    
    
    
        
    
    
    
}
