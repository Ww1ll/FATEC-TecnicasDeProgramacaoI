/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula2_5;
import javax.swing.JOptionPane;
/**
 *
 * @author labs
 */
public class Aula2_5 {

    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog(null, "Nome: ", "Cadastro do Nome", JOptionPane.QUESTION_MESSAGE);
        String nascimento = JOptionPane.showInputDialog(null, "Idade: ", "Cadastro da Idade", JOptionPane.QUESTION_MESSAGE);
        int idade = Integer.parseInt(nascimento);

        if(idade < 10){
            JOptionPane.showMessageDialog(null, "O plano de saúde custa R$30,00.", "Valor do Plano de Saúde", JOptionPane.INFORMATION_MESSAGE);
        } else if ((idade > 10) && idade <= 29){
            JOptionPane.showMessageDialog(null, "O plano de saúde custa R$60,00.", "Valor do Plano de Saúde", JOptionPane.INFORMATION_MESSAGE);
        } else if ((idade > 29) && idade <= 45){
            JOptionPane.showMessageDialog(null, "O plano de saúde custa R$120,00.", "Valor do Plano de Saúde", JOptionPane.INFORMATION_MESSAGE);
        }   else if ((idade > 45) && idade <= 59){
            JOptionPane.showMessageDialog(null, "O plano de saúde custa R$150,00.", "Valor do Plano de Saúde", JOptionPane.INFORMATION_MESSAGE);
        }   else if ((idade > 59) && idade <= 65){
            JOptionPane.showMessageDialog(null, "O plano de saúde custa R$250,00.", "Valor do Plano de Saúde", JOptionPane.INFORMATION_MESSAGE);
        }   else if (idade > 65){
            JOptionPane.showMessageDialog(null, "O plano de saúde custa R$400,00.", "Valor do Plano de Saúde", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
}
