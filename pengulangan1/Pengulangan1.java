/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pengulangan1;

import java.util.Scanner;
/**
 *
 * @author rhisma syahrul putra
 */
public class Pengulangan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("masukkan nilai n : ");
        int n = scanner.nextInt();
        
        if (n < 1) {
            System.out.println("nilai N harus lebih besar sama dengan 1");
        } else {
            System.out.println("Bilangan dari 1 sampai dengan " + n + " adalah");
            
            for(int i = 1; i <= n; i++){
                System.out.print(i + " ");
            }
        }
                
    }
    
}
