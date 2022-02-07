package Debur.pacoteUm;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super.cliente = cliente;
    }

    @Override
    public void extrato() {
        System.out.println("***Extrato da conta corrente***");
        imprimirAtributo();
    }
}
