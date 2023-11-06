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
 * A class extends Piece to create specific reversi piece (black, white, empty)
 * 
 * */

public class ReversiPieces extends Piece
{
	//create a specific type of pieces (white piece, black piece, empty piece)
	public ReversiPieces(String type)
	{
		super(type);
	}
}
