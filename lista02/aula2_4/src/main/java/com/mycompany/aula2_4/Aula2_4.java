/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula2_4;
import javax.swing.JOptionPane;

/**
 *
 * @author labs
 */
public class Aula2_4 {

    public static void main(String[] args) {
        
        String idade = JOptionPane.showInputDialog(null, "Informar a idade", "Classe Eleitoral", JOptionPane.QUESTION_MESSAGE);
        
        int anos = Integer.parseInt(idade);
        
        if(anos < 16){
            JOptionPane.showMessageDialog(null, "Não Eleitor", "Classe eleitoral", JOptionPane.INFORMATION_MESSAGE);
            
            
        } else if(anos >= 18 && anos <= 65){
            JOptionPane.showMessageDialog(null, "Eleitor obrigatório", "Classe eleitoral", JOptionPane.INFORMATION_MESSAGE);
            
        } else if ((anos >= 16 && anos < 18) || anos > 65){
            JOptionPane.showMessageDialog(null, "Eleitor facultativo", "Classe eleitoral", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
    }
}
