package project4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//starter code for MazeSolver
//CST-201

public class Driver {

	/**
	 * 
	 * @param start
	 * @param end
	 * find a path through the maze
	 * if found, output the path from start to end
	 * if not path exists, output a message stating so
	 * 
	 */
	// implement this method
	public static void depthFirst(MazeCell start, MazeCell end, MazeCell[][] cells, int[][] grid)
	{
		MyStack stack = new MyStack(start);
		boolean stay = true;
		MazeCell pointer = start;
		while (stay)
		{
			System.out.println(pointer.getRow() + ", " + pointer.getCol());
			if (pointer.getDirection() == 0)
			{
				pointer.advanceDirection();
				if (pointer.getRow() > 0 &&
						cells[pointer.getRow() - 1][pointer.getCol()].unVisited() &&
						cells[pointer.getRow() - 1][pointer.getCol()].getCol() >= 0)
				{
					System.out.println("Go up");
					pointer = cells[pointer.getRow() - 1][pointer.getCol()];
					stack.push(pointer);
				}
			}
			else if (pointer.getDirection() == 1)
			{
				pointer.advanceDirection();
				if (pointer.getCol() < cells.length && 
						cells[pointer.getRow()][pointer.getCol() + 1].unVisited() &&
						cells[pointer.getRow()][pointer.getCol() + 1].getCol() >= 0)
				{
					System.out.println("Go right");
					pointer = cells[pointer.getRow()][pointer.getCol() + 1];
					stack.push(pointer);
				}
			}
			else if (pointer.getDirection() == 2)
			{
				pointer.advanceDirection();
				if (pointer.getCol() < cells.length - 1 &&
						cells[pointer.getRow() + 1][pointer.getCol()].getCol() >= 0 && 
						cells[pointer.getRow() + 1][pointer.getCol()].unVisited())
				{
					System.out.println("Go down");
					pointer = cells[pointer.getRow() + 1][pointer.getCol()];
					stack.push(pointer);
				}
			}else if (pointer.getDirection() == 3)
			{
				pointer.advanceDirection();
				if (pointer.getCol() > 0 &&
						cells[pointer.getRow()][pointer.getCol() - 1].unVisited() &&
						cells[pointer.getRow()][pointer.getCol() - 1].getCol() >= 0)
				{
					System.out.println("Go left");
					pointer = cells[pointer.getRow()][pointer.getCol() - 1];
					stack.push(pointer);
				}
			}
			else
			{
				if (!pointer.unVisited())
				{
					stack.pop();
					pointer = stack.top();
				}
			}
			System.out.println(pointer.getRow() + "," + pointer.getCol());
			if (grid[pointer.getRow()][pointer.getCol()] == 4)
			{
				stay = false;
			}
		}
		System.out.println("Maze is solved!!");
	}

	public static void main(String[] args) throws FileNotFoundException {		
		
		//create the Maze from the file
		Scanner fin = new Scanner(new File("Maze.in"));
		//read in the rows and cols
		int rows = fin.nextInt();
		int cols = fin.nextInt();
		
		//create the maze
		int [][] grid = new int[rows][cols];
		
		//read in the data from the file to populate
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				grid[i][j] = fin.nextInt();
			}
		}

		//look at it 
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (grid[i][j] == 3)
					System.out.print("S ");	
				else if (grid[i][j] == 4)
					System.out.print("E ");	
				else
					System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}

		//make a 2-d array of cells
		MazeCell[][] cells = new MazeCell[rows][cols];
		
		//populate with MazeCell obj - default obj for walls

		MazeCell start = new MazeCell(), end = new MazeCell();
		
		//iterate over the grid, make cells and set coordinates
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				//make a new cell
				cells[i][j] = new MazeCell();
				//if it isn't a wall, set the coordinates
				if (grid[i][j] != 0) {
					cells[i][j].setCoordinates(i, j);
					//Set the cell as a valid target
					cells[i][j].setValid();
					//look for the start and end cells
					if (grid[i][j] == 3)
						start = cells[i][j];
					if (grid[i][j] == 4) 
						end = cells[i][j];
					
				}

			}
		}
		
		//testing
		System.out.println("start:"+start+" end:"+end);
		
		//solve it!
		depthFirst(start, end, cells, grid);
		
	}
}