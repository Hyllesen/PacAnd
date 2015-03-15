package test.leveldata;

import static org.junit.Assert.*;
import level.Cell;
import level.Level;
import level.Wall;

import org.junit.Test;

public class printLevel {

	@Test
	public void test() {
		Level level = new Level();
//		Wall wall = new Wall();
//		Cell[][] cell = new Cell[level.ROW_LENGTH][level.COLUMN_HEIGHT];
//		cell = level.getLevelData();
		
		Cell[][] cell = level.getLevelData();
		
		for (int i = 0; i < level.ROW_LENGTH; i++) {
			for (int j = 0; j < level.COLUMN_HEIGHT; j++) {
				System.out.print(cell[j][i].toString());
			}
			System.out.println("");
		}
	}

}
