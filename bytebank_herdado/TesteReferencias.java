package Java_second.Java_second.bytebank_herdado;

public class TesteReferencias {
    
    public static void main(String[] args) {
        
        Gerente g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setSalario(5000.0);

        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);

        Controlebonificacao controle = new Controlebonificacao();
        controle.registra(g1);
        controle.registra(ev);


        System.out.println(controle.getSoma());
    }
}