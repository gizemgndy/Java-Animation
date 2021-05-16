import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Game3 extends JFrame implements ActionListener{
	private JButton btnStart,btnStop;
	private Timer timer;
	
	private Random ran;
	private DrawCircle drawCircle;
	
	private Circle[]circles; //create an array
	private final int SHAPE=10;
	public Game3() {
		
		setLayout(new BorderLayout());
		
		btnStart=new JButton("Start");
		add(btnStart,BorderLayout.NORTH);
		btnStart.addActionListener(this);
		
		btnStop=new JButton("Stop");
		add(btnStop,BorderLayout.SOUTH);
		btnStop.addActionListener(this);
		
		timer=new Timer(200, this);

		ran=new Random();
	
		
		
		circles=new Circle[SHAPE];//number of circles
		for(int i=0; i<SHAPE; i++) {
			circles[i]=new Circle();
		}
		
		drawCircle=new DrawCircle();
		add(drawCircle,BorderLayout.CENTER);
		
		
		setSize(500,500);
		setVisible(true);
		setTitle("Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
	
		new Game3();
		

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btnStart))
			timer.start();
			else if(e.getSource().equals(btnStop))
			timer.stop();
			else if (e.getSource().equals(timer)){
			
				for(int i=0;i<SHAPE;i++) {
					circles[i].moveToRigth();
					circles[i].moveToDowm();
				}
				repaint(); //call the paint method...
			}

			
	}
	//define an inner class to draw circle 
	private class DrawCircle extends JPanel{
		public DrawCircle() {
			setSize(400,400);
		}
		
		@Override
		public void paint(Graphics g) {
			super.paint(g);
		
			for(int i=0;i<SHAPE; i++) {
				g.setColor(circles[i].getColor());
				g.fillOval(circles[i].getX(), circles[i].getY(), circles[i].getR(), circles[i].getR());
				
			
			}
			
		}
	}
	
	

}
