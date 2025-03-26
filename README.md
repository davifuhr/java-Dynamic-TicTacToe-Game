# Dynamic Tic-Tac-Toe Game

## Overview
This is a dynamic-sized Tic-Tac-Toe game developed in Java. The game allows two players to compete on a customizable board size. Players take turns placing their respective symbols ('X' or 'O') on the board until there is a winner or a draw. The game also includes a reporting system to save player results.

## Features
- Supports dynamic board sizes (chosen at the start of the game).
- Two-player gameplay with turn-based mechanics.
- Win condition checks for rows, columns, and both diagonals.
- Draw detection when the board is full.
- Option to replay after a match ends.
- Generates a report of player scores at the end of the session.

## Installation
1. Clone this repository or download the source files.
2. Ensure you have Java installed (JDK 8 or later recommended).
3. Compile the Java files using the following command:
   ```sh
   javac *.java
   ```
4. Run the game using:
   ```sh
   java Main
   ```

## How to Play
1. Enter the names of both players.
2. Choose the size of the Tic-Tac-Toe board.
3. Players take turns entering their move (row and column index).
4. The game checks for a winner or a draw after each move.
5. At the end of the game, players can choose to play again.
6. A report is generated and saved automatically.

## File Structure
- `Main.java` - Handles the game flow, user input, and interactions.
- `Game.java` - Manages the board, move validation, and win/draw conditions.
- `Player.java` - Stores player details including name, symbol, and points.
- `Report.java` - Saves player scores in a report file.

## Example Gameplay
```
Player's 1 name: Alice
Player's 2 name: Bob
Board's size: 3

Player Alice (X) makes a move: [1,1]
Player Bob (O) makes a move: [0,2]
...
Player Alice won!
Do you want to play again? (Y/N)
```

## Future Enhancements
- Implement AI for single-player mode.
- Add GUI for an improved user experience.
- Store reports in a database instead of a text file.



