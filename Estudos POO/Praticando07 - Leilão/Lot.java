/**
 * Uma classe para modelar um item (ou conjunto de itens) em um
 * leilão: muito.
 */
public class Lot 
{
    // Um número de identificação exclusivo.
    private final int number;
    // Uma descrição do lote.
    private String description;
    // O lance mais alto atual para este lote.
    private Bid highestBid;

    /**
     * Construir um Lote, definindo seu número e descrição.
     * @param number O número do lote.
     * @param description Uma descrição deste lote.
     */
    public Lot(int number, String description)
    {
        this.number = number;
        this.description = description;
        this.highestBid = null;
    }

    /**
     * Tentativa de licitação para este lote. Um lance bem-sucedido
     * deve ter um valor maior do que qualquer lance existente.
     * @param lance Um novo lance.
     * @return true se for bem sucedido, false caso contrário
     */
    public boolean bidFor(Bid bid)
    {
        if(highestBid == null) {
            // Não há lance anterior.
            highestBid = bid;
            return true;
        }
        else if(bid.getValue() > highestBid.getValue()) {
            // O lance é melhor que o anterior.
            highestBid = bid;
            return true;
        }
        else {
            // O lance não é melhor.
            return false;
        }
    }
    
    /**
     * @return Uma representação em string dos detalhes deste lote.
     */
    public String toString()
    {
        String details = number + ": " + description;
        if(highestBid != null) {
            details += "    Lançe: " + 
                       highestBid.getValue();
        }
        else {
            details += "    (sem lançe)";
        }
        return details;
    }

    /**
     * @return O número do lote.
     */
    public int getNumber()
    {
        return number;
    }

    /**
     * @return Descrição do lote.
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * @return O lance mais alto para este lote.
     * Isso pode ser nulo se houver
     * sem lance atual.
     */
    public Bid getHighestBid()
    {
        return highestBid;
    }
}
