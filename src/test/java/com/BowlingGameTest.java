package test.java.com;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.com.BowlingGame;

public class BowlingGameTest {

	@Test
	public void itShouldScoreZeroIfAllTriesAreFail() {
		
		BowlingGame bowlingGame=new BowlingGame();
		for(int i=0;i<10;i++)
        	bowlingGame.roll(0);
        assertEquals(0, BowlingGame.score());
	}

	@Test
	public void scoreIfAllTriesAreOne() {
		
		BowlingGame bowlingGame=new BowlingGame();
		for(int i=0;i<10;i++)
        	bowlingGame.roll(1);
        assertEquals(10, BowlingGame.score());
	}
	
	
	   
	   @Test
		  private void rollSpare() {
		    g.roll(5);
		    g.roll(5);
		  }
		}

	
	
	
}
