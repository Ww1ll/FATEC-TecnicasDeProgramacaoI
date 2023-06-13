import javax.swing.*;
import java.util.InputMismatchException;

public class EmpregadoTeste {
    public static void main(String[] args) {



        try {


        String nome = JOptionPane.showInputDialog(null, "Informe o seu nome", "Empregado",JOptionPane.QUESTION_MESSAGE);
        String age = JOptionPane.showInputDialog(null, "Informe sua idade", "Empregado",JOptionPane.QUESTION_MESSAGE);
        String height = JOptionPane.showInputDialog(null, "Informe sua altura", "Empregado",JOptionPane.QUESTION_MESSAGE);
        String sexo = JOptionPane.showInputDialog(null, "Informe o sexo", "Empregado",JOptionPane.QUESTION_MESSAGE);
        String salary = JOptionPane.showInputDialog(null, "Informe seu salário", "Empregado",JOptionPane.QUESTION_MESSAGE);

        int idade = Integer.parseInt(age);
        double altura = Double.parseDouble(height);
        double salario = Double.parseDouble(salary);

        Empregado funcionario1 = new Empregado(nome,idade,altura,sexo,salario);


        JOptionPane.showMessageDialog(null,"Nome: " + funcionario1.getNome(),"Empregado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Idade: " + funcionario1.getIdade(),"Empregado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Altura: " + funcionario1.getAltura(),"Empregado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Sexo: " + funcionario1.getSexo(),"Empregado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Salário: " + funcionario1.obterLucros(),"Empregado", JOptionPane.INFORMATION_MESSAGE);

        }catch (InputMismatchException e)  {
            JOptionPane.showMessageDialog(null, "Entrada inválida, digite um número positivo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
