/*
2 Ler número da conta do cliente, saldo, débito e crédito. Após, calcular e escrever o
saldo atual (saldo atual = saldo - débito + crédito), através de uma função que retorne
valor, também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo
Positivo', senão escrever a mensagem 'Saldo Negativo'.
 */
package com.mycompany.aula04_02;

import javax.swing.*;

public class Aula04_02 {

    public static void main(String[] args) {

        
        
        String s = JOptionPane.showInputDialog(null, "Digite o seu saldo", "Cálculo de saldo atual", JOptionPane.INFORMATION_MESSAGE);

        float saldo = Float.parseFloat(s);

        String d = JOptionPane.showInputDialog(null, "Digite o débito", "Cálculo de saldo atual", JOptionPane.INFORMATION_MESSAGE);
        float debito = Float.parseFloat(d);

        String c = JOptionPane.showInputDialog(null, "Digite o crédito", "Cálculo de saldo atual", JOptionPane.INFORMATION_MESSAGE);
        float credito = Float.parseFloat(c);

        float saldoFinal = calcularSaldo(saldo, debito, credito);

        if (saldoFinal > 0) {
            JOptionPane.showMessageDialog(null, "Saldo positivo! ", "Cálculo de saldo atual", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, " O seu saldo atual é: R$ " + saldoFinal, "Cálculo de saldo atual", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "Saldo negativo! ", "Cálculo de saldo atual", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, " O seu saldo atual é: R$ " + saldoFinal, "Cálculo de saldo atual", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public static float calcularSaldo(float saldo, float debito, float credito) {

        float saldoAtual = 0;

        saldoAtual = saldo - debito + credito;

        return saldoAtual;
    }

}

  
