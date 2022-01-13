package loto;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BlueCircle extends JPanel {
	
	public BlueCircle() {
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.blue);
		g.fillOval(10, 10, 200, 200);

		
	}

	
}
