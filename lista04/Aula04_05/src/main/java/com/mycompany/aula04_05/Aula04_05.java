/*
5 Num determinado Estado, para transferências de veículos, o DETRAN cobra uma taxa
de 1% para carros fabricados antes de 1990 e uma taxa de 1.5% para os fabricados de
1990 em diante, taxa esta incidindo sobre o valor de tabela do carro. O projeto deve ler o
ano e o preço do carro e a seguir calcular e exibir o imposto a ser pago, através de uma
função que retorne valor.
*/
package com.mycompany.aula04_05;
import javax.swing.*;

public class Aula04_05 {

    public static void main(String[] args) {
        
        
        String year = JOptionPane.showInputDialog(null, "Informe o ano do carro", "DETRAN", JOptionPane.QUESTION_MESSAGE);
        int ano = Integer.parseInt(year);
        
        String price = JOptionPane.showInputDialog(null, "Informe o valor de tabela do carro", "DETRAN", JOptionPane.QUESTION_MESSAGE);
        float preco = Float.parseFloat(price);
        
        float calculoTaxa = calcularTaxa(ano, preco); 
        
        JOptionPane.showMessageDialog(null, "O valor da taxa é: " + calculoTaxa, "DETRAN", JOptionPane.WARNING_MESSAGE);
        
        
    }
    
    public static float calcularTaxa(int ano, float preco){
    
        float valor = 0;
        
        if(ano < 1990){
            
  
            return valor = (float)(preco * 0.01);
        }
        
       
        return valor = (float) (preco * 0.015);
    
    } 
}


