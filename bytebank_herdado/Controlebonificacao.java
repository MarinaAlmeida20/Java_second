package Java_second.Java_second.bytebank_herdado;

public class Controlebonificacao {
    
    private double soma;

    public void registra(Funcionario f){
        double boni = f.getBonificacao();
        this.soma = this.soma + boni;
    }

    public double getSoma() {
        return soma;
    }
}
