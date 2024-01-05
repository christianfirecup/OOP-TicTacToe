package project.firecup;
import java.util.Scanner;
public class Board {
    public Board(Player player){
        TurnLogic(player);
        PrintBoard();



    }

    private static final String[][] board = CreateBoard();

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
    public void TurnLogic(Player player){
        Scanner TurnSelector = new Scanner(System.in);
        if(player.PlayersTurn().equals(" x ")){
            System.out.println("Player One Pick Your Column");
            int Column = TurnSelector.nextInt();
            System.out.println("Player One Pick Your Row");
            int Row = TurnSelector.nextInt();
            player.Next_Turn();
            board[Row][Column] = " x ";
            PrintBoard();
        }  if(player.PlayersTurn().equals(" o ")){
            System.out.println("Player Two Pick Your Row");
            int Column = TurnSelector.nextInt();
            System.out.println("Player Two Pick Your Column");
            int Row = TurnSelector.nextInt();
            board[Row][Column] = " o ";
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


}
