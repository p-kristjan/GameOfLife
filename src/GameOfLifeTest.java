import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class GameOfLifeTest {
	@BeforeEach
	void setup() throws Exception{
		
	}
	
	@AfterEach
	void tearDown() throws Exception{
	}
	
	@Test
	void createLivingCell() {
		GameOfLife gol = new GameOfLife();
		Cell actual = gol.createCell(CellState.LIVING);
		assertEquals(CellState.LIVING, actual.getState());
	}
	
	@Test
	void createRandomCell() {
		GameOfLife gol = new GameOfLife();
		boolean living = false;
		boolean dead = false;
		for (int i = 0; i < 10; i++) {
			Cell actual = gol.createCell();
			if(actual.getState()==CellState.LIVING) {
				living = true;
			}
			if(actual.getState()==CellState.DEAD) {
				dead = true;
			}
			assertTrue(living&&dead);
		}
	}
}
