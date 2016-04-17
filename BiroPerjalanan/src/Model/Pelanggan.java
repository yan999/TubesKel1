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
public class Pelanggan extends Orang {
    private String idpelanggan;
    private double saldo;
    private String username;
    private String password;
    
    public Pelanggan(String name, String gender, String idktp) {
        super(name, gender, idktp);
    }
    
}
