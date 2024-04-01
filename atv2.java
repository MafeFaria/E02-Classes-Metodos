class Conta {
    private String numero;
    private String nomeDono;
    private double saldo;
    private double limite;

    public Conta(String numero, String nomeDono, double saldo, double limite) {
        this.numero = numero;
        this.nomeDono = nomeDono;
        this.saldo = saldo;
        this.limite = limite;
    }

    // Outros métodos da classe Conta aqui...

    public void imprimir() {
        System.out.println("Nome do dono da conta: " + nomeDono);
        System.out.println("Número da conta: " + numero);
        System.out.println("Saldo atual: R$" + saldo);
        System.out.println("Limite: R$" + limite);
    }
}

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta("12345", "João", 1000, 500);
        conta.imprimir();
    }
}
