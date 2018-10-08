/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunjanganmang;

import java.util.Scanner;

/**
 *
 * @author DEADPOOL
 */
public class TunjanganMang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        gaPok gpk = new gaPok();
        
        Scanner sc = new Scanner (System.in);
        System.out.println("=====Program Tunjangan=====" );
        System.out.print("Berapa Gaji Pokok Anda Perbulan ? : ");
        gpk.gaji1 = sc.nextDouble();
        System.out.print("Status Anda ?(Menikah/Belum) : ");
        gpk.status = sc.next();
        System.out.println("");
        System.out.println("=====Hasil Perhitungan Gaji Anda=====");
        System.out.println("Gaji Pokok : " + gpk.gaji1);
        System.out.println("Tunjangan  : " + gpk.hitungTunjangan ());
        System.out.println("Total Gaji  : " + gpk.hitungTotalgaji ());
    }
    
}
