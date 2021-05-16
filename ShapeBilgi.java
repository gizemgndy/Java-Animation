import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ShapeBilgi extends JPanel {

	
	public ShapeBilgi() {
	
		setSize(500,500);
		
	}
	
	 @Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		g.setColor(Color.red);
		//g.setFont(font);
		//g.drawString(text, x, y); //variables 
		
		g.setColor(Color.GREEN);
		//g.drawRect(x, y+20, 100, 50);
		
		g.setColor(Color.BLACK);
		g.drawOval(200, 200, 100, 100);
		
		g.setColor(Color.GRAY);
		g.drawOval(50, 300, 50, 100);
		
		g.fillRect(300, 50, 200, 100);
		
		g.setColor(Color.PINK);
		g.fillOval(50, 100,100,100);
		
		g.fillOval(300, 200, 100, 100);
	
	
		g.drawLine(50, 100, 300, 100);
		g.drawLine(50, 100, 300, 200);
		g.drawLine(300, 100, 300, 200);
	}
	
	
	public static void main(String[] args) {
		 ShapeBilgi shapeBilgi=new ShapeBilgi();
		 JFrame window=new JFrame();
		 window.add(shapeBilgi);
		 window.setSize(shapeBilgi.getSize());
		 window.setVisible(true);
		 window.setTitle("ShapeBilgi");
	}

}
