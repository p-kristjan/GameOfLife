import static org.junit.Assert.assertEquals;

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
}
