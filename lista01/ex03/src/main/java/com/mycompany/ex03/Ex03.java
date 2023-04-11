/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ex03;

import java.util.Scanner;

/**
 *
 * @author labs
 */
public class Ex03 {

    public static void main(String[] args) {
        
       Scanner leitor = new Scanner(System.in);
       
       float num1, num2, media = 0;
       
        System.out.println("Informe o primeiro valor");
        num1 = leitor.nextFloat();
        
        System.out.println("Informe o segundo valor");
        num2 = leitor.nextFloat();
       
        media = num1 + num2 / 2;
        
        System.out.printf("\nA media dos valores é: %f", media);
        
       
       leitor.close();
       
    }
}
