/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Arian Nurrifqhi
 */

public class Pelanggan extends Orang {
    //private String idpelanggan;
    private PaketWisata daftarPaketWisata;
    
    public Pelanggan(String name, String gender, String idktp) {
        super(name, gender, idktp);
    }

    public PaketWisata getDaftarPaketWisata() {
        return daftarPaketWisata;
    }

    public void setDaftarPaketWisata(PaketWisata daftarPaketWisata) {
        this.daftarPaketWisata = daftarPaketWisata;
    }
    
        
}
