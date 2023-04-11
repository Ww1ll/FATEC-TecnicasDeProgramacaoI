/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex1;
import java.io.PrintStream;
import java.util.Scanner;
/**
 *
 * @author labs
 */
public class Ex1 {

    public static void main(String[] args) {
        
        float valor, valor_final;
        String nome;
        final float PERCENTAGE = 0.91f;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nome do Produto: ");
        nome = input.next();
        
        System.out.println("Valor Unitário: ");
        valor = input.nextFloat();
      
        valor_final = (float) (PERCENTAGE*valor);
        
      System.out.printf("\nValor Final do Produto = %f", valor_final);
               
}
}