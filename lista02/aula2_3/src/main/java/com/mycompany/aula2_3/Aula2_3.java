/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula2_3;
import javax.swing.*;

/**
 *
 * @author labs
 */
public class Aula2_3 {

    public static void main(String[] args) {
        
        String produto = JOptionPane.showInputDialog(null, "Qual o valor do produto?", "Valor do produto", JOptionPane.QUESTION_MESSAGE);
        
        float valorProduto = Float.parseFloat(produto);
        
        if(valorProduto < 20){
            
            valorProduto = 0.45f * valorProduto + valorProduto;
            
            JOptionPane.showMessageDialog(null, String.format("O valor final será de R$%.2f", valorProduto), "Valor de venda", JOptionPane.WARNING_MESSAGE);
            
        } else {
            
            valorProduto = 0.30f * valorProduto + valorProduto;
            JOptionPane.showMessageDialog(null, String.format("O valor final será de R$%.2f", valorProduto), "Valor de venda", JOptionPane.WARNING_MESSAGE);
        }
        
        
    }
}
