class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    private int idade;
    private char sexo;

    public Cliente(String nome, String cpf, String endereco, int idade, char sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getIdade() {
        return idade;
    }

    public char getSexo() {
        return sexo;
    }
}

class Conta {
    private String numero;
    private Cliente dono;
    private double saldo;
    private double limite;

    public Conta(String numero, Cliente dono, double saldo, double limite) {
        this.numero = numero;
        this.dono = dono;
        this.saldo = saldo;
        this.limite = limite;
    }

    // Outros métodos da classe Conta aqui...

    public void imprimir() {
        System.out.println("Nome do dono da conta: " + dono.getNome());
        System.out.println("CPF do dono: " + dono.getCpf());
        System.out.println("Endereço do dono: " + dono.getEndereco());
        System.out.println("Idade do dono: " + dono.getIdade());
        System.out.println("Sexo do dono: " + dono.getSexo());
        System.out.println("Número da conta: " + numero);
        System.out.println("Saldo atual: R$" + saldo);
        System.out.println("Limite: R$" + limite);
    }
}

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João Silva", "123.456.789-10", "Rua A, 123", 30, 'm');
        Conta conta = new Conta("12345", cliente, 1000, 500);
        conta.imprimir();
    }
}
