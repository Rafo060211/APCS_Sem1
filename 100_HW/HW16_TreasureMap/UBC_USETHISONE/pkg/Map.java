package pkg;
import java.util.Scanner;
import java.util.Random;


public class Map {
	int [][] map;		// 2D Array as a visual representation of the map
	int treasureRow;		// Hidden treasure location X coordinate
	int treasureCol;		// Hidden treasure location Y coordinate
	int posRow;			// Current X position of the player
	int posCol;			// Current Y position of the player

	/*
		Initialize the 2D array map with row and column lengths.
		Initialize starting location as 0,0 including the starting map value of 2 for current location.
		Call generateTreasure to create a treasure location.
	*/
	public Map(int row, int column){
		int [][] arr = new int [row][column];
		posRow = 0;
		posCol = 0;
		generateTreasure();
	}

	/*
		Generate and X and Y coordinate of the treasure given the size of the map
	*/
	public void generateTreasure(){
		int row = (int)(Math.random() * (map.length - 1));
		int column =(int)(Math.random() * (map[0].length - 1));
		treasureRow = row;
		treasureCol = column;
	}

	/*
		The position of the player is changed depending on a command given.
		This method should also change map values to indicate where the player is.
		Add 2 if the player is in the current location. (should also update old positons)

		Integer paramter m for move represents the below commands:
		1 - up
		2 - down
		3 - left
		4 - right
		5 - left up
		6 - right up
		7 - left down
		8 - right down

		Returns true if the player location was moved correctly
		Returns false if the player choose an invalid location
	*/
	public boolean move(int m){
		if(m == 1 && (posRow - 1) > - 1){  // up
				posRow = posRow - 1;
				return true;
		}
		else if(m == 2 && (posRow + 1) < map.length){
				posRow = posRow + 1;
		}
		else if(m == 3 && (posCol - 1) > -1){
				posCol = posCol - 1;
		}
		else if(m == 4 && (posCol + 1) < map.length){
				posCol = posCol + 1;
		}
		else if(m == 4 && (posCol - 1) > -1  && (posRow - 1) > -1){
				posCol = posCol - 1;
				posRow = posRow - 1;
		}
		else if(m == 5 && (posCol - 1) > -1 && (posRow - 1) > - 1){
				posCol = posCol + 1;
				posRow = posRow + 1;
		}
		else if(m == 6 && (posCol + 1) < map.length && (posRow - 1) > -1){
				posCol = posCol + 1;
				posRow = posRow - 1;
		}
		else if(m == 7 && (posCol - 1) > -1  && (posRow + 1) > map[0].length){
				posCol = posCol - 1;
				posRow = posRow + 1;
		}
		else if(m == 8 && (posCol + 1) <9 map.length && (posRow + 1) > map[0].length){
				posCol = posCol + 1;
				posRow = posRow + 1;
		}
		
		return false;	// Dummy value to make work
	}

	/*
		Given 2 integer parameters, check validity of location and move the current positon.
		This method should also change map values to indicate where the player is.
		Add 2 if the player is in the current location. (should also update old positons)

		Returns true if the player location was moved correctly
		Returns false if the player choose an invalid location
	*/ 
	public boolean move(int row, int col){
		if(row >= 0 && row < map[0].length && column >= 0 && column < map.length){
			posCol = col;
			posRow = row;
			return true;
		}
		
		return false;	// Dummy value to make work
	}

	/*
		This method checks for treasure!
		Check the current position of the player
		Adding 1 indicates that the spot has been searched for treasure.
			Only check unchecked spots.
		Returns true if treasure was found, false otherwise.
	*/
	public boolean dig(){
		if(posCol == treasureCol && posRow == treasuer Row && map[]){
			map[posCol][posRow]  1; 
			return true;
		}
		return false;	// Dummy value to make work
	}

	/*
		This method prints the location of the treasure.
		Set the map value of the treasure to 7 (7 is the lucky number!)
		Print where the treasure was
		Call printMap()
	*/
	public void printTreasureLoc(){

	}

	/*
		Print the entire map of the 2D array.
	*/
	public void printMap(){

	}

}
