package f2.spw;

public  class Sprite {
	int x;
	int y;
	int width;
	int height;
	
	public Sprite(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	public Double getRectangle() {
		return new Rectangle2D.Double(x, y, width, height);
	}
