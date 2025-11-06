import java.util.Scanner;

public class ContaBancaria {

    Scanner sc = new Scanner(System.in);

    private String titular;
    private int numeroConta;
    private double saldo;

    public ContaBancaria(String titular, int numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta(){
        return this.numeroConta;
    }
    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }

    public double getSaldo(){
        return this.saldo;
    }

    private double depositar (double saldo){
        System.out.println("O quanto você deseja depositar?");
        double deposito = sc.nextDouble();
        saldo += deposito;
        return saldo;
    }

    private double sacar (double saldo){
        System.out.println("O quanto você deseja sacar?");
        double sacar = sc.nextDouble();
        if (sacar > saldo){
            System.out.println("O valor para saque supera seu saldo.");
        } else {
            saldo -= sacar;
        }
        return saldo;
    }



}
