package level;
/**
 * Indeholder data som skal bruges til level og diverse objekter der bliver brugt i level
 * @author hylle
 *
 */
public class Level {
	public static final int ROW_LENGTH = 21;
	public static final int COLUMN_HEIGHT= 21;
	private Cell cells[][];
	
	
	public Cell[][] getLevelData() {
		return cells;
	}

	public void setLevelData(Cell[][] levelData) {
		this.cells = levelData;
	}
	
	public void printLevel() {
		for (int i = 0; i < cells.length; i++) {
			for (int j = 0; j < cells.length; j++) {
				System.out.print(cells[i][j].toString());
			}
			System.out.println();
		}
	}
	
	public Level(Cell[][] cells) {
		this.cells = cells;
	}

	public Level() {
		cells = new Cell[ROW_LENGTH][COLUMN_HEIGHT];
		//placeholder med væg, ellers får man nullpointer fejl
		for (int i = 0; i < ROW_LENGTH; i++) {
			for (int j = 0; j < COLUMN_HEIGHT; j++) {
				cells[i][j] = new Cell(new Field());
			}
		}
		//Here we go		
		//Column 0 og 20
		for (int i = 1; i < ROW_LENGTH - 1; i++) {
			cells[i][0] = new Cell(new Wall());
			cells[i][COLUMN_HEIGHT - 1] = new Cell(new Wall());
		}		
		
		//Column 1 og 19
		cells[1][1] = new Cell(new Wall());
		cells[19][1] = new Cell(new Wall());
		cells[1][19] = new Cell(new Wall());
		cells[19][19] = new Cell(new Wall());		
		for (int i = 0; i < COLUMN_HEIGHT; i++) {
			cells[1][i] = new Cell(new Wall());
			cells[19][i] = new Cell(new Wall());
		}
		
		//Row 10 just walls
		for (int i = 0; i < COLUMN_HEIGHT; i++) {
			cells[10][i] = new Cell(new Wall());
		}
		
		//Just a field somewhere for shortest path testing
		cells[10][11] = new Cell(new Field());
		


		
	}

	public void findShortestPath(Cell cell, Cell cell2) {
		//Mussedæ
				
		
	}
}
