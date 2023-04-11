/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula2_1;
import javax.swing.*;
/**
 *
 * @author labs
 */
public class Aula2_1 {

    public static void main(String[] args) {
         int i = 0;
         
         
         String valor = JOptionPane.showInputDialog(null, "Por favor, digite um valor para verificar se é múltiplo de 3:", "Calculadora Múltipla de 3", JOptionPane.PLAIN_MESSAGE);

          
         
         if (( Integer.parseInt(valor) % 3) == 0){
             JOptionPane.showMessageDialog(null, "O número " + valor + " é múltiplo de 3.");
         }
         else {
             JOptionPane.showMessageDialog(null, "O número " + valor + " não é múltiplo de 3.");
         }
         
         
         
    }
}
