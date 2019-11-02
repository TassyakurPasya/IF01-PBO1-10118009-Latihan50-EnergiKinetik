/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pbo1.pkg10118009.latihan50.energikinetik;

/**
 *
 * @author LENOVO
 */
public class EnergiKinetik {
    private int massa;
    private int kecepatan;

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }
    public double energiKinetik(int massa, int kecepatan){
        double eK = (massa*kecepatan*kecepatan*0.5)/1000;
        return eK; 
    }
    public double Volume(int massa){
        double Volume = (massa*massa*massa)*0.001;
        return Volume;
    }
    public double usaha(){
        double usaha=(energiKinetik(massa, kecepatan)-energiKinetik(massa, 0));
        return usaha;
        
    }
    
            
}
