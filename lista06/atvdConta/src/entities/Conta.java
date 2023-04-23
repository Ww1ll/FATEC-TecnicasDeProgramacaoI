package entities;

public class Conta {

    public double saldo;

    public Conta(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }

    public void saca(double saque){
        this.saldo -= saque;
    }
    public void deposita(double deposito){
        this.saldo += deposito;
    }
    public void taxaPercentual(double taxa){
        this.saldo += (this.saldo * (taxa/100));
    }
}
