package model;

import control.Board;

public abstract class Player {

    protected int[] attempt = new int[2];
    protected int player;


    public Player(int player){
        this.player = player;
    }

    public abstract void play(Board board);

    public abstract void Attempt(Board board);

    public boolean checkAttempt(int[] attempt, Board board){
        if(board.getPosition(attempt) == 0)
            return true;
        else
            return false;

    }
}