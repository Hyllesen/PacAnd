package level;
/**
 * Indeholder data som skal bruges til level og diverse objekter der bliver brugt i level
 * @author hylle
 *
 */
public class Level {
	public static final int ROWS_LENGTH = 21;
	public static final int COLUMNS_HEIGHT= 21;
	private Cell levelData[][] = new Cell[ROWS_LENGTH][COLUMNS_HEIGHT];
	
	
	public Cell[][] getLevelData() {
		return levelData;
	}

	public void setLevelData(Cell[][] levelData) {
		this.levelData = levelData;
	}

	public Level() {
		//Here we go		
		//Første og sidste row er bare væg objekter
		for (int i = 0; i < levelData[0].length; i++) {
			levelData[i][0] = new Cell(new Wall());
			levelData[i][COLUMNS_HEIGHT - 1] = new Cell(new Wall());
		}		
	}
	
	public int getROWS() {
		return ROWS_LENGTH;
	}

	public int getCOLUMNS() {
		return COLUMNS_HEIGHT;
	}
}
