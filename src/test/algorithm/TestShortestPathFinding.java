package test.algorithm;

import level.Cell;
import level.Field;
import level.Level;
import level.Wall;

import org.junit.Test;


public class TestShortestPathFinding {

	Level level;
	@Test
	public void test() {
		Cell[][] cells = new Cell[3][3];
		for (int i = 0; i < cells.length; i++) {
			for (int j = 0; j < cells.length; j++) {
				cells[i][j] = new Cell(new Field());
				if (i == 1 && j == 1) {
					cells[i][j] = new Cell(new Wall());
				}
			}
		}
		level = new Level(cells);		
		level.printLevel();
		
		/**
		 * 	FFF
			SWE
			FFF
			
			S = startPos 
			E = endPos

		 */
		
		level.findShortestPath(cells[0][1],cells[2][1]);

		}
}
