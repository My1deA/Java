import java.util.*;

public class Bee extends FlyingObject implements Award {
	private int xSpeed=1;
	private int ySpeed=2;
	private int awardType;
	
	public Bee() {
		this.image=ShootGame.bee;
		width=image.getWidth();
		height=image.getHeight();
		y=-height;
		Random rand =new Random();
		x=rand.nextInt(ShootGame.WIDTH-width);
		awardType=rand.nextInt(2);
	}

	@Override
	public void step() {
		// TODO Auto-generated method stub
		x+=xSpeed;
		y+=ySpeed;
		if(x>ShootGame.WIDTH-width) {
			xSpeed=-1;
		}
		if(x<0) {
			xSpeed=1;
		}
	}

	@Override
	public int getType() {
		// TODO Auto-generated method stub
		return awardType;
	}

	@Override
	public boolean outOfBounds() {
		// TODO Auto-generated method stub
		return y>ShootGame.HEIGHT;
	}
	
	
}














