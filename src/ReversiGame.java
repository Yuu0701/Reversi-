
public class ReversiGame
{
	//use static for now so that I can easily implement variables in other classes
	static String[][] board = new String[8][8];
	
	static ReversiPieces EMPTY = new ReversiPieces("x");
	static ReversiPieces BLACK = new ReversiPieces("b");
	static ReversiPieces WHITE = new ReversiPieces("w");
}
