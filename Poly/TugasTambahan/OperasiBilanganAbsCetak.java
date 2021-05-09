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
public class OperasiBilanganAbsCetak {
     public void cetakSemua(OperasiBilanganAbs[] Objek, double a, double b){
        for(int i = 0; i< Objek.length;i++){
            Objek[i].set_A(a);
            Objek[i].set_B(b);
            Objek[i].tampil();
            System.out.println("");
        }
    }
}
