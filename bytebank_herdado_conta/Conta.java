package Java_second.Java_second.bytebank_herdado_conta;

public abstract class Conta {
    
        protected double saldo;
        private int agencia;
        private int numero;
        private Cliente titular;
        private static int total; // static = class

        public Conta(int agencia, int numero) {
            Conta.total++;
            //System.out.println("o total de contas e " + total);
            this.agencia = agencia;
            this.numero = numero;
            //System.out.println("Estou criando uma conta " + this.agencia + " " + this.numero);
    
        }
    
        public abstract void deposita(double valor);
    
        public boolean saca(double valor) {
            if(this.saldo >= valor) {
                this.saldo -= valor;
                return true;
            } else {
                return false;
            }
        }
    
        public boolean transfere(double valor, Conta destino){
            if(this.saca(valor)) {
                destino.deposita(valor);
                return true;
            } else {
                return false;
            }
        } 
    
        //Responsavel pelo saldo privado
        public double getSaldo() {
            return this.saldo;
        }
    
        public int getNumero() {
            return this.numero;
        }
    
        public void setNumero (int numero) {
            if (numero <= 0) {
                System.out.println("Nao pode valor <= 0");
                return;
            }
            this.numero = numero;
        }
    
        public int getAgencia() {
            return this.agencia;
        }
    
        public void setAgencia(int agencia) {
            if (agencia <= 0) {
                System.out.println("Nao pode valor menor igual a 0");
                return;
            }
            this.agencia = agencia;
        }
    
        public void setTitular(Cliente titular) {
            this.titular = titular;
        }
    
        public Cliente getTitular() {
            return titular;
        }
    
        public static int getTotal(){
            return Conta.total;
        }
}
