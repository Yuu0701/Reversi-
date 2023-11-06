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
 * A basic structrue for a piece for Reversi
 * 
 * */


public abstract class Piece
{
	private String type;
	
	//String type will be placed on the board on the GUI application
	public Piece(String type)
	{
		this.type = type;
	}
	
	public String pieceType()
	{
		return type;
	}
}
