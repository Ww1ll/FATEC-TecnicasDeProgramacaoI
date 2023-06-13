public class Calculadora {
    double numero1;
    double numero2;
    char operacao;

    public Calculadora(double numero1, double numero2, char operacao) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operacao = operacao;
    }

    public Calculadora(){

    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public char getOperacao() {
        return operacao;
    }

    public void setOperacao(char operacao) {
        this.operacao = operacao;
    }

    public void calcular(){
        switch (operacao){
            case '+':
                System.out.println(numero1 + numero2);
                break;
            case '-':
                System.out.println(numero1 - numero2);
                break;
            case '*':
                System.out.println(numero1*numero2);
                break;
            case '/':
                if(numero2 == 0){
                    System.out.println("ERRO | Não é possível dividir por 0");
                } else {
                    System.out.println(numero1/numero2);
                }
                break;
            default:
                System.out.println("ERRO | Operação inválida");
                break;
        }

    }
}
