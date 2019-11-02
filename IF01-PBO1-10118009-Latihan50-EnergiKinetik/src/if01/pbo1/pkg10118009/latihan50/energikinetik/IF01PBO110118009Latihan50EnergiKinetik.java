/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pbo1.pkg10118009.latihan50.energikinetik;

/**
 * Nama = Tassyakur Pasya
 * Kelas = IF01
 * NIM = 10118009
 * Deskripsi Program = Energi Kinetik
 * @author LENOVO
 */
public class IF01PBO110118009Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EnergiKinetik ek = new EnergiKinetik();
        ek.setMassa(175);
        ek.setKecepatan(25);
        
        System.out.println("====Energi Kinetik====");
        System.out.println("Massa : "+ek.getMassa());
        System.out.println("Kecepatan : "+ek.getKecepatan());
        System.out.println("Volume : "+ek.Volume(ek.getMassa()));
        System.out.println("\nEnergi Kinetiknya adalah: "+ek.energiKinetik(ek.getMassa(), ek.getKecepatan()));
        System.out.println("Usaha dimulai dalam keadaan diam adalah : "+ek.energiKinetik(ek.getMassa(), ek.getKecepatan()));
    }
    
}
