/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula2_2;
import javax.swing.JOptionPane;


/**
 *
 * @author labs
 */
public class Aula2_2 {

    public static void main(String[] args) {
        
        String numero1 = JOptionPane.showInputDialog(null, "Digite o primeiro valor", "Ordem Crescente", JOptionPane.QUESTION_MESSAGE);
        String numero2 = JOptionPane.showInputDialog(null, "Digite o segundo valor", "Ordem Crescente", JOptionPane.QUESTION_MESSAGE);
        String numero3 = JOptionPane.showInputDialog(null, "Digite o terceiro valor", "Ordem Crescente", JOptionPane.QUESTION_MESSAGE);
        
      
        
        
        if((Integer.parseInt(numero1) > Integer.parseInt(numero2)) && (Integer.parseInt(numero2) > Integer.parseInt(numero3))){
            JOptionPane.showMessageDialog(null, String.format("A ordem é: %d, %d, %d",  Integer.parseInt(numero3), Integer.parseInt(numero2), Integer.parseInt(numero1)), "Sequencial", JOptionPane.DEFAULT_OPTION);
            
            
        } else if((Integer.parseInt(numero1) > Integer.parseInt(numero3)) && (Integer.parseInt(numero3) > Integer.parseInt(numero2))){
            JOptionPane.showMessageDialog(null, String.format("A ordem é: %d, %d, %d",  Integer.parseInt(numero2), Integer.parseInt(numero3), Integer.parseInt(numero1)), "Sequencial", JOptionPane.DEFAULT_OPTION);
            
            
        }else if((Integer.parseInt(numero2) > Integer.parseInt(numero3)) && (Integer.parseInt(numero3) > Integer.parseInt(numero1))){
             JOptionPane.showMessageDialog(null, String.format("A ordem é: %d, %d, %d",  Integer.parseInt(numero1), Integer.parseInt(numero3), Integer.parseInt(numero2)), "Sequencial", JOptionPane.DEFAULT_OPTION);
            
            
        }else if((Integer.parseInt(numero2) > Integer.parseInt(numero1)) && (Integer.parseInt(numero1) > Integer.parseInt(numero3))){
             JOptionPane.showMessageDialog(null, String.format("A ordem é: %d, %d, %d",  Integer.parseInt(numero3), Integer.parseInt(numero2), Integer.parseInt(numero1)), "Sequencial", JOptionPane.DEFAULT_OPTION);
            
            
        }else if((Integer.parseInt(numero3) > Integer.parseInt(numero2)) && (Integer.parseInt(numero2) > Integer.parseInt(numero1))){
             JOptionPane.showMessageDialog(null, String.format("A ordem é: %d, %d, %d",  Integer.parseInt(numero1), Integer.parseInt(numero2), Integer.parseInt(numero3)), "Sequencial", JOptionPane.DEFAULT_OPTION);
            
            
        }else if((Integer.parseInt(numero3) > Integer.parseInt(numero1)) && (Integer.parseInt(numero1) > Integer.parseInt(numero2))){
             JOptionPane.showMessageDialog(null, String.format("A ordem é: %d, %d, %d",  Integer.parseInt(numero2), Integer.parseInt(numero1), Integer.parseInt(numero3)), "Sequencial", JOptionPane.DEFAULT_OPTION);
                
        }
    }    
}
