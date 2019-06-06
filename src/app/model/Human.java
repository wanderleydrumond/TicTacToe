package app.model;

import app.control.Board;

import java.util.Scanner;

public class Human extends Player{
    public Scanner entrada = new Scanner(System.in);

    public Human(int player){
        super(player);
        this.player = player;
        System.out.println("Player 'Humano' generated!");
    }

    @Override
    public void play(Board board){
        Attempt(board);
        board.setPosition(attempt, player);
    }

    @Override
    public void Attempt(Board board){
        do{
            do{
                System.out.print("Row: ");
                attempt[0] = entrada.nextInt();

                if( attempt[0] > 3 ||attempt[0] < 1)
                    System.out.println("Invalid row. Choose only 1, 2 or 3");

            }while( attempt[0] > 3 ||attempt[0] < 1);

            do{
                System.out.print("Column: ");
                attempt[1] = entrada.nextInt();

                if(attempt[1] > 3 ||attempt[1] < 1)
                    System.out.println("Invalid column. Choose only 1, 2 or 3");

            }while(attempt[1] > 3 ||attempt[1] < 1);

            attempt[0]--;
            attempt[1]--;

            if(!checkAttempt(attempt, board))
                System.out.println("This position was already marked. Try another one.");
        }while( !checkAttempt(attempt, board) );
    }
}