package tests.control;

import app.control.Board;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BoardTest {

    @Test
    public void getPosition() {
        Board board = new Board();
        System.out.println("Position is captured");
        int[] attempt = new int[0];
        Assert.assertEquals(true, board.getPosition(new int[]{attempt[1]}));
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
    public void isBoardNotFull() {
        Board board = new Board();
        System.out.println("Board is not full");
        /*int row = 0, column = 0;
        boolean response = true;
        boolean result = board.fullBoard();
        assertEquals(response, result);
        fail("It is not working");*/
        assertEquals(false, board.fullBoard());
    }
}