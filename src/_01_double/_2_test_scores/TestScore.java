package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScore {

	public static void main(String[] args) {
		
		String scoreString = JOptionPane.showInputDialog("What is your test score?");
		double score = Double.parseDouble(scoreString);
		
		if(score == 75.0) {
			JOptionPane.showMessageDialog(null, "Ooh, you bearly passed, but you did it.");
		}else if(score > 75.0) {
			JOptionPane.showMessageDialog(null, "Nice! You did great on that test!");
		}else {
			JOptionPane.showMessageDialog(null, "Maybe you should pay more attention in class.");
		}
		
		// i like this program :)
		
	}
	
}
