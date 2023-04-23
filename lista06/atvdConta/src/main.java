import entities.Conta;

import javax.swing.*;


public class main {
    public static void main(String[] args) throws Exception{

        Conta conta1 = new Conta(0);


       int opcao = 5;

       while(opcao != 0) {

           String op = JOptionPane.showInputDialog(null, "[1]-Saldo\n[2]-Depósito\n[3]-Saque\n[4]-Atualizar taxa\n[0]-SAIR", "Conta", JOptionPane.QUESTION_MESSAGE);

           try {
               opcao = Integer.parseInt(op);

           }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Digite um valor numérico", "ERRO", JOptionPane.ERROR_MESSAGE);
           }


           if (opcao == 1) {
               JOptionPane.showMessageDialog(null, "Seu saldo é igual a: " + conta1.getSaldo(), "Saldo", JOptionPane.INFORMATION_MESSAGE);

           } else if (opcao == 2) {
               String Deposito = JOptionPane.showInputDialog(null, "Insira o valor para depósito: ", "Depósito", JOptionPane.QUESTION_MESSAGE);
               double deposito = Double.parseDouble(Deposito);
               conta1.deposita(deposito);

           } else if (opcao == 3) {
               String Saque = JOptionPane.showInputDialog(null, "Insira o valor de saque: ", "Saque", JOptionPane.QUESTION_MESSAGE);
               double saque = Double.parseDouble(Saque);
               conta1.saca(saque);
           } else if (opcao == 4) {
               String Taxa = JOptionPane.showInputDialog(null, "Insira nova taxa: ", "Taxa", JOptionPane.QUESTION_MESSAGE);
               double taxa = Double.parseDouble(Taxa);
               conta1.taxaPercentual(taxa);

           }  else if (opcao == 0) {
            JOptionPane.showConfirmDialog(null, "Programa finalizado", "Conta logada", JOptionPane.CLOSED_OPTION);

        } else {
            JOptionPane.showMessageDialog(null, "Insira um valor válido", "Inválido!", JOptionPane.WARNING_MESSAGE);
        }
       }

    }
}
