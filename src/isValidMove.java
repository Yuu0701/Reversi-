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
 * decides if a piece can be placed on the board
 * 
 * */

//I hope this boolean isValidMoves works
/**
 * Up (dr = -1, dc = 0)
 * Down (dr = 1, dc = 0)
 * Left (dr = 0, dc = -1)
 * Right (dr = 0, dc = 1)
 * Up-Left (dr = -1, dc = -1)
 * Up-Right (dr = -1, dc = 1)
 * Down-Left (dr = 1, dc = -1)
 * Down-Right (dr = 1, dc = 1)
 */
public class isValidMove
{
	// I will keep this one in comment to try out the easier version first
	// because I am thinking how to implement this into my GUI application

	// private int row;
	// private int col;
	//
	// public isValidMove(int row, int col)
	// {
	// this.row = row;
	// this.col = col;
	// }
	// //check all direction (hopefully whether the pieces can flip or not
	// public boolean isValidMoves(int row, int col)
	// {
	// // return false if out of bounds
	// if (row < 0 || row >= ReversiGame.SIZE || col < 0 || col >=
	// ReversiGame.SIZE || ReversiGame.board[row][col] != " ")
	// {
	// return false;
	// }
	// //for every direction of row is -1 from its position up until less than
	// or equal to 1
	// for (int dr = -1; dr <= 1; dr++)
	// {
	// //for every direction of column is -1 from its position up until less
	// than or equal to 1
	// for (int dc = -1; dc <= 1; dc++)
	// {
	// //skip iterations if the statement passes because we don't need to check
	// our initial position
	// if (dr == 0 && dc == 0)
	// {
	// continue;
	// }
	// //r and c will become the new position
	// int r = row + dr;
	// int c = col + dc;
	//
	// //initialize the boolean as false and will return true if it finds
	// opponent
	// boolean foundOpponent = false;
	//
	// //while loop as long as r and c are not out of bounds
	// while (r >= 0 && r < ReversiGame.SIZE && c >= 0
	// && c < ReversiGame.SIZE)
	// {
	// //the loop breaks if the position is empty
	// if (ReversiGame.board[r][c] == " ")
	// {
	// break;
	// }
	// //check if the position belongs to a player's position
	// if (ReversiGame.board[r][c] == ReversiGame.player)
	// {
	// //if foundOpponent is true, it returns true because it indicates there
	// was at least one of opponent's piece before
	// if (foundOpponent)
	// {
	// return true;
	// }
	// else
	// {
	// break;
	// }
	// }
	// //if the position at r and c is not empty and not belong to player, it
	// indicates that opponent piece is found
	// else
	// {
	// foundOpponent = true;
	// }
	// //update r and c
	// r += dr;
	// c += dc;
	// }
	// }
	// }
	// //returns false if none of valid moves are found
	// return false;
	// }

	// check if a piece can be placed on upwards
	public void checkUp(int x, int y, String putPiece, String newPiece)
	{
		// no piece can be flip up on first two rows
		if (x > 1)
		{
			String nextMove = ReversiGame.board[x - 1][y];
			// check if the piece above is enemy's piece
			if (nextMove.equals(newPiece))
			{
				// check for piece that is 2 rows above the position
				for (int i = 2; i < 8; i++)
				{
					// if that piece is empty, you can't place a piece here
					if (ReversiGame.board[x - i][y].equals(ReversiGame.empty))
					{
						break;
					}
					// if there is a same color piece that you put, you can
					// place
					// the piece
					else if (ReversiGame.board[x - i][y].equals(putPiece))
					{
						// if the piece equals the black, that means the black
						// piece can be placed
						if (putPiece.equals(ReversiGame.player))
						{
							ReversiGame.judgeB = true;
						}
						// if the piece equals the white, that means the white
						// piece can be placed
						else
						{
							ReversiGame.judgeW = true;
						}
						break;
					}
				}
			}
		}
	}

	// check if a piece can be placed on downwards
	public void checkDown(int x, int y, String putPiece, String newPiece)
	{
		// no piece can be flip up on first two rows
		if (x < 6)
		{
			String nextMove = ReversiGame.board[x + 1][y];
			// check if the piece above is enemy's piece
			if (nextMove.equals(newPiece))
			{
				// check for piece that is 2 rows above the position
				for (int i = 2; i < 8; i++)
				{
					// if that piece is empty, you can't place a piece here
					if (ReversiGame.board[x + i][y].equals(ReversiGame.empty))
					{
						break;
					}
					// if there is a same color piece that you put, you can
					// place the piece
					else if (ReversiGame.board[x + i][y].equals(putPiece))
					{
						// if the piece equals the black, that means the black
						// piece can be placed
						if (putPiece.equals(ReversiGame.player))
						{
							ReversiGame.judgeB = true;
						}
						// if the piece equals the white, that means the white
						// piece can be placed
						else
						{
							ReversiGame.judgeW = true;
						}
						break;
					}
				}
			}
		}
	}

	// check if a piece can be placed on the left
	public void checkLeft(int x, int y, String putPiece, String newPiece)
	{
		// no piece can be flip up on first two rows
		if (y > 1)
		{
			String nextMove = ReversiGame.board[x][y - 1];
			// check if the piece above is enemy's piece
			if (nextMove.equals(newPiece))
			{
				// check for piece that is 2 rows above the position
				for (int i = 2; i < 8; i++)
				{
					// if that piece is empty, you can't place a piece here
					if (ReversiGame.board[x][y - i].equals(ReversiGame.empty))
					{
						break;
					}
					// if there is a same color piece that you put, you can
					// place
					// the piece
					else if (ReversiGame.board[x][y - i].equals(putPiece))
					{
						// if the piece equals the black, that means the black
						// piece can be placed
						if (putPiece.equals(ReversiGame.player))
						{
							ReversiGame.judgeB = true;
						}
						// if the piece equals the white, that means the white
						// piece can be placed
						else
						{
							ReversiGame.judgeW = true;
						}
						break;
					}
				}
			}
		}
	}

	// check if a piece can be placed on the right
	public void checkRight(int x, int y, String putPiece, String newPiece)
	{
		// no piece can be flip up on first two rows
		if (y < 6)
		{
			String nextMove = ReversiGame.board[x][y + 1];
			// check if the piece above is enemy's piece
			if (nextMove.equals(newPiece))
			{
				// check for piece that is 2 rows above the position
				for (int i = 2; i < 8; i++)
				{
					// if that piece is empty, you can't place a piece here
					if (ReversiGame.board[x][y + i].equals(ReversiGame.empty))
					{
						break;
					}
					// if there is a same color piece that you put, you can
					// place
					// the piece
					else if (ReversiGame.board[x][y + i].equals(putPiece))
					{
						// if the piece equals the black, that means the black
						// piece can be placed
						if (putPiece.equals(ReversiGame.player))
						{
							ReversiGame.judgeB = true;
						}
						// if the piece equals the white, that means the white
						// piece can be placed
						else
						{
							ReversiGame.judgeW = true;
						}
						break;
					}
				}
			}
		}
	}

	// check if a piece can be placed on top left
	public void checkTopLeft(int x, int y, String putPiece, String newPiece)
	{
		// no piece can be flip up on first two rows
		if (x > 1 && y > 1)
		{
			String nextMove = ReversiGame.board[x - 1][y - 1];
			// check if the piece above is enemy's piece
			if (nextMove.equals(newPiece))
			{
				// check for piece that is 2 rows above the position
				for (int i = 2; i < 8; i++)
				{
					// if that piece is empty, you can't place a piece here
					if (ReversiGame.board[x - i][y - 1]
							.equals(ReversiGame.empty))
					{
						break;
					}
					// if there is a same color piece that you put, you can
					// place
					// the piece
					else if (ReversiGame.board[x - i][y - 1].equals(putPiece))
					{
						// if the piece equals the black, that means the black
						// piece can be placed
						if (putPiece.equals(ReversiGame.player))
						{
							ReversiGame.judgeB = true;
						}
						// if the piece equals the white, that means the white
						// piece can be placed
						else
						{
							ReversiGame.judgeW = true;
						}
						break;
					}
				}
			}
		}
	}

	// check if a piece can be placed on top right
	public void checkTopRight(int x, int y, String putPiece, String newPiece)
	{
		// no piece can be flip up on first two rows
		if (x > 1 && y < 6)
		{
			String nextMove = ReversiGame.board[x - 1][y + 1];
			// check if the piece above is enemy's piece
			if (nextMove.equals(newPiece))
			{
				// check for piece that is 2 rows above the position
				for (int i = 2; i < 8; i++)
				{
					// if that piece is empty, you can't place a piece here
					if (ReversiGame.board[x - i][y + i]
							.equals(ReversiGame.empty))
					{
						break;
					}
					// if there is a same color piece that you put, you can
					// place
					// the piece
					else if (ReversiGame.board[x - i][y + i].equals(putPiece))
					{
						// if the piece equals the black, that means the black
						// piece can be placed
						if (putPiece.equals(ReversiGame.player))
						{
							ReversiGame.judgeB = true;
						}
						// if the piece equals the white, that means the white
						// piece can be placed
						else
						{
							ReversiGame.judgeW = true;
						}
						break;
					}
				}
			}
		}
	}

	// check if a piece can be placed on bottom left
	public void checkBottomLeft(int x, int y, String putPiece, String newPiece)
	{
		// no piece can be flip up on first two rows
		if (x < 6 && y > 1)
		{
			String nextMove = ReversiGame.board[x + 1][y - 1];
			// check if the piece above is enemy's piece
			if (nextMove.equals(newPiece))
			{
				// check for piece that is 2 rows above the position
				for (int i = 2; i < 8; i++)
				{
					// if that piece is empty, you can't place a piece here
					if (ReversiGame.board[x + i][y - i]
							.equals(ReversiGame.empty))
					{
						break;
					}
					// if there is a same color piece that you put, you can
					// place the piece
					else if (ReversiGame.board[x + i][y - i].equals(putPiece))
					{
						// if the piece equals the black, that means the black
						// piece can be placed
						if (putPiece.equals(ReversiGame.player))
						{
							ReversiGame.judgeB = true;
						}
						// if the piece equals the white, that means the white
						// piece can be placed
						else
						{
							ReversiGame.judgeW = true;
						}
						break;
					}
				}
			}
		}
	}

	// check if a piece can be placed on bottom right
	public void checkBottomRight(int x, int y, String putPiece, String newPiece)
	{
		// no piece can be flip up on first two rows
		if (x < 6 && y < 6)
		{
			String nextMove = ReversiGame.board[x + 1][y + 1];
			// check if the piece above is enemy's piece
			if (nextMove.equals(newPiece))
			{
				// check for piece that is 2 rows above the position
				for (int i = 2; i < 8; i++)
				{
					// if that piece is empty, you can't place a piece here
					if (ReversiGame.board[x + i][y + i]
							.equals(ReversiGame.empty))
					{
						break;
					}
					// if there is a same color piece that you put, you can
					// place the piece
					else if (ReversiGame.board[x + i][y + i].equals(putPiece))
					{
						// if the piece equals the black, that means the black
						// piece can be placed
						if (putPiece.equals(ReversiGame.player))
						{
							ReversiGame.judgeB = true;
						}
						// if the piece equals the white, that means the white
						// piece can be placed
						else
						{
							ReversiGame.judgeW = true;
						}
						break;
					}
				}
			}
		}
	}
}
