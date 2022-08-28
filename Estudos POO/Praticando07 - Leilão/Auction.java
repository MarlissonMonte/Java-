import java.util.ArrayList;

 // Um modelo simples de um leilão.
 // O leilão mantém uma lista de lotes de tamanho arbitrário.

public class Auction 
{
    // A lista de Lotes neste leilão.
    private ArrayList<Lot> lots;

    // O número que será dado ao próximo lote inserido
    // neste leilão.
    private int nextLotNumber;

    // Criar um novo leilão.
    
    public Auction(){
        lots = new ArrayList<>();
        nextLotNumber = 1;
    }

     // Insira um novo lote no leilão.
    public void enterLot(String description)
    {
        lots.add(new Lot(nextLotNumber, description));
        nextLotNumber++;
    }

    
    // Mostre a lista completa de lotes neste leilão.
     
    public void showLots()
    {
        for(Lot lot : lots) {
            System.out.println(lot.toString());
        }
    }
    
    /**
     * Faça uma oferta para um lote.
     * Uma mensagem é impressa indicando se o lance é
     * sucesso ou não.
     */
    public void makeABid(int lotNumber, Person bidder, long value)
    {
        Lot selectedLot = getLot(lotNumber);
        if(selectedLot != null) {
            Bid bid = new Bid(bidder, value);
            boolean successful = selectedLot.bidFor(bid);
            if(successful) {
                System.out.println("O lance para o número do lote " +
                                   lotNumber + " foi bem sucedido.");
            }
            else {
                // Informa qual lance é maior.
                Bid highestBid = selectedLot.getHighestBid();
                System.out.println("Número do lote: " + lotNumber +
                                   " já tem um lance de: " +
                                   highestBid.getValue());
            }
        }
    }

    /**
     * Devolva o lote com o número fornecido. Retornar nulo
     * caso não exista lote com este número.
     * @param lotNumber O número do lote a ser retornado.
     */
    public Lot getLot(int lotNumber)
    {
        if((lotNumber >= 1) && (lotNumber < nextLotNumber)) {
            // O número parece ser razoável.
            Lot selectedLot = lots.get(lotNumber - 1);
            // Inclua uma verificação de confiança para ter certeza de que temos o
            // lote certo.
            if(selectedLot.getNumber() != lotNumber) {
                System.out.println("Erro interno: Número do lote " +
                                   selectedLot.getNumber() +
                                   " foi devolvido em vez de " +
                                   lotNumber);
                // Não retorna um lote inválido.
                selectedLot = null;
            }
            return selectedLot;
        }
        else {
            System.out.println("Número do lote: " + lotNumber +
                               " não existe.");
            return null;
        }
    }
}
