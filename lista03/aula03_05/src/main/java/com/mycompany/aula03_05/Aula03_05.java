/*
 Criar um programa que leia um número que será o limite superior de
 um intervalo e o incremento. Exibir todos os números naturais no intervalo de 0 até esse número.
 Suponha que os dois números lidos são maiores que zero. Exemplo:
 Limite superior: 20
 Incremento: 5
 Saída: 0  5  10  15  20
 */

package com.mycompany.aula03_05;
import javax.swing.JOptionPane;

public class Aula03_05 {

    public static void main(String[] args) {
        run();

    }

    public static void run() {

        int limMax = 0;
        int incremento = 0;

        try {

            String b = JOptionPane.showInputDialog(null, "Digite o limite máximo", "Intervalo de pares", JOptionPane.INFORMATION_MESSAGE);
            limMax = Integer.parseInt(b);
            //System.out.println("O limite máximo é " + limMax);

            String a = JOptionPane.showInputDialog(null, "Digite o incremento", "Intervalo de pares", JOptionPane.INFORMATION_MESSAGE);
            incremento = Integer.parseInt(a);
            //System.out.println("O limite inferior é " + incremento);

            if((incremento > limMax ) || (incremento < 0) || (limMax < 0)){
                throw new Exception ("valorIncremento");
            }
            //Não tem como criar mais de um exception com throw new
           
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida, digite um número positivo.", "Error", JOptionPane.ERROR_MESSAGE);

            run();
            
        } catch(Exception valorIncremento){
            JOptionPane.showMessageDialog(null, "O valor incremental ou máximo está inadequado, pense mais um pouco!", "Error", JOptionPane.ERROR_MESSAGE);
            run();
        }
        finally {

            int y = 0;

            System.out.printf("Os números naturais até %d com um incremento de %d são: \n", limMax, incremento);

            for (y = 0; y <= limMax; y += incremento) {
                System.out.println(y);
            }

        }

    }

}
