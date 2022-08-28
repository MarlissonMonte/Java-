public class Principal {
    public static void main(String[] args) {
        Auction leilao1 = new Auction();

        leilao1.enterLot("Davi");
        Person pessoa1 = new Person("Luladrão");
        Person pessoa2 = new Person("Bozonaro");
        leilao1.showLots();

        leilao1.makeABid(1, pessoa1, 1000);
        leilao1.makeABid(1, pessoa2, 3000);
        leilao1.showLots();

    }
}