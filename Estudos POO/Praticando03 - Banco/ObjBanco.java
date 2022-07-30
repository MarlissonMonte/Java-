public class ObjBanco {
    public static void main(String[] args) {

        Banco p1 = new Banco();
        p1.setNumConta(111111);
        p1.setdono("Marlisson Anjos");
        p1.abrirConta("CC");
        

        Banco p2 = new Banco();
        p2.setNumConta(222222);
        p2.setdono("Jicelma Alves");
        p2.abrirConta("CP");

        p1.depositar(100);
        p2.depositar(500);

        p2.sacar(1000);

        p1.estadoAtual();
        p2.estadoAtual();
    }
}
