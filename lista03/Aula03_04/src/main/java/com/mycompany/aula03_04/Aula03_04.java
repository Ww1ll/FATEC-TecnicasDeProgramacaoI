/*
Um programa que calcule a média de uma alunonos moldes da Fatec Zona SUL.
 */

package com.mycompany.aula03_04;
import javax.swing.*;

public class Aula03_04 {

    public static void main(String[] args) {
         run();
    }

    public static void run() {
        float P1 = 0;
        float P2 = 0;
        float P3 = 0;
        float T= 0;

        try {
            String a = JOptionPane.showInputDialog(null, "Digite a nota da P1: ", "Média Final", JOptionPane.INFORMATION_MESSAGE);
            P1 = Float.parseFloat(a);

            String b = JOptionPane.showInputDialog(null, "Digite a nota da P2: ", "Média Final", JOptionPane.INFORMATION_MESSAGE);
            P2 = Float.parseFloat(b);

            String trabalho = JOptionPane.showInputDialog(null, "Digite a nota final do trabalho: ", "Média Final", JOptionPane.INFORMATION_MESSAGE);
            T = Float.parseFloat(trabalho);

            String c = JOptionPane.showInputDialog(null, "Digite a nota da P3: ", "Média Final", JOptionPane.INFORMATION_MESSAGE);
            P3 = Float.parseFloat(c);

            if (P1 < 0 || P2 < 0 || T < 0 || P3 < 0){
                throw new Exception("Negativo");
            }


        } catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Entrada inválida, digite um número", "Error", JOptionPane.ERROR_MESSAGE);
            run();
        } catch (Exception Negativo){
            JOptionPane.showMessageDialog(null, "Entrada inválida, digite um número positivo", "Error", JOptionPane.ERROR_MESSAGE);
            run();
        } finally{
            // iif( (P3*0.3499+ P2*0.3501) > (P1*0.3499+ P3*0.3501) ,(P3*0.35 + P2*0.35 + T*0.3) ,(P1*0.35 + P3*0.35 + T*0.3) ) )
            double nota = P1*0.35 + P2*0.35 + T*0.3;

            if ( nota < 6.0) {
                if (P3 > P1 || P3 > P2){
                    if (P2 > P1){
                        nota = P3*0.35 + P2*0.35 + T*0.3;
                    } else {
                        nota = P1*0.35 + P3*0.35 + T*0.3;
                    }
                }
            }
            System.out.printf("Sua nota é %.1f.", nota);
        }
    }
}