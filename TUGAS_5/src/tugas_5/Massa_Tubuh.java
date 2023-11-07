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
public class Massa_Tubuh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("Program Menentukan Kriteria Kegemukan dengan Indeks Massa Tubuh (IMT)");

        System.out.print("Masukkan Berat Badan (kg): ");
        double beratBadan = input.nextDouble();

        System.out.print("Masukkan Tinggi Badan (m): ");
        double tinggiBadan = input.nextDouble();

        // Menghitung Indeks Massa Tubuh (IMT)
        double IMT = beratBadan / (tinggiBadan * tinggiBadan);

        // Menentukan Kriteria Kegemukan
        String kriteria;
        if (IMT < 18.5) {
            kriteria = "Berat Badan Kurang";
        } else if (IMT >= 18.5 && IMT <= 24.9) {
            kriteria = "Berat Badan Ideal";
        } else if (IMT >= 25 && IMT <= 29.9) {
            kriteria = "Berat Badan Lebih";
        } else if (IMT >= 30 && IMT <= 39.9) {
            kriteria = "Gemuk";
        } else {
            kriteria = "Sangat Gemuk";
        }

        // Menampilkan hasil
        System.out.println("\nHasil:");
        System.out.println("Indeks Massa Tubuh (IMT): " + IMT);
        System.out.println("Kriteria Kegemukan: " + kriteria);
    }
    
}
