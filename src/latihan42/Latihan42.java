/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan42;

import java.util.Scanner;

/**
 *
 * @author lutfi
 * NAMA : LUTFI RAMADHAN
 * NIM  : 10118908
 * KELAS : IF 11 KARYAWAN
 */
public class Latihan42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tabungan t = new Tabungan();
        Scanner sc = new Scanner(System.in);
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal : ");
        int saldo = sc.nextInt();
        t.tabungan(saldo);
        System.out.print("Jumlah uang yang diambil : ");
        int tarik = sc.nextInt();
        System.out.println("Saldo Anda Sekarang : "+t.ambilUang(tarik));
    }

}
