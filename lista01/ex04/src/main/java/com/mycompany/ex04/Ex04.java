/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ex04;

import java.util.Scanner;

/**
 *
 * @author labs
 */
public class Ex04 {

    public static void main(String[] args) {
        
        float F = 0;
        float C = 0;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe a temperatura em graus celsius");        
        C = leitor.nextFloat();
        
        F = (9 * C + 160) / 5;
                
        System.out.printf("\nA temperatura em graus Fahrenheit= %f", F);
        
       
        leitor.close();
        
    }
}
