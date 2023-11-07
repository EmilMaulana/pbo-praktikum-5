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
public class Diskon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=======================================");
        System.out.println("             PROGRAM DISKON            ");
        System.out.println("=======================================");
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Total Pembelian : ");
        int total = input.nextInt();
        
        int diskon,total_bayar;
        
        if (total < 50000){
            diskon = total*5/100;
            total_bayar = total - diskon;
            System.out.println("Jumlah Yang Harus Dibayarkan Rp. " +total_bayar);
        } else if (total >= 50000) {
            diskon = total*20/100;
            System.out.println("Besarnya Potongan Rp. " +diskon);
            total_bayar = total - diskon;
            System.out.println("Jumlah Yang Harus Dibayarkan Rp. " +total_bayar);
        }
        
    }
        
    
}
