package Java_second.Java_second.bytebank_herdado;

// nao pode criar objetos dessa classepq e abstrata
public abstract class Funcionario {

    private String nome;
    private String cpf;
    private double salario; // protect -> Publico para o filho, p/ outras classes esta privado
   
    public double getBonificacao() {
         return this.salario * 0.05;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}