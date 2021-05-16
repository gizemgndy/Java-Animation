import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Game extends JFrame implements ActionListener{
	private JButton btnStart,btnStop;
	private Timer timer;
	private GameCircle gameCircle;
	private Random ran;
	
	public Game() {
		
		setLayout(new BorderLayout());
		
		btnStart=new JButton("Start");
		add(btnStart,BorderLayout.NORTH);
		btnStart.addActionListener(this);
		
		btnStop=new JButton("Stop");
		add(btnStop,BorderLayout.SOUTH);
		btnStop.addActionListener(this);
		
		timer=new Timer(200, this);
		//this is a panel object
		gameCircle=new GameCircle();
		add(gameCircle,BorderLayout.CENTER);
		
		ran=new Random();
		
		
		
		
		setSize(500,500);
		setVisible(true);
		setTitle("Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
	
		new Game();
		

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btnStart))
			timer.start();
			else if(e.getSource().equals(btnStop))
			timer.stop();
			else if (e.getSource().equals(timer)){
				gameCircle.x=gameCircle.x+ran.nextInt(10);
				gameCircle.y=gameCircle.y+ran.nextInt(10);
				
				
				repaint(); //call the paint method...
			}
			
			
			
			
			
			
	}

}
