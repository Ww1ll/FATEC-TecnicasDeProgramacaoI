/*
 * Um  programa  que  imprima  até  o  “n”  termo  a  seqüênciade  Fibonacci.
 * Série: 0,1,1,2,3,5,8,13,21...
 *
 * Por exemplo, imprimir até o 6º termo:  1, 1, 2, 3, 5, 8
 */

package com.mycompany.aula03_02;
import javax.swing.JOptionPane;

public class Aula03_02 {

    public static void main(String[] args) {
        run();
    }

    public static void run() {

        int n1 = 0;
        int n2 = 1;
        int soma = 0;
        int limMax = 0;

        try {

            String n = JOptionPane.showInputDialog(null, "Digite a quantidade de n termos desejados para a sequência de Fibonacci: ", "Sequência de Fibonacci", JOptionPane.INFORMATION_MESSAGE);
            limMax = Integer.parseInt(n);
            //System.out.println("O limite máximo é " + limMax);
            
            //Não tem como criar mais de um exception com throw new

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Entrada inválida, digite um número", "Error", JOptionPane.ERROR_MESSAGE);
            run();
        }
        finally {

            if (limMax == 3) {
                System.out.printf("A série de Fibonacci até o termo n = %d é: \n", limMax);
                System.out.printf(n1 + " " + n2 + " " + n2);
            }
            else if (limMax == 2){
                System.out.printf("A série de Fibonacci até o termo n = %d é: \n", limMax);
                System.out.printf(n1 + " " + n2);
            }
            else if (limMax == 1){
                System.out.printf("A série de Fibonacci até o termo n = %d é: \n", limMax);
                System.out.println(n1);
            }
            else if (limMax == 0 || limMax < 0) {
                JOptionPane.showMessageDialog(null, "Entrada inválida, digite um número positivo", "Error", JOptionPane.ERROR_MESSAGE);
                run();
            } else {
                System.out.printf("A série de Fibonacci até o termo n = %d é: \n", limMax);
                System.out.printf(n1 + " " + n2);
                for (int i = 2; i < limMax; i++) {
                    soma = n1 + n2;
                    System.out.printf(" " + soma);
                    n1 = n2;
                    n2 = soma;
                }
            }
        }
    }

}
