
 // Manter detalhes de alguém que participa de um leilão..

public class Person
{
    // O nome da pessoa.
    private final String name;

    /**
     * Crie uma nova pessoa com o nome dado.
     * @param name O nome da pessoa.
     */
    public Person(String name)
    {
        this.name = name;
    }

    /**
     * @return O nome da pessoa.
     */
    public String getName()
    {
        return name;
    }
}
