package level;
/**
 * Indeholder data som skal bruges til level og diverse objekter der bliver brugt i level
 * @author hylle
 *
 */
public class Level {
	public static final int ROW_LENGTH = 21;
	public static final int COLUMN_HEIGHT= 21;
	private Cell levelData[][] = new Cell[ROW_LENGTH][COLUMN_HEIGHT];
	
	
	public Cell[][] getLevelData() {
		return levelData;
	}

	public void setLevelData(Cell[][] levelData) {
		this.levelData = levelData;
	}

	public Level() {
		
		//placeholder med væg, ellers får man nullpointer fejl
		for (int i = 0; i < ROW_LENGTH; i++) {
			for (int j = 0; j < COLUMN_HEIGHT; j++) {
				levelData[i][j] = new Cell(new Field());
			}
		}
		//Here we go		
		//Column 0 og 20
		for (int i = 1; i < ROW_LENGTH - 1; i++) {
			levelData[i][0] = new Cell(new Wall());
			levelData[i][COLUMN_HEIGHT - 1] = new Cell(new Wall());
		}		
		
		//Column 1 og 19
		levelData[1][1] = new Cell(new Wall());
		levelData[19][1] = new Cell(new Wall());
		levelData[1][19] = new Cell(new Wall());
		levelData[19][19] = new Cell(new Wall());		
		for (int i = 0; i < COLUMN_HEIGHT; i++) {
			levelData[1][i] = new Cell(new Wall());
			levelData[19][i] = new Cell(new Wall());
		}
		
		//Row 10 just walls
		for (int i = 0; i < COLUMN_HEIGHT; i++) {
			levelData[10][i] = new Cell(new Wall());
		}
		
		
		
		
		
		
		


		
	}
}
