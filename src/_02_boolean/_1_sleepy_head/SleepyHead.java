package _02_boolean._1_sleepy_head;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend;
		// Write code to ask the user what day it is.
        String day = JOptionPane.showInputDialog("What day is it?");
		// Set the boolean isWeekend based on the value they enter
		if(day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday")) {
			isWeekend = true;
		}else {
			isWeekend = false;
		}
		
		// If it is the weekend, tell the user they get to sleep in.
		if(isWeekend == true) {
			JOptionPane.showMessageDialog(null, "Nice! You get to sleep in!");
		}else {
			JOptionPane.showMessageDialog(null, "Get off the computer and go to school!");
		}
		// If it is not the weekend, tell them to get out of bed and go to school!
		
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam;
		// Write code to ask the user what percentage they scored in their last exam
		String percentString = JOptionPane.showInputDialog("What percentage did you get in your last exam?");
		int percent = Integer.parseInt(percentString);
		// If they scored more than 70, they passed the exam.
		if(percent >= 70) {
			passedExam = true;
		}else {
			passedExam = false;
		}
		// Set the boolean passedExam based on their score.
		
		// If the user passed the exam, congratulate them
		if(passedExam == true) {
			JOptionPane.showMessageDialog(null, "Nice! You passed!");
		}else {
			JOptionPane.showMessageDialog(null, "Better luck next time!");
		}
		// otherwise, wish them better luck next time.
		
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("Is the game over?");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
			
			// If they answer "yes", change gameIsOver to true

		}
		// Tell the user "game is over" 
		JOptionPane.showMessageDialog(null, "Game is over.");
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		String color = JOptionPane.showInputDialog("What color do you want to draw with?");
		if(color.equalsIgnoreCase("red")) {
			isRed = true;
		}else {
			isRed = false;
		}
		boolean isSquare;		
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		String shape = JOptionPane.showInputDialog("What shape do you want to draw?");
		if(shape.equalsIgnoreCase("square")) {
			isSquare = true;
		}else {
			isSquare = false;
		}
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		
		if(isRed == true && isSquare == true) {
			drawRedSquare();
		}else {
			JOptionPane.showMessageDialog(null, "I don't know how to draw that shape.");
		}
		

	}

	
	static void drawRedSquare() {
		Robot rob = new Robot("mini");
		for(int i=0; i<4; i++) {
			rob.setPenColor(Color.red);
			rob.setSpeed(10);
			rob.penDown();
			rob.move(75);
			rob.turn(90);
		}
		rob.hide();
	}	
}
