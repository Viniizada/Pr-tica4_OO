public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello world!");
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        cc.depositar(1200.20);
        cc.sacar(300);
        cp.depositar(500.50);
        cp.sacar(25);

        GerarExtratos gerador = new GerarExtratos();
        gerador.geradorConta(cc);
        gerador.geradorConta(cp);
    }
}