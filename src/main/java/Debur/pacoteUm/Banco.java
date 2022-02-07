package Debur.pacoteUm;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private static int AGENCIA_PADRAO = 1;
    private final String nome;
    private final int agencia;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.agencia = AGENCIA_PADRAO++;
        contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void imprimirAtributo() {
        System.out.printf("\n*** %s ***%n", this.getNome());
        System.out.printf("Agencia: %d%n", this.getAgencia());
        System.out.printf("Numero de contas: %d%n", this.contas.size());
    }

    public void imprimirContas() {
        Conta contaAux;
        System.out.println("Contas do banco: " + this.nome);
        for (Conta conta : contas) {
            contaAux = conta;
            contaAux.extrato();
        }
        System.out.println("===================================");
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public int getAgencia() {
        return agencia;
    }


    // listar todos os clientes
}
