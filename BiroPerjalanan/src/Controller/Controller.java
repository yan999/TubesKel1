/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import GUI.*;
import Model.Aplikasi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author Arian Nurrifqhi
 */
public class Controller implements ActionListener{
    private Aplikasi model;
    private Form view;
    
    private String currentView;
    private JPanel mainPanel;
    
    private Home2 log;
    private DashboardPetugas dp;
    private PaketInt pi;
    private PaketLok pl;
    private Step1 st1;
    private Step2 st2;
    private Step3 st3;
    
    public Controller(Aplikasi model){
        this.model = model;
        view = new Form();
        
        log = new Home2();
        dp = new DashboardPetugas();
        pi = new PaketInt();
        pl = new PaketLok();
        st1 = new Step1();
        st2 = new Step2();
        st3 = new Step3();
        
        log.addListener(this);
        
        mainPanel = view.getMainPanel();
        mainPanel.add(log,"0");
        mainPanel.add(dp,"1");
        currentView = "0";
        
        view.getCardLayout().show(mainPanel, currentView);
        view.setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        if (currentView.equals("0")){
            if (source.equals(log.getLoginButton())){
                currentView = "1";
                view.getCardLayout().show(mainPanel, currentView);
            }
        }
    }
}
