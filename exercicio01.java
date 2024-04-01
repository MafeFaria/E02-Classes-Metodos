class Conta {
    private String numero;
    private double saldo;

    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    public void transferir(Conta destino, double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada para a conta " + destino.getNumero() + ".");
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta("12345", 1000);
        Conta conta2 = new Conta("54321", 500);

        System.out.println("Saldo inicial da conta 1: R$" + conta1.getSaldo());
        System.out.println("Saldo inicial da conta 2: R$" + conta2.getSaldo());

        conta1.depositar(500);
        conta2.sacar(200);
        conta1.transferir(conta2, 300);

        System.out.println("Saldo final da conta 1: R$" + conta1.getSaldo());
        System.out.println("Saldo final da conta 2: R$" + conta2.getSaldo());
    }
}
