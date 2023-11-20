import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


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

public class ReversiGame extends JFrame
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
	
	public ReversiGame() 
	{
		JLabel label = new JLabel();
		JPanel panel = new JPanel();
		JButton button = new JButton("click me");
		
		this.setTitle("Reversi Game");
		
		setPreferredSize(new Dimension(500, 550));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
	
	//Source: http://www.java2s.com/Code/Java/2D-Graphics-GUI/DrawrectanglesusethedrawRectmethodTofillrectanglesusethefillRectmethod.htm 
	//How to paint the 2d GUI
	public void paintComponent(Graphics g)
	{
		
	}
	
	public String[][] initialize()
	{
		for(int i = 0; i < board.length; i++)
		{
			for(int j = 0; j < board.length; j++)
			{
				board[i][j] = empty;
			}
		}
		//have the pieces in correct position
		board[3][3] = player;
		board[3][4] = opponent;
		board[4][3] = player;
		board[4][4] = opponent;
		
		return board;
		
	}
	
	public static void main(String[]args)
	{
		new ReversiGame();
	}
	
}
