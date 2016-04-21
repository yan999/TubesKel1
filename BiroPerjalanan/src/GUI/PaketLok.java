/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Model.PaketWisata;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import static java.util.Collections.list;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Arian Nurrifqhi
 */
public class PaketLok extends javax.swing.JPanel {

    /**
     * Creates new form PaketLok
     */
    public PaketLok() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableLokal = new javax.swing.JTable();
        back = new javax.swing.JButton();

        jLabel1.setText("PAKET LOKAL");

        TableLokal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nama Paket", "Lokasi", "Fasilitas", "Harga", "Durasi", "Aksi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableLokal);

        back.setText("Back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(back)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(back)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

public Object getBack(){
    return back;
}


public void addListener(ActionListener e){
    back.addActionListener(e);
}

public void setTableLokal(ArrayList<PaketWisata> p){
    String[] header ={"Nama Paket","Lokasi","Fasilitas","Harga","Durasi","Aksi"};
    String[][] isi = new String[p.size()][6] ;
    for(int i =0;i<p.size();i++){
        if (p.get(i).getTempatWisata().getType().equals("Lokal")){
        isi[i][0] = p.get(i).getNamaPaket();
        isi[i][1] = p.get(i).getTempatWisata().getNamaT();
        isi[i][2] = p.get(i).getTempatWisata().getFasilitas();
        isi[i][3] ="Rp"+ String.valueOf(p.get(i).getHarga());
        isi[i][4] = p.get(i).getDurasi();
        isi[i][5] = "Pesan";}
    }
    DefaultTableModel tableModel = new DefaultTableModel(isi,header);
    TableLokal.setModel(tableModel);
    
}

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableLokal;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
