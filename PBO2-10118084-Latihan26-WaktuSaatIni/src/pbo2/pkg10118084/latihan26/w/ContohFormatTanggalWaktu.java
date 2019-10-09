/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118084.latihan26.w;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/**
 *
 * @author Freza
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk menampilkan Waktu

 */
public class ContohFormatTanggalWaktu {
    public static void main(String[]args){
        
      String pola = null;
      Locale lokal = null;
      String hasil = null;
      Date tanggalDanWaktu = new Date();
      pola ="EEEE dd MMM yyyy', Pukul' HH:mm:ss";
      hasil = ContohFormatTanggalWaktu.tampilkanTanggalDanWaktu(tanggalDanWaktu, pola ,lokal);
        System.out.println( "Hari ini adalah hari :"+ "\t ----> "+hasil);
        
        
        
    }
    protected static String tampilkanTanggalDanWaktu(Date tanggalDanWaktu,String pola, Locale lokal) {
        String tanggalStr = null;
        SimpleDateFormat formatter = null;
        if (lokal == null) {
            formatter = new SimpleDateFormat(pola);
        } else {
            formatter = new SimpleDateFormat(pola, lokal);
        }
 
        tanggalStr = formatter.format(tanggalDanWaktu);
        return tanggalStr;
    }
}