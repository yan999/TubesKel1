/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Database.Database;
import Model.PaketWisata;
import Model.TempatWisata;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Arian Nurrifqhi
 */
public class PaketWisataDAO extends Database{
  
   public ArrayList<PaketWisata> selectAll(){
       ArrayList<PaketWisata> paketwisata = new ArrayList<>();
       String sql = "SELECT * from paket_wisata";
       try{
           PreparedStatement ps = c.prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           while(rs.next()){
               PaketWisata pw = new PaketWisata();
               pw.setDaftarTempatWisata(new ArrayList<TempatWisata>());
           }
       }catch(Exception e){
           e.printStackTrace();
       }
       return paketwisata;
   } 
   
   
   
   
}
