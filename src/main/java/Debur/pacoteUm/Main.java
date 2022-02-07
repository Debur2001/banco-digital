package Debur.pacoteUm;

public class Main {
    public static void main(String[] args) {
        Cliente Debur = new Cliente();
        Debur.setNome("Vinícius Debur Bernert");

        Conta cc = new ContaCorrente(Debur);
        cc.depositar(150);
        Conta cp = new ContaPoupanca(Debur);

//        cc.extrato();
//        cp.extrato();

        cc.transferir(100, cp);

        cc.extrato();
        cp.extrato();

    }
}
