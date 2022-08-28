/**
 * Uma classe que modela um lance de leilão.
 * Contém uma referência à Pessoa que licita e ao valor do lance.
 */

public class Bid
{
    // A pessoa que faz o lance.
    private final Person bidder;
    // O valor do lance. Este pode ser um número grande, então
    // o tipo longo foi usado.
    private final long value;

     // Cria um lance.

    public Bid(Person bidder, long value)
    {
        this.bidder = bidder;
        this.value = value;
    }

    // @return o Lançador.
    
    public Person getBidder()
    {
        return bidder;
    }

    // @return O valor do lance.
     
    public long getValue()
    {
        return value;
    }
}
