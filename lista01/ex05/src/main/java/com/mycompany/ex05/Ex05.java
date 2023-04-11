/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ex05;


import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author labs
 */
public class Ex05 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        float volume, raio = 0;
        final float PI = 3.14159f;
        float altura = 0;
        
        
        System.out.println("Insira a altura");
        altura =  leitor.nextFloat();
        
        System.out.println("Insira o raio");
        raio = leitor.nextFloat();
        
        volume = (float) (PI *(Math.pow(raio, 2))* altura);
        
        System.out.printf("\nVolume=%f", volume);
 
        
        leitor.close();
    }
}
