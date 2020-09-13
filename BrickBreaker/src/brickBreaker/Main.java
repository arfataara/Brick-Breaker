package brickBreaker;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Brick Breaker Game");
		frame.setBounds(50, 30, 710, 630); // x,y (of top left corner), width,
											// height
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Gameplay gameplay = new Gameplay();
		frame.add(gameplay);
		frame.setVisible(true);

	}

}

