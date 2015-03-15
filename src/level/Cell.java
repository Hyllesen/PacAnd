package level;

import level.Field;


public class Cell {
	private Wall wall;
	private Field field;
	
	public Cell(Wall wall) {
		this.wall = wall;
	}
	
	public Cell(Field field) {
		this.field = field;
	}
	
	public boolean isWall() {
		if(wall != null) {
			return true;
		} 
		return false;
	}
}