/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif11k.pkg10118905.latihan19.saldotabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
/**
 *
 * @author Fitri
 * Nama     : Anindira Dina FItriani
 * Kelas    : IF11-K
 * Nim      : 10118905
 * Deskripsi: Saldo Tabungan
 */
public class PBOIF11K10118905Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       double saldo = 2500000, lama =6, bunga =(double)0.15;
       for (int i = 1; i <= lama; i ++){
       saldo +=(saldo*bunga);
        System.out.printf("saldo di bulan ke-"+i+"Rp. %,9.0f \n",saldo);
        
        }
    }   
}
 
