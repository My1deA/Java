import java.awt.image.*;


public abstract class FlyingObject {
	protected int x;
	protected int y;
	protected int width;
	protected int height;
	protected BufferedImage image;
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x=x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	
	public void setWidth(int width) {
		this.width=width;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setHeight(int height) {
		this.height=height;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setImage(BufferedImage image) {
		this.image=image;
	}
	
	public BufferedImage getImage() {
		return image;
	}
	
	//³ö½çÅÐ¶Ï	
	
	public abstract void step();
	
	public abstract boolean outOfBounds();
	
	public boolean shootby(Bullet bullet) {
		int x=bullet.x;
		int y=bullet.y;
		return this.x<x&&x<this.x+width&&this.y<y&&y<this.y+height;
	}

	public boolean shootBy(Bullet bullet) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
















