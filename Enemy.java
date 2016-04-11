package f2.spw;             #CP02

public class Enemy extends Sprite{
	private int step = 12;
	private boolean alive = true;
	
	public Enemy(int x, int y) {
		super(x, y,15, 5);
		
	}

	public void proceed(){
		y += step;
		if(y > Y_TO_DIE){
			alive = false;
		}
	}
	
	public boolean isAlive(){
		return alive;
	}

	public boolean isDie(){
		return alive = false;
	}
}
