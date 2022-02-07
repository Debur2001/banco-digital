package Debur.pacoteUm;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private static int AGENCIA_PADRAO = 1;
    private String nome;
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimirAtributo() {
        System.out.println(String.format("\n*** %s ***", this.nome));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero de contas: %d", this.contas.size()));
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

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public int getAgencia() {
        return agencia;
    }


    // listar todos os clientes
}
