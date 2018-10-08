/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunjanganmang;

/**
 *
 * @author DEADPOOL
 */
public class gaPok {
    public double tunjangan;
    public double gaji1;
    public double totGaji;
    public String status;
            
            public double hitungTunjangan () {
            tunjangan = (status.equals("Menikah"))? 0.35 * gaji1:0;
            
            return tunjangan;
            }
            public double hitungTotalgaji () {
            totGaji = tunjangan + gaji1;
            
            return totGaji;
            
            }
            }
            
    

