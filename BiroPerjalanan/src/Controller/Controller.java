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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Arian Nurrifqhi
 */
public class Controller extends MouseAdapter implements ActionListener{
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
    private KelolaPelanggan kp1;
    private KelolaPetugas kp2;
    
    private int kodeSeleksi;
    
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
        kp1 = new KelolaPelanggan();
        kp2 = new KelolaPetugas();
        
        log.addListener(this);
        dp.addListener(this);
        kp1.addListener(this);
        kp2.addListener(this);
        pi.addListener(this);
        pl.addListener(this);
        
        mainPanel = view.getMainPanel();
        mainPanel.add(log,"0");
        mainPanel.add(dp,"1");
        mainPanel.add(kp1,"2");
        mainPanel.add(kp2,"3");
        mainPanel.add(pi,"4");
        mainPanel.add(pl,"5");
        mainPanel.add(st1,"6");
        mainPanel.add(st2,"7");
        mainPanel.add(st3,"8");
        currentView = "0";
        
        view.getCardLayout().show(mainPanel, currentView);
        view.setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        if (currentView.equals("0")){
            if (source.equals(log.getLoginButton())){
                if(log.getUsername().equals("")||log.getPassword().equals("")){
                    JOptionPane.showMessageDialog(view, "Data Masih Kosong", "ERROR",JOptionPane.ERROR_MESSAGE);
                }
                else if(model.checkPetugas(log.getUsername(), log.getPassword())!=null){
                dp.setIdentitasNama(model.checkPetugas(log.getUsername(), log.getPassword()));
                log.Refresh();
                currentView = "1";
                view.getCardLayout().show(mainPanel, currentView);}
                else
                    JOptionPane.showMessageDialog(view, "Username/password Salah", "ERROR",JOptionPane.ERROR_MESSAGE);
                    
            }
            else if(source.equals(log.getIntButton())){
                pi.setTableInt(model.getPaketWisata());
                currentView = "4";
                view.getCardLayout().show(mainPanel, currentView);
            }
            else if(source.equals(log.getLokalButton())){
                pl.setTableLokal(model.getPaketWisata());
                currentView = "5";
                view.getCardLayout().show(mainPanel, currentView);
            }
        }
        else if (currentView.equals("1")){
            if (source.equals(dp.getdp())){
                 currentView = "2";
            view.getCardLayout().show(mainPanel, currentView);
            }
            else if (source.equals(dp.getdp2())){
                kp2.setTablePetugas(model.getDaftarPetugas());
                currentView = "3";
            view.getCardLayout().show(mainPanel, currentView);
            }else if (source.equals(dp.getLogout())){
                currentView = "0";
            view.getCardLayout().show(mainPanel, currentView);
            }else if(source.equals(dp.getSubmit()))
                if((dp.getNamaPaket().equals(""))||(dp.getLokasi().equals(""))||(dp.getFasilitas().equals(""))
                        ||(dp.getHarga() <= 0)){
                    JOptionPane.showMessageDialog(view, "Data Masih Kosong", "Warning", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    model.createPaketWisata(dp.getNamaPaket(), dp.getLokasi(),dp.getFasilitas(),dp.getHarga(), dp.getTipe(), dp.getDurasi());
                    JOptionPane.showMessageDialog(view, "Data Ditambahkan", "Confirm", JOptionPane.INFORMATION_MESSAGE);
                    dp.Rafresh();
                }
    
        }
        else if(currentView.equals("2")){
            if(source.equals(kp1.getBack())){
                currentView = "1";
                view.getCardLayout().show(mainPanel, currentView);
            }
        }
        else if(currentView.equals("3")){
            if(source.equals(kp2.getBack())){
                currentView = "1";
                view.getCardLayout().show(mainPanel, currentView);
            }
        }
        else if(currentView.equals("4")){
            if(source.equals(pi.getBack())){
                currentView = "0";
                view.getCardLayout().show(mainPanel, currentView);
            }
            else if (source.equals(pi.getPesan())){
                currentView = "";
            }
        }
        else if(currentView.equals("5")){
            if(source.equals(pl.getBack())){
                currentView = "0";
                view.getCardLayout().show(mainPanel, currentView);
            }
        }
        else if(currentView.equals("6")){
            if(source.equals(st1.getBack())){
                currentView = "0";
                view.getCardLayout().show(mainPanel, currentView);
            }
        }
    }
    
    public void mousePressed(MouseEvent e){
        if (currentView.equals("4")){
            kodeSeleksi = pi.getSelectedId();
        }
    }
}
