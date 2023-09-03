/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strings_no5;

import java.util.Scanner;

/**
 *
 * @author adinda
 */
public class Strings_No5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.nextLine();
        String b = sc.nextLine();
        
        int length = a.length() + b.length();
        
        System.out.println("Panjang string: " + length);
        
        int result = a.compareToIgnoreCase(b);
        
        if (result < 0){
            System.out.println("Yes");
        
        } else if (result > 0){
            System.out.println("No");
        }
        
        String satu = a.substring(0, 1).toUpperCase();
        String dua = b.substring(0, 1).toUpperCase();
        
        satu += a.substring(1);
        dua += b.substring(1);
        
        System.out.println(satu + " " + dua);
        
        // TODO code application logic here
    }
    
}
