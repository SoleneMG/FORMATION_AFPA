package loto;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class RedCircle extends JPanel {
	
	public RedCircle() {
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.red);
		g.fillOval(10, 10, 200, 200);
//		g.setColor(Color.red);
//		g.drawOval(10, 10, 200, 200);
		
	}

	
}
