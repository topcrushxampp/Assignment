package f2.spw;

import java.awt.Color;
import java.awt.Graphics2D;

public class SpaceShip extends Sprite{

	int step = 20;
	
	public SpaceShip(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}

	@Override
	public void draw(Graphics2D g) {
		g.setColor(Color.CYAN);
		g.fillRect(x, y, width, height+30);
		g.setColor(Color.BLUE);
		g.fillRect(x+5, y-5, width-10, height);
		g.setColor(Color.MAGENTA);
		g.fillRect(x+10, y-10, width-20, height);
		
	}

	public void move(int direction){
		x += (step * direction);
		if(x < 0)
			x = 0;
		if(x > 400 - width)
			x = 400 - width;
	}

}
