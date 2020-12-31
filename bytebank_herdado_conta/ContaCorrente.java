package Java_second.Java_second.bytebank_herdado_conta;

// new ContaCorrente()
public class ContaCorrente extends Conta {
    
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public boolean saca(double valor) {
        System.out.println("Taxa para transações em conta corrente: 20 centavos");
        return super.saca(valor + 0.20);
    }
}
