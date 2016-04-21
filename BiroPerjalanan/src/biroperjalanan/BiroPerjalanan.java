/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biroperjalanan;

import Controller.Controller;
import Model.Aplikasi;
import Model.PaketWisata;
import Model.Pelanggan;
import Model.Perjalanan;
import Model.Petugas;
import Model.TempatWisata;

/**
 *
 * @author Arian Nurrifqhi
 */
public class BiroPerjalanan {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        Petugas p = new Petugas("Arian Nurrifqhi","Laki-Laki","123456789");
        
        Aplikasi app = new Aplikasi();
        app.addPetugas("Arian Nurrifqhi", "Laki-Laki", "123456789");
        app.getDaftarPetugas().get(0).addUsername("arian");
        app.getDaftarPetugas().get(0).addPassword("arian");
        new Controller(app);
        
        
        
    }
    
}
