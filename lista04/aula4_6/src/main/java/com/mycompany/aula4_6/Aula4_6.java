/*
 * Escreva um programa para ler um valor e escrever a soma da sua tabuada de 1 até 10
	Ex:
	Digite Numero
	5
	Soma da Tabuada = 275
 */

package com.mycompany.aula4_6;

import javax.swing.JOptionPane;

public class Aula4_6 {

    public static void main(String[] args) {
		
        String numero = (JOptionPane.showInputDialog(null, "Digite o valor: ", "Tabuada", JOptionPane.INFORMATION_MESSAGE));
		var num = Integer.parseInt(numero);

		JOptionPane.showMessageDialog(null, "A soma da tabuada de " + num + " = " + calcularSomaTabuada(num) + "", "tabuada", JOptionPane.INFORMATION_MESSAGE);
    }
	
	public static int calcularSomaTabuada(int num){
		
		int novoNum = 0;
		for (int i = 1; i < 11; i++) {
			novoNum += i * num;
		}

		return novoNum;
	}
}
