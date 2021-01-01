package Java_second.Java_second.bytebank_herdado_conta;

public class CauculadorDeImposto {

    private double totalImposto;
    
    public void registra(Tributavel t) {
        
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
