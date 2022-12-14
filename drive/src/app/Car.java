package app;

public abstract class Car {
	private double oil;
	public final double OIL_MAX;
	private double speed;
    public final double NENPI;
    
    public Car(double nenpi) {
    	this.NENPI = nenpi;
    	this.oil = 0;
    	this.speed = 0;
    	OIL_MAX = 50.0;
    }
    
    public void run(double hour) {
    	// hour時間で走れる距離
    	double kyori = speed * hour;
    	// その距離を走るのに必要なオイル
    	double usedOil = kyori / NENPI;
    	// 現在の燃料が必要な分より少なければ
    	if (this.getOil() < usedOil) {
    		// 現在の燃料で実際に走れる距離
    		kyori = NENPI * this.getOil();
    		// 現在の燃料をすべて使う
    		usedOil = this.getOil();
    	}
    	// 現在の燃料から使った燃料を引く
    	this.setOil(this.getOil() - usedOil);
    	// kyori -- 実際に走った距離
    	System.out.println(kyori + "走った");
    }
    public void addOil(double oil) {
		double newOil = this.oil + oil;
		if (newOil > OIL_MAX) {
			newOil = OIL_MAX;
		}
		this.setOil(newOil);
    }
	public double getOil() {
		return oil;
	}
	public void setOil(double oil) {
		this.oil = oil;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}

}
