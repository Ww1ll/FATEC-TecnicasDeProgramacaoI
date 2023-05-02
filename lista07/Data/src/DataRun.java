import java.util.Scanner;

public class DataRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------Data------");
        System.out.println("Informe o dia: ");
        int day = sc.nextInt();
        System.out.println("informe o mês: ");
        int month = sc.nextInt();
        System.out.println("Informe o ano: ");
        int year = sc.nextInt();

        Data data1 = new Data(day, month, year);

        data1.displayData();
        sc.close();
    }

}
