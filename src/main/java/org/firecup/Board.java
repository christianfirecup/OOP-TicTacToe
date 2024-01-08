package org.firecup;
import java.util.Scanner;
public class Board {
 

    private static final String[][] board = CreateBoard();
    private Boolean GameWon = false;

    private static String[][] CreateBoard(){
        String[][] Board = new String[3][3];
        for(int i = 0; i<3; i++) {
            for (int k = 0; k < 3; k++) {

                Board[i][k] = " _ ";
            }
        }
        return Board;
    }

    ;
    private void TurnLogic(Player player){
        Scanner TurnSelector = new Scanner(System.in);
        if(player.PlayersTurn().equals(" x ")){
            System.out.println("Player One Pick Your Column");
            int Column = TurnSelector.nextInt();
            System.out.println("Player One Pick Your Row");
            int Row = TurnSelector.nextInt();
            player.Next_Turn();
            board[Row][Column] = player.PlayersTurn();
            PrintBoard();
        }  if(player.PlayersTurn().equals(" o ")){
            System.out.println("Player Two Pick Your Row");
            int Column = TurnSelector.nextInt();
            System.out.println("Player Two Pick Your Column");
            int Row = TurnSelector.nextInt();
            board[Row][Column] = player.PlayersTurn();
            player.Next_Turn();
            PrintBoard();
        }

    }
    public static void PrintBoard(){
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {

                System.out.print(board[i][k]);
            }
            System.out.println();
        }

    }
    private void GameWonCheck(String[][] GameBoard, Player player){

        if(GameBoard[0][0].equals(player.PlayersTurn()) && GameBoard[0][1].equals(player.PlayersTurn()) && GameBoard[0][2].equals(player.PlayersTurn())){
            System.out.println(player.PlayersTurn() + "won");
            GameWon = true;
        }else{
            System.out.println("No winner yet");

        }

    }


}
