/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author kentj
 */
public class Ideal {
    private double tb, bb, tot, bi;
    private String info, beratideal;

    public double getTot() {
        return tot = this.bb / (this.tb * this.tb);
    }

    public String getInfo() {
        return info;
    }

    public void setTb(double tb) {
        this.tb = tb / 100;
    }

    public void setBb(double bb) {
        this.bb = bb;
    }
    
    void hasilInfo(){
        if(getTot() < 18.5){
            this.info = "ANDA TERLALU KURUS";
        }else if(getTot() < 24.9){
            this.info = "BERAT BADAN ANDA IDEAL";
        }else if(getTot() < 29.9){
            this.info = "ANDA OVERWEIGHT";
        }else if(getTot() > 30.0){
            this.info = "ANDA OBESITAS, SEGERA KE DOKTER!";
        }
    }
}
