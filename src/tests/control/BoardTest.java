package tests.control;

import app.control.Board;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BoardTest {

    @Test
    public void isBoardEmpty() {
//        Assert.assertTrue("Método vazio",true);
        System.out.println("Board is clean");
        Board board = new Board();
        int row = 0, column =0;
        boolean response = false;
        boolean result = board.emptyBoard();
    }

    @Test
    public void showBoard() {
    }

    @Test
    public void getPosition() {
    }

    @Test
    public void setPosition() {
    }

    @Test
    public void checkRows() {
    }

    @Test
    public void checkColumns() {
    }

    @Test
    public void checkDiagonals() {
    }

    @Test
    public void fullBoard() {
    }
}