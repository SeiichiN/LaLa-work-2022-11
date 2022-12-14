package app;

public class Sedan extends Car {
	public final double MAX_SPEED;

	public Sedan(double nenpi) {
		super(nenpi);
		this.MAX_SPEED = 120.0;
	}
	@Override
	public void setSpeed(double speed) {
		if (speed > MAX_SPEED) {
			speed = MAX_SPEED;
		}
		super.setSpeed(speed);
	}
}
