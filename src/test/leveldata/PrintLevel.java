package test.leveldata;

import static org.junit.Assert.*;
import level.Cell;
import level.Level;
import level.Wall;

import org.junit.Test;

public class PrintLevel {
	Level level;
	@Test
	public void test() {
			
			level = new Level();
			level.printLevel();
		}
}
