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
	
	public boolean isField() {
		if(field != null) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		if(isWall()) {
			return "W";
		}
		if(isField()) {
			return "F";
		}
		return "ND";
	}
}