/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pengulangan2;

import java.util.Scanner;
/**
 *
 * @author rhisma syahrul putra
 */
public class Pengulangan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("masukkan batas awal : ");
        int batasAwal = scanner.nextInt();
        
        System.out.print("masukkan batas akhir : ");
        int batasAkhir = scanner.nextInt();
        
        int banyakGanjil = 0;
        int banyakGenap = 0;
        
        for (int i = batasAwal; i <= batasAkhir; i++){
            if (i % 2 != 0) {
                banyakGanjil++;
            }else if (i % 2 == 0){
                banyakGenap++;
            }
        }
        System.out.println("Banyaknya bilangan ganjil antara " + batasAwal + " dan " + batasAkhir + " adalah: " + banyakGanjil);
        System.out.println("Banyaknya bilangan genap antara " + batasAwal + " dan " + batasAkhir + " adalah: " + banyakGenap);
    }
    
}
