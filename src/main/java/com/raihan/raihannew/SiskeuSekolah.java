/*
 * Aplikasi Raihan
 * Universitas Duta Bangsa
 */
package com.raihan.raihannew;

import com.raihan.raihannew.form.DialogLogin;
import com.raihan.raihannew.form.FormUtama;
import java.sql.SQLException;
/**
 *
 * @author Raihan
 */
public class SiskeuSekolah {
    public static FormUtama tampilanUtama;
    public static DialogLogin tampilanLogin;
    
    public static void main(String[] args) {
        System.out.println("Menjalankan aplikasi SIKEU - Sekolah");
        Koneksi cek = new Koneksi();
        try {
            cek.konekDB.close(); //tutup koneksi
        } catch (SQLException ex) {
            
        }
        
        tampilanUtama = new FormUtama();
        tampilanLogin = new DialogLogin(tampilanUtama, true);
        tampilanLogin.setVisible(true);
    }
}
