
public class Main {

	static linkedList grid = new linkedList();
	static int gridLength = 9;
	static int gridHeight = 9;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c = 'O';
		int num = 0;
		int gridHeight = 9;
		
		int[][] sudoku = new int[][] {
									  {1,2,3,4,5,6,7,8,9},
									  {9,8,7,6,5,4,3,2,1},
									  {1,2,3,4,5,6,7,8,9},
									  {9,8,7,6,5,4,3,2,1},
									  {1,2,3,4,5,6,7,8,9},
									  {9,8,7,6,5,4,3,2,1},
									  {1,2,3,4,5,6,7,8,9},
									  {9,8,7,6,5,4,3,2,1},
									  {1,2,3,4,5,6,7,8,9}
									};
									
		int[][] sudoku2 = new int[][] {
									  {0,0,0,0,0,0,0,0,0},
									  {0,0,0,0,0,0,0,0,0},
									  {0,0,0,0,0,0,0,0,0},
									  {0,0,0,0,0,0,0,0,0},
									  {0,0,0,0,0,0,0,0,0},
									  {0,0,0,0,0,0,0,0,0},
									  {0,0,0,0,0,0,0,0,0},
									  {0,0,0,0,0,0,0,0,0},
									  {0,0,0,0,0,0,0,0,0}
									 };
		
		
		createGrid(sudoku);
		
		//grid.displayStringDown();
		//grid.moveToStart();
		grid.displayWholeGridA();
		grid.displayWholeGrid();
		grid.testOne();
		grid.testTwo();
		grid.testThree();
		//grid.displayItemsRight();
		grid.testFour();
		
		//System.out.println(sudoku[2][2]);
		
	}
	
	public static void solvePuzzle(int[][] sudoku) {
		
		for(int j = 0; j < gridLength; j++) {
			
			for(int i = 0; i < gridHeight; i++) {
				
				
				
			}
			
		}
		
		
	}

	
	public static void createGrid(int[][] sudoku) {
		
		grid = new linkedList();
		
		char column = 'A';
		int row = 0;
		
		//Used for the length of the for loop
		//int Length = 9;
		//int Height = 9;
		//loop through columns
		for(int j = 0; j < gridLength; j++) { 
			grid.addItemRight(column, row,sudoku[row][j]); //creates a new column next to A0 with name B0
			row++;
			//loop through rows
			for(int i = 0; i < gridHeight-1; i++) { //Height-1 because Height is used above and outOfIndexException occurs due to 9 Rows
				
				//Adds Link in a column 8 times adding a row number
				grid.addItemDown(column, row,sudoku[row][j]); 
				row++;
				
				//This is only used on the lines after the first line
				if(j!=0) {
					grid.addLeft();
				}
			}
				column++; //changes row
				grid.moveToHead();//returns pointer to the top of column e.g. A0, B0, C0
				row = 0;
		}
		

	}
}
