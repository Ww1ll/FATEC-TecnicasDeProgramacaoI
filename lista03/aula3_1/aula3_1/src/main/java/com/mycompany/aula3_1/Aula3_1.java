/*
 * Um  programa  capaz  de  imprimir  todos  os  números
 * pares  em  um  intervalo de números informador pelo usuário;
 */

package com.mycompany.aula3_1;
import javax.swing.*;

public class Aula3_1 {

     public static void main(String[] args) { 
       
     executa();
     
     }
    
    public static void executa() { 
        
       int limInf = 0;
       int limMax = 0;

        JOptionPane.showMessageDialog(null, "Os números pares entre os limites inferior e superior serão exibidos...", "Intervalo de pares", JOptionPane.INFORMATION_MESSAGE);

        try{



            String a = JOptionPane.showInputDialog(null, "Digite o limite inferior", "Intervalo de pares", JOptionPane.INFORMATION_MESSAGE);
            limInf = Integer.parseInt(a);
            //System.out.println("O limite inferior é " + limInf);
            
            String b = JOptionPane.showInputDialog(null, "Digite o limite máximo", "Intervalo de pares", JOptionPane.INFORMATION_MESSAGE);
            limMax = Integer.parseInt(b);
            //System.out.println("O limite máximo é " + limMax);
            
           
        }
        catch(NumberFormatException nfe)
        {   
            JOptionPane.showMessageDialog(null, "Entrada inválida, digite um número", "Error", JOptionPane.ERROR_MESSAGE);
            executa();
        }
        finally
        {

            int y;
            System.out.printf("Os números entre %d e %d são: \n" , limInf, limMax);
            
            if(limInf % 2 != 0){
                limInf++;
                for( y = limInf; y < limMax; y += 2 ){
                System.out.println(y);
                }
            }
            else {
                for( y = limInf + 2; y < limMax; y += 2 ){
                System.out.println(y);
            
                    }
                
                 }  
            
            }
            
         }
    }

