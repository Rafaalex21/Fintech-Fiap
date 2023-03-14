public class TesteConta {
    public static void main(String[] args) {
        Conta conta = new Conta(1, "João", 1000.0);
        System.out.println("Conta de " + conta.getTitular() + ": saldo=" + conta.getSaldo());
        conta.depositar(500.0);
        System.out.println("Conta de " + conta.getTitular() + ": saldo=" + conta.getSaldo());
        conta.sacar(200.0);
        System.out.println("Conta de " + conta.getTitular() + ": saldo=" + conta.getSaldo());
        //cria a instancia da classe contaCorrente
        ContaCorrente contaCorrente = new ContaCorrente(2, "Maria", 2000.0, 1000.0);
        System.out.println("Conta corrente de " + contaCorrente.getTitular() + ": saldo=" + contaCorrente.getSaldo() + ", limite=" + contaCorrente.getLimite());
        contaCorrente.depositar(1000.0);
        System.out.println("Conta corrente de " + contaCorrente.getTitular() + ": saldo=" + contaCorrente.getSaldo() + ", limite=" + contaCorrente.getLimite());
        contaCorrente.sacar(3000.0);
        System.out.println("Conta corrente de " + contaCorrente.getTitular() + ": saldo=" + contaCorrente.getSaldo() + ", limite=" + contaCorrente.getLimite());
        //cria a instancia da classe investimento
        Investimento investimento = new Investimento(3, "Carlos", 5000.0, 1.5);
        System.out.println("Investimento de " + investimento.getTitular() + ": saldo=" + investimento.getSaldo() + ", juros=" + investimento.getJuros());
        investimento.depositar(2000.0);
        System.out.println("Investimento de " + investimento.getTitular() + ": saldo=" + investimento.getSaldo() + ", juros=" + investimento.getJuros());
        investimento.sacar(1000.0);
        System.out.println("Investimento de " + investimento.getTitular() + ": saldo=" + investimento.getSaldo() + ", juros=" + investimento.getJuros());

        // cria instância da classe Empréstimo
        Emprestimo emprestimo = new Emprestimo(4, "Ana", 3000.0, 0.1, 12);
        System.out.println("Empréstimo de " + emprestimo.getTitular() + ": saldo=" + emprestimo.getSaldo() + ", taxa de juros=" + emprestimo.getTaxaJuros() + ", número de parcelas=" + emprestimo.getNumParcelas());
        emprestimo.calcularJuros();
        System.out.println("Empréstimo de " + emprestimo.getTitular() + ": saldo com juros=" + emprestimo.getSaldo());
        System.out.println("Empréstimo de " + emprestimo.getTitular() + ": valor da parcela=" + emprestimo.getValorParcela());
    }
}