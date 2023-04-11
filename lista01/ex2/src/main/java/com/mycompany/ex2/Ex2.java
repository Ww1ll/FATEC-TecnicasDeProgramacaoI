/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex2;

import java.util.Scanner;

/**
 *
 * @author labs
 */
public class Ex2 {

    public static void main(String[] args) {
      final float SALARIO_MIN = 1302.0f;
      float salario, valor_final;
        
      Scanner input = new Scanner(System.in);
        
      System.out.printf("Salário: ");
      salario = input.nextFloat();
      
      valor_final = salario / SALARIO_MIN; 
        
      System.out.printf("\nVocê recebe %f salário mínimos", valor_final);
    }
}
