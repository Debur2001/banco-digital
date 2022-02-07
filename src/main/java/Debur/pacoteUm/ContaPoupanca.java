package Debur.pacoteUm;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super.cliente = cliente;
    }
    @Override
    public void extrato() {
        System.out.println("***Extrato da conta poupança***");
        imprimirAtributo();
    }
}
