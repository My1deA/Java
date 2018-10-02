import java.util.*;


public class Airplane extends FlyingObject implements Enermy {
	
	private int speed=3;
	
	public void Ariplane() {
		this.image=ShootGame.airplane;
		width=image.getWidth();
		height=image.getHeight();
		y=-height;
		Random rand=new Random();
		x=rand.nextInt(ShootGame.WIDTH-width);
	
	}
	
	@Override
	public int getScore() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public void step() {
		// TODO Auto-generated method stub
		y+=speed;
		
	}

	@Override
	public boolean outOfBounds() {
		// TODO Auto-generated method stub
		return y>ShootGame.HEIGHT;
	}

}
