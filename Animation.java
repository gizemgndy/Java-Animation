import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Animation extends JFrame implements ActionListener{
	private int x;
	private int y;
	private JButton btnRight,btnStop;
	private Timer timer;
	private Random ran;
	private Color color;
	
	public Animation() {
		x=400;
		y=400;
		btnRight=new JButton("Start");
		setLayout(new BorderLayout());
		add(btnRight,BorderLayout.NORTH);
		btnRight.addActionListener(this);
		
		btnStop=new JButton("Stop");
		add(btnStop,BorderLayout.SOUTH);
		btnStop.addActionListener(this);
		
		timer=new Timer(200, this);
		//timer.start();
		
		ran=new Random();
		color=new Color(ran.nextInt(255),ran.nextInt(255),ran.nextInt(255));//RGB
	
		
		
		setSize(500,500);
		setVisible(true);
		setTitle("Animation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.setColor(color);
		g.fillOval(x, y, 100, 100);
		
	}
	

	public static void main(String[] args) {
		new Animation();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btnRight))
		timer.start();
		else if(e.getSource().equals(btnStop))
		timer.stop();
		else if (e.getSource().equals(timer))
		
			
		//x=x-5; //- means x going to left side
			
			x=x-ran.nextInt(10);
		//System.out.println("New value of x is :" +x);
		//y=y-10;
		y=y-ran.nextInt(10);
		color=new Color(ran.nextInt(255),ran.nextInt(255),ran.nextInt(255));//RGB
		repaint(); //call the paint method...
		
		
		
	}

}
