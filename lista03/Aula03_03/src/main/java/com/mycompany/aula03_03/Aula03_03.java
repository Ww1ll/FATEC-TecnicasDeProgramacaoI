/*
 * Um  programa  capaz  de  imprimir  todos  os  números
 * primos  em  um  intervalo  de números informado pelo usuário;
 */

package com.mycompany.aula03_03;
import javax.swing.*;

public class Aula03_03 {

    public static void main(String[] args) {
        run();
    }

    public static void run(){
        int limMin = 0;
        int limMax = 0;
        int primo = 0;

        try {
            String min = JOptionPane.showInputDialog(null, "Digite o limite mínimo para a sequência de números primos: ", "Sequência de Números Primos", JOptionPane.INFORMATION_MESSAGE);
            limMin = Integer.parseInt(min);

            String max = JOptionPane.showInputDialog(null, "Digite o limite máximo para a sequência de números primos: ", "Sequência de Números Primos", JOptionPane.INFORMATION_MESSAGE);
            limMax = Integer.parseInt(max);
        } catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Entrada inválida, digite um número", "Error", JOptionPane.ERROR_MESSAGE);
            run(); //fazer um erro para 0
        } finally {

            for(int i = limMin; i <= limMax; i++ ){
                //System.out.printf( "%d ", i);
                if(i == 1 || i == 0){
                        primo = 0;
                        //System.out.printf("dentro do if=%d ",primo);
                }

                else {
                    //System.out.printf("dentro do else=%d ",primo);
                    for(int j = 2;  j <= i; j++){
                        if (i % j == 0){
                            primo = 1 + primo;
                            //System.out.printf("dentro do for %d ",primo);
                        }
                        if (primo > 1){
                            //System.out.printf("toaquiiii ");
                            primo = 0;
                            break;
                        }
                    }
                }
                //System.out.printf("fora do if=%d ",primo);
                if (primo == 1) { //se é primo
                    System.out.printf("%d ", i);
                }
                //System.out.printf("fim %d ",primo);
                primo = 0;
                //System.out.printf("fim 2 %d ... ",primo);
            }
        }
    }
}


