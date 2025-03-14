package introducaoPOO.exercicios.ex5Banco;

public class ContaBancaria {

    public static final double TAXA_SAQUE = 5.00;

    private int numero;
    private String titular;
    private double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        deposito(saldo);
    }

    public ContaBancaria(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        saldo = 0;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double deposito(double valor) {
        return this.saldo += valor;
    }

    public double saque(double valor) {
        this.saldo -= valor;
        this.saldo -= TAXA_SAQUE;
        return this.saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numero=" + numero +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}