import java.util.InputMismatchException;
import java.util.Scanner;

public class DataRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = 0;
        int month = 0;
        int year = 0;

        try {
            System.out.println("------Data------");
            System.out.println("Informe o dia: ");
            day = sc.nextInt();
            System.out.println("informe o mês: ");
            month = sc.nextInt();
            System.out.println("Informe o ano: ");
            year = sc.nextInt();

        }catch(InputMismatchException e) {
            System.out.println("Formato inválido");
        }



        Data data1 = new Data(day, month, year);

        data1.displayData();
        sc.close();
    }

}
