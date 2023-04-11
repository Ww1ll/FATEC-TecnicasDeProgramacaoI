/*
Calcule o peso ideal de uma pessoaatravés de uma função que não retorne valor. 
Dados de entrada: altura e sexo. Fórmulas para cálculo do peso:

peso ideal de homem = (72,7 x altura) -58
peso ideal da mulher = (62,1 x altura) -44,7
*/

package com.mycompany.aula4_4;
import javax.swing.*;

public class Aula4_4 {

    public static void main(String[] args) {
        String sexo = "";
        String h = "";
        float altura;
        String masc = "Masculino";
        String femi = "Feminino";
        //System.out.println(h.isEmpty());
        
        do {    
        sexo = JOptionPane.showInputDialog(null, "Digite o seu sexo: ", "Peso Ideal", 1);
        
        h = JOptionPane.showInputDialog(null, "Digite a sua altura:", "Peso Ideal", 1);
        //System.out.println(h.isEmpty());
        
        } while ( ((!sexo.contains(masc)) && (!sexo.contains(femi))) || (h.isEmpty()) );
        
        altura = Float.parseFloat(h);
        pesoIdeal(altura, sexo);

       
    }
    
    public static void pesoIdeal(double altura, String sexo) {
        double peso;
        if (sexo.equals("Masculino")) {
            peso = (72.7 * altura) - 58;
        } else {
            peso = (62.1 * altura) - 44.7;
        }
        
        JOptionPane.showMessageDialog(null, "Seu peso ideal é " + String.format("%.2f", peso), "Peso Ideal", 1);
        
    }
    
}
