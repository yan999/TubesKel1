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
        Aplikasi app = new Aplikasi();
        new Controller(app);
    }
    
}
