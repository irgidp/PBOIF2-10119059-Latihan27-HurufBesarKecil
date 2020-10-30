/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan huruf besar kecil
 */
package pboif2.pkg10119059.latihan27.hurufbesarkecil;

/**
 *
 * @author Corazon
 */

import java.util.Scanner;
public class PBOIF210119059Latihan27HurufBesarKecil {

    public static void besar(String kalimat){
        String strUpper = kalimat.toUpperCase();
        System.out.println("Huruf Besar : "+strUpper);
    }
    
     public static void kecil(String kalimat){
        String strLower = kalimat.toLowerCase();
        System.out.println("Huruf Kecil : "+strLower);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kalimat;
        
    
        System.out.print("Masukkan Kalimat : ");
        kalimat = input.nextLine();
        
        System.out.println("");
        System.out.println("====Hasil Formating====");
        besar(kalimat);
        kecil(kalimat);
    }
    
}
