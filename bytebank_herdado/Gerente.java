package Java_second.Java_second.bytebank_herdado;

// extends -> Gerente eh um Funcionario, Gerente herda da class FuncionarioAutenticavel
public class Gerente extends FuncionarioAutenticavel{

   public double getBonificacao() {
        System.out.println("Chamando o metodo de bonificacao do GERENTE");
        return super.getSalario(); //super -> esse atributo pertence a classe mae (Funcionario)
     }
}
