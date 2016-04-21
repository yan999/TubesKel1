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
public class Perjalanan {
    
    private String banktransfer;
    private String day;
    private String month;
    private String year;
    
    
    public Perjalanan(String day, String month, String year, String bankTransfer){
        this.day = day;
        this.month = month;
        this.year = year;
        this.banktransfer = bankTransfer;
    }
    
    //ArrayList<Object> 

    public void setBanktransfer(String banktransfer) {
        this.banktransfer = banktransfer;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getBanktransfer() {
        return banktransfer;
    }

    public String getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }
    
}
