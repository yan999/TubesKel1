/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Model.PaketWisata;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Arian Nurrifqhi
 */
public class PaketInt extends javax.swing.JPanel {

    /**
     * Creates new form PaketInt
     */
    public PaketInt() {
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
        TableInt = new javax.swing.JTable();
        back = new javax.swing.JButton();
        pesan = new javax.swing.JButton();

        jLabel1.setText("PAKET INTERNASIONAL");

        TableInt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nama Paket", "Lokasi", "Fasilitas", "Harga", "Durasi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableInt);

        back.setText("Back");

        pesan.setText("Pesan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(242, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(240, 240, 240))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pesan))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(pesan))
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

public Object getBack(){
    return back;
}

public void addListener(ActionListener e){
    back.addActionListener(e);
}
    
public void setTableInt(ArrayList<PaketWisata> p){
    String[] header ={"Nama Paket","Lokasi","Fasilitas","Harga","Durasi"};
    String[][] isi = new String[p.size()][5] ;
    for(int i =0;i<p.size();i++){
        if (p.get(i).getTempatWisata().getType().equals("Internasional")){
        isi[i][0] = p.get(i).getNamaPaket();
        isi[i][1] = p.get(i).getTempatWisata().getNamaT();
        isi[i][2] = p.get(i).getTempatWisata().getFasilitas();
        isi[i][3] ="Rp "+ String.valueOf(p.get(i).getHarga());
        isi[i][4] = p.get(i).getDurasi();}
    }
    
    DefaultTableModel tableModel = new DefaultTableModel(isi,header);
    TableInt.setModel(tableModel);
    
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableInt;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pesan;
    // End of variables declaration//GEN-END:variables
}
