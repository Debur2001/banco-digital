package Debur.pacoteUm;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente, Banco banco) {
        linkaContaEBanco(banco);
        super.cliente = cliente;
    }

    @Override
    public void extrato() {
        System.out.println("\n***Extrato da conta corrente***");
        imprimirAtributo();
    }
}
