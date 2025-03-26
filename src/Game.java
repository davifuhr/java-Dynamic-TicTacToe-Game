
public class Game
{
    char [][]board;
    int boardSize;
    int movesCount=0;

    Game(int size)
    {
        this.boardSize = size;
        this.board = new char[size][size];

        for(int i =0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                this.board[i][j] = ' ';
            }
        }
    }

    public void resetBoard()
    {
        this.movesCount=0;
        for(int i =0;i<boardSize;i++)
        {
            for(int j=0;j<boardSize;j++)
            {
                this.board[i][j] = ' ';
            }
        }
    }

    public boolean play(int posX, int posY, char symbol)
    {
        movesCount++;
        if (this.board[posX][posY] == ' ')
        {
            this.board[posX][posY] = symbol;
            return true ;
        }
        else
        {
            return false;
        }
    }

    public boolean verifyDraw()
    {
        return movesCount == boardSize * boardSize;
    }

    public boolean verifyWinner()
    {
        for(int i =0;i<boardSize;i++)
        {
            if(checkLine(i) || checkColumn(i))
            {
                return true;
            }
        }
        return checkPrimaryDiagonal() || checkSecondaryDiagonal();
    }

    public boolean checkLine(int i)
    {
        char firstSymbol = board[i][0];
        if(firstSymbol==' ')
        {
            return false;
        }
        for(int j=1;j<boardSize;j++)
        {
            if(board[i][j] != firstSymbol) return false;
        }
        return true;
    }

    public boolean checkColumn(int i)
    {
        char firstSymbol = board[0][i];
        if(firstSymbol==' ')
        {
            return false;
        }
        for(int j=1;j<boardSize;j++)
        {
            if(board[j][i] != firstSymbol) return false;
        }
        return true;
    }

    public boolean checkPrimaryDiagonal()
    {
        char firstSymbol = board[0][0];
        if(firstSymbol==' ')
        {
            return false;
        }
        for(int i =1;i<boardSize;i++)
        {
            if(board[i][i] != firstSymbol)
            {
                return false;
            }
        }
        return true;
    }

    public boolean checkSecondaryDiagonal()
    {
        char firstSymbol = board[0][boardSize - 1];
        if(firstSymbol==' ')
        {
            return false;
        }
        for(int i =1;i<boardSize;i++)
        {
            if(board[i][(boardSize-1) -i] != firstSymbol)
            {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString()
    {
        for(int i=0; i<this.boardSize;i++)
        {
            for(int j=0;j<this.boardSize;j++)
            {
                System.out.print(this.board[i][j]);
                if(j < (this.boardSize - 1))
                {
                    System.out.print("|");
                }
                else
                {
                    System.out.println();
                }
            }
            for(int k=0;k<(this.boardSize * 2)-1; k++)
            {
                System.out.print("-");
            }
            System.out.println();
        }
        return "";
    }

}

