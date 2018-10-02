
public class Bullet extends FlyingObject{
	
	private  int speed=3;
	
	public Bullet(int x,int y) {
		// TODO Auto-generated constructor stub
		this.x=x;
		this.y=y;
		this.image=ShootGame.bullet;
	}
	
	@Override
	public void step() {
		// TODO Auto-generated method stub
		y-=speed;
	}

	@Override
	public boolean outOfBounds() {
		// TODO Auto-generated method stub
		return y<-height;
	}
	
}
