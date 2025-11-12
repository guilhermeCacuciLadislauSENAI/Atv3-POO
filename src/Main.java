import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContaBancaria Conta1 = new ContaBancaria("Guilherme", 100000, 1000.00);
        ContaBancaria Conta2 = new ContaBancaria("Arthur", 101010, 1000.00);

        Conta1.depositar(150.00);
        Conta1.sacar(350.00);

        Conta2.depositar(500.00);
        Conta2.sacar(1250.00);

        Conta1.exibirInformacoes();
        Conta2.exibirInformacoes();


    }
}