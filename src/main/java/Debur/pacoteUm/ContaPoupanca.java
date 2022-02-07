package Debur.pacoteUm;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente, Banco banco) {
        linkaContaEBanco(banco);
        super.cliente = cliente;
    }
    @Override
    public void extrato() {
        System.out.println("\n***Extrato da conta poupança***");
        imprimirAtributo();
    }
}
