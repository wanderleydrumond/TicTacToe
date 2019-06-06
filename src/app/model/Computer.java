package app.model;

import app.control.Board;

public class Computer extends Player{

    public Computer(int jogador){
        super(jogador);
        System.out.println("Played 'Computer' generated!");
    }

    @Override
    public void play(Board board){

    }

    @Override
    public void Attempt(Board board){

    }
}