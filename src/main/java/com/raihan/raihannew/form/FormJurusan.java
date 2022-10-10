/*
 * Aplikasi Raihan
 * Universitas Duta Bangsa
 */
package com.raihan.raihannew.form;

import com.raihan.raihannew.Koneksi;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Raihan
 */
public class FormJurusan extends javax.swing.JInternalFrame {
    Koneksi kon;
    ResultSet rs;
    String mode;
    
    /**
     * Creates new form FormAkun
     */
    public FormJurusan() {
        initComponents();
        kon = new Koneksi(); //Buat Koneksi
        tampilData(""); //menampilkan Data
    }
    
    private void tampilData(String filter){
        Object[] judulKolom = {"No","id","Nama Jurusan"};
        DefaultTableModel modelAkun = new DefaultTableModel(null,judulKolom);
        tableData.setModel(modelAkun);

        try{
            String sql="select * from jurusan where id like '%"+filter+"%' or nama_jurusan like '%"+filter+"%'";
            rs = kon.perintah.executeQuery(sql);
            int no = 0;
            while (rs.next()) {
                no++;
                String txtId =rs.getString("id");
                String txtNama_jurusan =rs.getString("nama_jurusan");
                String[] barisBaru = {Integer.toString(no), txtId, txtNama_jurusan};
                modelAkun.addRow(barisBaru);
            }
        }catch(Exception salahe){
            System.err.println("Gagal Tampil data: "+salahe.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogForm = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        nama_jurusan = new javax.swing.JTextField();
        simpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        tambah = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        cari = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("Id");

        jLabel3.setText("Nama Jurusan");

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogFormLayout = new javax.swing.GroupLayout(dialogForm.getContentPane());
        dialogForm.getContentPane().setLayout(dialogFormLayout);
        dialogFormLayout.setHorizontalGroup(
            dialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogFormLayout.createSequentialGroup()
                .addGroup(dialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogFormLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(dialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nama_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(dialogFormLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(simpan)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        dialogFormLayout.setVerticalGroup(
            dialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogFormLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(dialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nama_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(simpan)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setMaximizable(true);
        setResizable(true);
        setTitle("FORM JURUSAN");

        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableData);

        tambah.setText("Tambah");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        ubah.setText("Ubah");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });

        jLabel1.setText("Cari");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ubah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambah)
                    .addComponent(ubah)
                    .addComponent(hapus)
                    .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        mode="tambah";
        id.setText(null);
        nama_jurusan.setText(null);
        id.setEnabled(true);
        dialogForm.setTitle("Form Jurusan - Tambah");
        dialogForm.pack();
        dialogForm.setLocationRelativeTo(null);
        dialogForm.setVisible(true);
    }//GEN-LAST:event_tambahActionPerformed

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        // TODO add your handling code here:
        int baris_index = tableData.getSelectedRow();
        if(baris_index >= 0) {
            mode="ubah";
            String id_pilih = (tableData.getModel().getValueAt(baris_index, 1).toString());
            try {
                String sql="select * from jurusan where id='"+id_pilih+"'";
                rs = kon.perintah.executeQuery(sql);
                if (rs.next()) {
                    String txtId = rs.getString("id");
                    String txtNama_jurusan = rs.getString("nama_jurusan");
                    id.setText(txtId);
                    nama_jurusan.setText(txtNama_jurusan);
                    
                    id.setEnabled(false);
                    dialogForm.setTitle("Form Jurusan - Ubah");
                    dialogForm.pack();
                    dialogForm.setLocationRelativeTo(null);
                    dialogForm.setVisible(true);
                }
            } catch (Exception salahe) {
                System.err.println("Gagal Tampil data: "+salahe.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Belum ada data yang dipilih");
        }
    }//GEN-LAST:event_ubahActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        int baris_index = tableData.getSelectedRow();
        if (baris_index >= 0) {
            int jwb = JOptionPane.showConfirmDialog(this, "Yakin mau hapus data ini ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if(jwb == JOptionPane.YES_OPTION) {
                String id_pilih = (tableData.getModel().getValueAt(baris_index, 1).toString());
                try {
                    String sql="delete from jurusan where id='"+id_pilih+"'";
                    kon.perintah.execute(sql);
                    tampilData("");
                } catch (Exception salahe) {
                    System.err.println("Gagal Tampil data: "+salahe.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Belum ada data yang dipilih");
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
        String txtCari = cari.getText();
        tampilData(txtCari);
    }//GEN-LAST:event_cariActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        String txtKode = id.getText();        
        String txtNama_akun = nama_jurusan.getText();
        String sql = "";
        
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String waktu_sekarang = now.format(format);
        
        if (mode == "tambah") {
            sql = "insert into jurusan values ("
                + "'" + txtKode +"',"
                + "'" + txtNama_akun +"',"
                + "'" + waktu_sekarang +"',"
                + "'" + waktu_sekarang +"',"
                + "null"
                + ")";
        } else {
            sql = "update jurusan set nama_jurusan='"+txtNama_akun+"',"
                + "updatedAt='"+waktu_sekarang+"'"
                + "where id='"+txtKode+"'";
        }
        
        try {
            kon.perintah.execute(sql);
            dialogForm.setVisible(false);
            tampilData("");
        } catch (Exception salahe) {
            System.err.println("Gagal Tampil data: "+salahe.getMessage());
            JOptionPane.showConfirmDialog(this, "Gagal Simpan");
        }
    }//GEN-LAST:event_simpanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cari;
    private javax.swing.JDialog dialogForm;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nama_jurusan;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tableData;
    private javax.swing.JButton tambah;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
}
