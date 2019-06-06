package app.view;

import app.control.Board;
import app.model.Computer;
import app.model.Human;
import app.model.Player;

import java.util.Scanner;

public class Game {
    private Board board;
    private int round = 1, turn = 1;
    private Player player1;
    private Player player2;
    public Scanner entrada = new Scanner(System.in);


    public Game(){
        board = new Board();
        iniciarPlayeres();

        while( Play() );
    }

    public void iniciarPlayeres(){
        System.out.println("Who is gonna be Player 1 ?");
        if(escolherPlayer() == 1)
            this.player1 = new Human(1);
        else
            this.player1 = new Computer(1);

        System.out.println("----------------------");
        System.out.println("Who is gonna be Player 2 ?");

        if(escolherPlayer() == 1)
            this.player2 = new Human(2);
        else
            this.player2 = new Computer(2);

    }

    public int escolherPlayer(){
        int opcao=0;

        do{
            System.out.println("1. Human");
            System.out.println("2. Computer\n");
            System.out.print("Option: ");
            opcao = entrada.nextInt();

            if(opcao != 1 && opcao != 2)
                System.out.println("Invalid option! Try again");
        }while(opcao != 1 && opcao != 2);

        return opcao;
    }

    public boolean Play(){
        if(won() == 0 ){
            System.out.println("----------------------");
            System.out.println("\nRound " + round);
            System.out.println("It is player " + turn() + " turn");

            if(turn()==1)
                player1.play(board);
            else
                player2.play(board);


            if(board.fullBoard()){
                System.out.println("Board Completed. Draw");
                return false;
            }
            turn++;
            round++;

            return true;
        } else{
            if(won() == -1 )
                System.out.println("Player 1 won!");
            else
                System.out.println("Player 2 won!");

            return false;
        }

    }

    public int turn(){
        if(turn%2 == 1)
            return 1;
        else
            return 2;
    }

    public int won(){
        if(board.checkRows() == 1)
            return 1;
        if(board.checkColumns() == 1)
            return 1;
        if(board.checkDiagonals() == 1)
            return 1;

        if(board.checkRows() == -1)
            return -1;
        if(board.checkColumns() == -1)
            return -1;
        if(board.checkDiagonals() == -1)
            return -1;

        return 0;
    }

}