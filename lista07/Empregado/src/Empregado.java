public class Empregado extends Pessoa{
    double salario;

    public Empregado(String nome, int idade, double altura, String sexo, double salario) {
        super(nome, idade, altura, sexo);
        this.salario = salario;
    }

    public Empregado() {

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double obterLucros(){
        return this.salario;
    }
}
