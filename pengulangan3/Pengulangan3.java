/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pengulangan3;

import java.util.Scanner;
/**
 *
 * @author rhisma syahrul putra
 */
public class Pengulangan3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan nilai N: ");
        int N = scanner.nextInt();
        
        if(N == 0){
            System.out.println("masukkan nilai n yang lebih besar dari 0 dan 1");
            System.out.println("Nilai faktorial 0! = 1");
        } else {
            int jumlahFaktorial = 1;
            String faktor = "";
            
            for (int i = 1; i <= N; i++){
                jumlahFaktorial *= i;
                
                if(i == 1){
                    faktor += i;
                } else {
                    faktor += " * " + i;
                }
            }
            
            System.out.println(N + "! = " + faktor + " = " + jumlahFaktorial);
        }
    }
    
}
