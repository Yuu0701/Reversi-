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
 * have a system to flip the pieces in all directions
 * 
 * */

public class TurnPieces
{
	//I will keep this one in comment to try out the easier version first because I am thinking how to implement this into my GUI application
//	public void flipPieces(int row, int col)
//	{
//		// for every direction of row is -1 from its position up until less than
//		// or equal to 1
//		for (int dr = -1; dr <= 1; dr++)
//		{
//			// for every direction of column is -1 from its position up until
//			// less than or equal to 1
//			for (int dc = -1; dc <= 1; dc++)
//			{
//				// skip iterations if the statement passes because we don't need
//				// to check our initial position
//				if (dr == 0 && dc == 0)
//				{
//					continue;
//				}
//				// r and c will become the new position
//				int r = row + dr;
//				int c = col + dc;
//
//				// initialize the boolean as false and will return true if it
//				// finds opponent
//				boolean foundOpponent = false;
//
//				// while loop as long as r and c are not out of bounds
//				while (r >= 0 && r < ReversiGame.SIZE && c >= 0
//						&& c < ReversiGame.SIZE)
//				{
//					// the loop breaks if the position is empty
//					if (ReversiGame.board[r][c] == " ")
//					{
//						break;
//					}
//					// check if the position belongs to a player's position
//					if (ReversiGame.board[r][c] == ReversiGame.player)
//					{
//						// if foundOpponent is true, it returns true because it
//						// indicates there was at least one of opponent's piece
//						// before
//						if (foundOpponent)
//						{
//							// instantiate with new position when opponent is
//							// found
//							int flipRow = row + dr;
//							int flipCol = col + dc;
//
//							// I am still confused how to make them flip
//							while (flipRow != r || flipCol != c)
//							{
//								// write something that flips the position on
//								// the board from white piece to black piece
//								// it flips the position of the board with
//								// player's piece
//								ReversiGame.board[flipRow][flipCol] = ReversiGame.player;
//								// updates the board
//								flipRow += dr;
//								flipCol += dc;
//							}
//							break;
//						}
//						else
//						{
//							break;
//						}
//					}
//					else
//					{
//						foundOpponent = true;
//					}
//					//checking for player's position
//					r += dr;
//					c += dc;
//				}
//			}
//		}
//	}
	
	// turn the piece upwards
	public void turnUp(int x, int y, String oldPiece, String newPiece)
	{

	}

	// turn the piece downwards
	public void turndown(int x, int y, String oldPiece, String newPiece)
	{

	}

	// check if a piece can be placed on the left
	public void turnLeft(int x, int y, String oldPiece, String newPiece)
	{

	}

	// turn the piece on the right
	public void turnRight(int x, int y, String oldPiece, String newPiece)
	{

	}

	// turn the piece on top left
	public void turnTopLeft(int x, int y, String oldPiece, String newPiece)
	{

	}

	// turn the piece on top right
	public void turnTopRight(int x, int y, String oldPiece, String newPiece)
	{

	}

	// turn the piece on bottom left
	public void turnBottomLeft(int x, int y, String oldPiece, String newPiece)
	{

	}

	// turn the piece on bottom right
	public void turnkBottomRight(int x, int y, String oldPiece, String newPiece)
	{

	}
}
