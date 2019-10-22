/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan42;

/**
 *
 * @author lutfi
 * NAMA : LUTFI RAMADHAN
 * NIM  : 10118908
 * KELAS : IF 11 KARYAWAN
 */
class Tabungan {
    private int saldo;
    
    public void tabungan(int saldo){
        this.saldo = saldo;
    }
    
    public int ambilUang(int jumlah){
        return saldo-jumlah;
    }
}
