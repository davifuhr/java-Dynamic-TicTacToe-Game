import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Report {

    Report()
    {

    }

    public Player[] ordenatePlayersByPoints(Player[] players)
    {
        Player aux;
        for (int i=0;i<players.length-1;i++)
        {
            for (int j=0;j<players.length-1;j++)
            {
                if(players[j].points < players[j+1].points)
                {
                    aux = players[j];
                    players[j] = players[j+1];
                    players[j+1] = aux;
                }
            }
        }
        return players;
    }

    public void saveReport(Player[] players)
    {
        Player[] playerOrdenados = ordenatePlayersByPoints(players);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/Reports/Report.txt")))
        {
            for(int i =0;i< players.length;i++)
            {
                writer.write(playerOrdenados[i].toString());
            }

        }
        catch (IOException e)
        {

        }
    }

}
