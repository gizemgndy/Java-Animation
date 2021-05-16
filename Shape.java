import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Shape extends JFrame{

	private Font font;
	private int x,y;
	private String text;
	
	public Shape() {
		
		font =new Font("TimesRoman", Font.BOLD+Font.ITALIC,20);
		
		x=100;
		y=300;
		text="We are staying in Ýstanbul";
		
		setSize(500,500);
		setVisible(true);
		setTitle("MyShape");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Shape();

	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.red);
		g.setFont(font);
		g.drawString(text, x, y); //variables 
		
		/*
		g.setColor(Color.GREEN);
		g.drawRect(x, y+20, 100, 50);
		
		g.setColor(Color.BLACK);
		g.drawOval(200, 200, 100, 100);
		
		g.setColor(Color.GRAY);
		g.drawOval(50, 300, 50, 100);
		
		g.fillRect(300, 50, 200, 100);
		
		g.setColor(Color.PINK);
		g.fillOval(50, 100,100,100);
		
		g.fillOval(300, 200, 100, 100);
	
		*/
		
		g.drawLine(50, 100, 300, 100);
		g.drawLine(50, 100, 300, 200);
		g.drawLine(300, 100, 300, 200);
		
		
	}
}
