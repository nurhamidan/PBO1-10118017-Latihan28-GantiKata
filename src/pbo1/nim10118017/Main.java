/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.nim10118017;

import java.util.Scanner;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Mengubah kata dalam kalimat sesuai dengan yang dispesifikasikan.
 * 
 */
public class Main {
    //Konstanta
    public static final String FOOTER = "\n(Developed by : Agung Nurhamidan)";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("====Program Pengganti Kata====\n");
        inputKalimat();
        
        System.out.println(FOOTER);
    }
    
    public static void inputKalimat() {
        //Deklarasi variabel.
        String kalimat;
        String kataAwal;
        String kataGanti;
        Scanner scanner = new Scanner(System.in);
        //Memasukkan data.
        System.out.print("Masukkan Kalimat : ");
        kalimat = scanner.nextLine();
        System.out.print("Ganti Kata : ");
        kataAwal = scanner.nextLine();
        System.out.print("Menjadi Kata : ");
        kataGanti = scanner.nextLine();
        
        gantiKata(kalimat, kataAwal, kataGanti);
    }
    
    public static void gantiKata(String kalimat, String kataAwal, String kataGanti) {
        //Menampilkan hasil.
        System.out.println("\n====Hasil Formatting====");
        System.out.println("Kalimat Awal : " + kalimat);
        System.out.println("Kalimat Baru : " + kalimat.replaceAll("(?i)".concat(kataAwal), kataGanti));
    }
    
}
