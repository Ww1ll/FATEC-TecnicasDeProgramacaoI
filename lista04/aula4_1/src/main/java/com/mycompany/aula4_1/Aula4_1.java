/*
1  Ler o  nome  de  um  produto,  o  preço  e  a  quantidade  comprada.  Escreva  o  nome  do produto 
comprado e o valor total a ser pago, considerando que são oferecidos descontos pelo número de unidades compradas, 
segundo a tabela abaixo:
a) Até 10 unidades: valor total
b) De 11 a 20 unidades: 10% de desconto
c) De 21 a 50 unidades: 20% de desconto
d) Acima de 50 unidades: 25% de descontoCalcular o valor total a ser pago através de uma função que retorna valor.
 */

package com.mycompany.aula4_1;
import javax.swing.*;
/**
 *
 * @author labs
 */


public class Aula4_1 {

    
    
    public static String calculaPreco(float preco, int quantidade){
        
        float preco_final;
        
        if (quantidade <= 10){
            preco_final = quantidade * preco;

        } else if (quantidade >= 11 || quantidade <= 20){
            preco_final = quantidade * preco * (float) 0.9;

        } else if (quantidade >= 21 || quantidade <= 50){
            preco_final = quantidade * preco * (float) 0.8;
    
        } else {
            preco_final = quantidade * preco * (float) 0.75;
        
        }
        
        return String.format("%.2f",preco_final);
    }
    
    public static void imprime(){
        float preco = 0;
        int quantidade = 0;
        String nome = "";
        
        try {
        nome = JOptionPane.showInputDialog(null, "Digite o nome do produto", "Nome do Produto", 1);

        String price = JOptionPane.showInputDialog(null, "Digite o preço do produto", "Preço do Produto", 1);
        preco = Float.parseFloat(price);

        String qtde = JOptionPane.showInputDialog(null, "Digite a quantidade de produtos", "Quantidade do Produto", 1);
        quantidade = Integer.parseInt(qtde);


        
        if (preco <= 0 || quantidade <= 0){
            throw new Exception("ValoresNegativos");
        }
        
        String preco_final = calculaPreco(preco, quantidade);
        JOptionPane.showMessageDialog(null, "O produto " + nome + " custará R$" + preco_final, "Valor da Compra", 1);

        
        } catch (Exception ValoresNegativos) {
            JOptionPane.showMessageDialog(null, "Preço ou quantidade inválidos, digite um número positivo.", "Error", JOptionPane.ERROR_MESSAGE);
            imprime();
        } 
    }
    
public static void main(String[] args) {
        imprime();
    }
}