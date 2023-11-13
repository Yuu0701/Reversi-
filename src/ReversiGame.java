

/**
 * Lead Author(s):
 * @author Brian Madott
 * @author 
 * <<add additional lead authors here, with a full first and last name>>
 * 
 * Other contributors:
 * <<add additional contributors (mentors, tutors, friends) here, with contact information>>
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * <<add more references here>>
 *  
 * Version/date: 10/23/2023
 * 
 * Responsibilities of class:
 * A GUI aspect of the program
 * makes the board
 * calls all the classes into one
 * 
 * */

public class ReversiGame 
{
	//use static for now so that I can easily implement variables in other classes
	static final int SIZE = 8;
    static String[][] board = new String[SIZE][SIZE];
    
    //create an object of ReversiPieces and instantiate as a String variable
    static String empty = " ";
    static Piece currentPlayer = new ReversiPieces("B");
    static Piece opponentPlayer = new ReversiPieces("W"); 
	static String player = currentPlayer.pieceType();
	static String opponent = opponentPlayer.pieceType();
	
	//I will need variables that judge if a piece can be placed
	static boolean put = false;
	
	//need variables that count the scores
	static int countBlack = 0;
	static int countWhite = 0;
	
	//need variables that determines if black or white piece can be placed on the board
	static boolean judgeB = false;
	static boolean judgeW = false;
	
	
}
