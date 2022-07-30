public class Banco {
    // Atributos 
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // Metodos Personalisados 
    public void estadoAtual(){
        System.out.println("-----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: "  + this.gettipo());
        System.out.println("Dono: "  + this.getdono());
        System.out.println("Saldo: " + this.getsaldo());
        System.out.println("Status: " + this.getstatus());
    }

    public void abrirConta(String t){
        this.settipo(t);
        this.setstatus(true);

        if (t == "CC"){
            this.setsaldo(50);
        }else if (t == "CP"){
            this.setsaldo(150);
        }

    }
    public void fecharConta(){
        if (this.getsaldo() > 0){
            System.out.println("Conta não pode ser fechada porque ainda tem saldo disponivel!");
        }else if (this.getsaldo() < 0){
            System.out.println("Conta não pode ser fechado porque ainda está em debito!");  
        }else{
            System.out.println("Conta fechada com sucesso!");
        }

    }
    public void depositar(float v){
        if (this.getstatus()){
            this.setsaldo(this.getsaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getdono() + "com sucesso!" );
        }else{
            System.out.println("Impossível realizar o deposito, conta fechada.");
        }
    }
        
    public void sacar(float v){
        if (this.getstatus()){
            if (this.getsaldo() >= v){
                this.setsaldo(this.getsaldo() - v);
                System.out.println("Saque realizado na conte de " + this.getdono() + "com sucesso!");
            } else {
                System.out.println("Saldo insuficiante para o saque na conta de " + getdono());
            }
        }else {
            System.out.println("Impossivel sacar de uma conta fechada!");
        }
    }
    public void pagarMensalidade(int v){
        if (this.gettipo() == "CC"){
            v = 12;
        }else if (this.gettipo() == "CP"){
            v = 20;
        }
        if (this.getstatus()){
            this.setsaldo(this.getsaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + getdono() );
        }else{
            System.out.println("Impossível pagar uma conta fechada!");
        }

    }

    // Metodos especias (construtor)
    public Banco(){
        this.saldo = 0;
        this.status = false;
    }


    public void setNumConta(int n){
        this.numConta = n;
    }
    public int getNumConta(){
        return numConta;
    }
    public void settipo(String t){
        this.tipo = t;
    }
    public String gettipo(){
        return tipo;
    }
    public void setdono(String d){
        this.dono = d;
    }
    public String getdono(){
        return dono;
    }
    public void setsaldo(float s){
        this.saldo = s;
    }
    public float getsaldo(){
        return saldo;
    }
    public void setstatus(boolean sl){
        this.status = sl;
    }
    public boolean getstatus(){
        return status;
    }   
        // ctr + . (gerenciar os gets/sets)
}
