import java.security.spec.RSAOtherPrimeInfo;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salarioFuncionario1 = 0;
        String nomeEmpregado1 = " ";
        String sobrenomeEmpregado1 = " ";
        double salarioFuncionario2 = 0;
        String nomeEmpregado2 = " ";
        String sobrenomeEmpregado2 = " ";


        System.out.println("#----------Empresa----------#");
        System.out.println();



        System.out.println("Informe o nome do primeiro empregado: ");
        nomeEmpregado1 = sc.next();

        System.out.println("Informe o sobrenome do primeiro empregado: ");
        sobrenomeEmpregado1 = sc.next();

        try {

            System.out.println("Informe o salário mensal: ");
            salarioFuncionario1 = sc.nextDouble();

        }catch(InputMismatchException e) {
            System.out.println("Formato inválido");
        }

        Empregado funcionario1 = new Empregado(nomeEmpregado1, sobrenomeEmpregado1, salarioFuncionario1);

        System.out.println();

        System.out.println("Informe o nome do segundo empregado: ");
         nomeEmpregado2 = sc.next();

        System.out.println("Informe o sobrenome do segundo empregado: ");
        sobrenomeEmpregado2 = sc.next();



        try {
            System.out.println("Informe o salário mensal: ");
            salarioFuncionario2 = sc.nextDouble();

        }catch(InputMismatchException e) {
            System.out.println("Formato inválido");
        }


        Empregado funcionario2 = new Empregado(nomeEmpregado2, sobrenomeEmpregado2, salarioFuncionario2);

        System.out.println("#--------Dados dos funcionários--------#");
        System.out.println();

        System.out.println("Nome do primeiro funcionário: " + funcionario1.getNome() + " " +  funcionario1.getSobrenome());
        System.out.println("Salário mensal: " + funcionario1.getSalarioMensal());
        System.out.println("Salário anual: " + funcionario1.salarioAnual());

        System.out.println();

        System.out.println("Nome do segundo funcionário: " + funcionario2.getNome() + " " +  funcionario2.getSobrenome());
        System.out.println("Salário mensal: " + funcionario2.getSalarioMensal());
        System.out.println("Salário anual: " + funcionario2.salarioAnual());

        System.out.println();

        System.out.println("#--------Salários após o incremento--------#");
        System.out.println();

        System.out.println("Nome do primeiro funcionário: " + funcionario1.getNome() + " " +  funcionario1.getSobrenome());
        System.out.println("Salário mensal: " + funcionario1.incrementarSalario());
        System.out.println("Salário anual: " + funcionario1.salarioAnual());

        System.out.println();

        System.out.println("Nome do primeiro funcionário: " + funcionario2.getNome() + " " +  funcionario2.getSobrenome());
        System.out.println("Salário mensal: " + funcionario2.incrementarSalario());
        System.out.println("Salário anual: " + funcionario2.salarioAnual());

        System.out.println();

        sc.close();
    }
}
