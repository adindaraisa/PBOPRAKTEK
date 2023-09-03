/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2_pbo_221511035;

import java.io.IOException;

/**
 * <h1> Add Two Numbers! </h1>
 * The AddNum program implements an apllication that 
 * simply adds two given integer numbers and Prints
 * the output on the screen
 * 
 */

/**
 *
 * @author adinda
 */
public class Tugas2_PBO_221511035 {

    /**
     * @param numA
     * @param numB
     * @return 
     */
    public int addNum(int numA, int numB) {
        return numA + numB;
        // TODO code application logic here
    }
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Tugas2_PBO_221511035 obj = new Tugas2_PBO_221511035 ();
        int sum = obj.addNum(10, 20);
        
        System.out.println("Sum of 10 and 20 is :" + sum);
    }
    
}
