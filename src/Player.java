public class Player
{
    String name;
    char symbol;
    int points;

    Player(String name, char symbol)
    {
        this.name = name;
        this.symbol = symbol;
        this.points = 0;
    }

    public char getSymbol()
    {
        return this.symbol;
    }

    @Override
    public String toString()
    {
        return ("name: " + name +
                " symbol: " +symbol +
                " points: " + points + "\n");
    }
}
