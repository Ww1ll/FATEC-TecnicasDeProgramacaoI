import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraRun {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("#--------Calculadora--------#");

            System.out.println("informe um número: ");
            double n1 = sc.nextDouble();

            System.out.println("Informe outro número: ");
            double n2 = sc.nextDouble();

            System.out.println("Informe a operação a ser realizada: ");
            char op = sc.next().charAt(0);

            Calculadora calculo1 = new Calculadora(n1, n2, op);


            System.out.println("O resultado da operação é: ");
            calculo1.calcular();


        }catch(InputMismatchException e) {
            System.out.println("Formato inválido");
        }



        sc.close();
    }
}
