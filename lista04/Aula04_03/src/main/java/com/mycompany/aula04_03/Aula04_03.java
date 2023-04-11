/*
3 Dados três valores X, Y e Z, verificar se eles podem ser os comprimentos dos lados de
um triângulo , através de uma função que retorne valor, e, se forem verificar se é um
triângulo equilátero, isósceles ou escalenos. Se eles não formarem um triângulo, escrever
a mensagem. Considere as seguintes propriedades:
• O comprimento de cada lado em um triângulo é menor que a soma dos outros dois
lados;
• Equiláteros: tem os comprimentos dos três lados iguais;
• Isósceles: tem os comprimentos de dois lados iguais;
• escaleno: tem os comprimentos dos três lados diferentes.
 */
package com.mycompany.aula04_03;

import javax.swing.*;

public class Aula04_03 {

    public static void main(String[] args) {

        String a = JOptionPane.showInputDialog(null, "Informe o primeiro valor", "Verificar se é um triângulo", JOptionPane.INFORMATION_MESSAGE);
        double x = Double.parseDouble(a);

        String b = JOptionPane.showInputDialog(null, "Informe o segundo valor", "Verificar se é um triângulo", JOptionPane.INFORMATION_MESSAGE);
        double y = Double.parseDouble(b);

        String c = JOptionPane.showInputDialog(null, "Informe o terceiro valor", "Verificar se é um triângulo", JOptionPane.INFORMATION_MESSAGE);
        double z = Double.parseDouble(c);

		if (!notTriangle(x, y, z)) {
			JOptionPane.showMessageDialog(null, "Valores não formam um triângulo!", "Verificar se é um triângulo", JOptionPane.INFORMATION_MESSAGE);
		} else {
			
			 String triangulo = validarTriangulo(x, y, z);

			JOptionPane.showMessageDialog(null, "A forma é um triângulo: " + triangulo, "Verificar se é um triângulo", JOptionPane.PLAIN_MESSAGE);
		}

       
    }
	
	public static boolean notTriangle(double x, double y, double z){
		
		if ((x > y + z) ||(y > x + z) || (z > x + y)){
			return false;
		} 

		return true;
	}

    public static String validarTriangulo(double x, double y, double z) {

		if ((x == y) && (y == z)){
			return "Equilátero";
		} else if (((x == y) && (y != z)) || (y == z) && (z != x) || (x == z) && (z != y)){
			return "Isóceles";
		} else {
			return "Escaleno";
		}
    }

}

