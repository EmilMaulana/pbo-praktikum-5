/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_5;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Data_Mahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("NPM : ");
        String npm = input.nextLine();
        
        System.out.print("NAMA : ");
        String nama = input.nextLine();
        
        System.out.print("NILAI KEHADIRAN : ");
        int hadir = input.nextInt();
        
        System.out.print("NILAI TUGAS : ");
        int tugas = input.nextInt();
        
        System.out.print("NILAI UTS : ");
        int uts = input.nextInt();
        
        System.out.print("NILAI UAS : ");
        int uas = input.nextInt();
        
        
        // Menghitung nilai akhir
        double n_akhir = (0.1 * hadir) + (0.2 * tugas) + (0.3 * uts) + (0.4 * uas);
        
        // Menentukan Grade
        String grade;
        if (n_akhir >= 76) {
            grade = "A";
        } else if (n_akhir >= 66) {
            grade = "B";
        } else if (n_akhir >= 56) {
            grade = "C";
        } else if (n_akhir >= 46) {
            grade = "D";
        } else {
            grade = "E";
        }
        
        // Menentukan Keterangan
        String ket;
        if (n_akhir >= 76) {
            ket = "ISTIMEWA";
        } else if (n_akhir >= 66) {
            ket = "BAIK";
        } else if (n_akhir >= 56) {
            ket = "CUKUP";
        } else if (n_akhir >= 46) {
            ket = "KURANG";
        } else {
            ket = "KURANG SEKALI";
        }
        
        System.out.println("=======================================");
        System.out.println("             DATA MAHASISWA            ");
        System.out.println("=======================================");
        
        System.out.println("NPM MAHASISWA : "+npm);
        System.out.println("NAMA MAHASISWA : "+nama);
        System.out.println("NILAI AKHIR : "+n_akhir);
        System.out.println("GRADE : "+grade);
        System.out.println("GRADE : "+ket);
        
        
    }
    
}
