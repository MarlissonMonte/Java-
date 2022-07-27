public class Caneta { 
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada; 
    
    void status(){
        System.out.println("Uma caneta da cor " + this.cor); //sout
        System.out.println("Uma ponta " + this.ponta);
    }
    void rabiscar(){
        if (this.tampada = true){
            System.out.println("ERROR, não posso rabiscar!");
        } else { System.out.println("Estou rabiscando");
    }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false; 
    }
}
