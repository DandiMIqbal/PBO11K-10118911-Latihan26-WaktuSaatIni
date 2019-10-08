/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waktusaatini;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 
 * NAMA		: Dandi Muhammad Iqbal
 * KELAS	: PBO11K
 * NIM		: 10118911
 * 
 */
public class WaktuSaatIni {
    public static String getFullDate(){
        DateFormat dateformat = new SimpleDateFormat("dd MMM yyyy H:mm:s");
        Date tanggal = new Date();
        return dateformat.format(tanggal);
    }
    
    public static String getHari(){
        DateFormat dateformat = new SimpleDateFormat("EEEEEE");
        Date date = new Date();
        String hari;
        hari = dateformat.format(date);
        
        /**
        * @Awal Lokasi Kita Berada Saat Ini 
        */
        String[] hari_id = new String[]{"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        String[] hari_en = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (int i = 0; i < 7; i++) {
            if (hari.equals(hari_en[i])) {
                hari = hari_id[i];
            }
        }
        /**
        * @Akhir Lokasi Kita Berada Saat Ini 
        */
        return hari;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String tanggal = getFullDate();
        String hari = getHari();
        System.out.println(hari+", "+tanggal);
    }
    
}
