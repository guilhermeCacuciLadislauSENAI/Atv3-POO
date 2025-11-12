public class ContaBancaria {

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


    public void depositar (double valorDeposito){
        if (valorDeposito > 0.0) {
            System.out.println("=== depositando na conta de " + this.titular + " ===");
            saldo += valorDeposito;
            System.out.printf("Saldo da %s (Conta %d):  R$ %.2f%n", this.titular, this.numeroConta,this.saldo);
        } else {
            System.out.println("Não é possível depositar valores negativos ou iguais à 0.");
        }
    }

    public void sacar (double valorSaque){
        if (valorSaque > saldo){
            System.out.println("O valor para saque supera seu saldo.");
        } else if (valorSaque < 0.0){
            System.out.println("Não é possível sacar valores negativos ou iguais à 0.");
        } else {
            System.out.println("=== sacando da conta " + this.titular + " ===");
            this.saldo -= valorSaque;
            System.out.printf("Saldo da conta %s (Conta %d): R$ %.2f%n", this.titular, this.numeroConta,this.saldo);
        }
    }

    public void exibirInformacoes (){
        System.out.println("=== Informações ===");
        System.out.println("Titular: " + this.titular);
        System.out.println("Conta: " + this.numeroConta);
        System.out.printf("Saldo: R$ %.2f%n", this.saldo);
    }

}
