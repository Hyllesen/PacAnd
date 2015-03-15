package test.leveldata;

import static org.junit.Assert.assertEquals;
import level.Cell;
import level.Level;
import level.Wall;

import org.junit.Test;

public class TestUpperAndLowerColumn {

	@Test
	public void test() {
	Level level = new Level();
	Wall wall = new Wall();
	Cell[][] cell = new Cell[level.ROW_LENGTH][level.COLUMN_HEIGHT];
	
	cell = level.getLevelData();
	
	for (int i = 0; i < cell.length; i++) {
		assertEquals(cell[i][0].isWall(), true);
		assertEquals(cell[i][level.COLUMN_HEIGHT - 1].isWall(), true);
		}
	}
}

