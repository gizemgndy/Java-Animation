import java.awt.Graphics;

import javax.swing.JPanel;

public class GameCircle extends JPanel {
	public int x,y;
	
	public GameCircle() {
		setSize(400,400);
		x=100;
		y=100;
		
	}

	
	@Override
	public void paint(Graphics g) {
	
		super.paint(g);
		g.fillOval(x, y, 100, 100);
		
	}
	
	
	public static void main(String[] args) {
		

	}

}
