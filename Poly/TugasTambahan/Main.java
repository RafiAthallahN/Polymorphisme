/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasTambahan;

/**
 *
 * @author W10
 */
public class Main {
     public static void main(String[] args) {
        
        double a = 10.5, b = 4.5;
        //OperasiBilanganAbs 
        OperasiBilanganAbs penjumlahan = new OperasiPenjumlahan();
        OperasiBilanganAbs pengurangan = new OperasiPengurangan();
        OperasiBilanganAbs perkalian = new OperasiPerkalian();
        OperasiBilanganAbs pembagian = new OperasiPembagian();
        //membuat array berisikan objek
        OperasiBilanganAbs[] objek = {penjumlahan, pengurangan, perkalian, pembagian };
        
        OperasiBilanganAbsCetak pencetak = new OperasiBilanganAbsCetak();
        pencetak.cetakSemua(objek, a, b);
}
}