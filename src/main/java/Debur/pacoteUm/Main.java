package Debur.pacoteUm;

public class Main {
    public static void main(String[] args) {
        // Cria bancos e clientes
        Cliente debur = new Cliente();
        debur.setNome("Vinícius Debur Bernert");
        Banco bb = new Banco("Banco do Brasil");

        // Cria contas
        Conta ccVinicius = new ContaCorrente(debur, bb);
        Conta cpVinicius = new ContaPoupanca(debur, bb);

        // Realiza operacoes
        ccVinicius.depositar(150);
        ccVinicius.transferir(100, cpVinicius);

        // Imprime resultados
//        cc.extrato();
//        cp.extrato();
        bb.imprimirAtributo();
        bb.imprimirContas();

        // Testes com novo banco
        Banco itau = new Banco("Itaú");
        itau.imprimirAtributo();
        itau.imprimirContas();

        // Testes com novo cliente
        Cliente rafael = new Cliente();
        rafael.setNome("Rafael Debur Bernert");
        Conta ccRafael = new ContaCorrente(rafael, itau);
        ccRafael.depositar(1900.50);
        ccRafael.transferir(910, ccVinicius);

        bb.imprimirAtributo();
        bb.imprimirContas();
        itau.imprimirAtributo();
        itau.imprimirContas();
    }
}
