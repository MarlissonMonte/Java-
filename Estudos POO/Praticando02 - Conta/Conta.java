public class Conta {
    float contador;

    void addNum(){
        contador = contador + 1;
    }
    void retNum(){
        contador = contador - 1;
    }
    void dvNum(){
        contador = contador / 2;
    }
    void resetar(){
        contador = 0;
    }
    void valor(){
        System.out.println("O valor da sua conta é " + contador);
    }
}


