import java.awt.Color;
import java.util.Random;

public class Circle {
	private int x,y,r;
	private Color color;
	private Random ran;
	
	public Circle() {
		ran =new Random();
		x=ran.nextInt(100)+10;
		y=ran.nextInt(100)+10;
		r=ran.nextInt(100)+10;
		color=new Color(ran.nextInt(255),ran.nextInt(255),ran.nextInt(255));
		
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getR() {
		return r;
	}

	public Color getColor() {
		return color;
	}

	public Random getRan() {
		return ran;
	}
	
	public void moveToRigth() {
		x=x+ran.nextInt(10);
	
	
	}


	public void moveToDowm() {
		y=y+ran.nextInt(10);
	
	
	}
}
