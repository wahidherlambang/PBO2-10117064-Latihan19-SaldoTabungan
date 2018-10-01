/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117064.latihan19.saldotabungan;

/**
 *
 * @author WAHID HERLAMBANG
 * NAMA     : Wahid Herlambang Suroso
 * KELAS    : PBO2
 * NIM      : 10117064
 * Deskripsi Program : Program ini berisi program untuk mengetahui 
 * saldo tabungan pada bulan tertentu.
 */
public class PBO210117064Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int bulan = 6;
        int i = 1;
        int saldoTabungan = 2500000;
        double bunga = 0.15;
        double saldoBulanan;
        
        while (i <= bulan) {
            saldoBulanan = bunga * saldoTabungan;        
            saldoTabungan = (int) (saldoTabungan + saldoBulanan);
            System.out.println("Saldo di bulan ke-" + i + " Rp." + 
                    (int)saldoTabungan);
            i++;
        }           
    }
    
}
