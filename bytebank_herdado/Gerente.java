package Java_second.Java_second.bytebank_herdado;

// extends -> Gerente eh um Funcionario, Gerente herda da class Funcionario, assina o contrato autenticavel
public class Gerente extends Funcionario implements Autenticavel{

   private AutenticacaoUtil autenticador;

   public Gerente() {
       this.autenticador = new AutenticacaoUtil();
    }

   public double getBonificacao() {
        System.out.println("Chamando o metodo de bonificacao do GERENTE");
        return super.getSalario(); //super -> esse atributo pertence a classe mae (Funcionario)
     }


   @Override
    public void setSenha(int senha){
        this.autenticador.setSenha(senha);
    }

   @Override
    public boolean autentica(int senha){
        return this.autenticador.autentica(senha);
    }
}
