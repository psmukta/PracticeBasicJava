package oppsClass;



public class CarClass {
	private int DoorN;
	private int mirror;
	private int seat;
	private int speed;
	public int Speed() {
		return speed;
	}
	
	public void slowSpeed(int speed) {
		this.speed=speed;
	}
	public CarClass() {
		
	}
	public CarClass(int DoorN,int mirror,int seat,int speed) {
		this.DoorN=DoorN;
		this.mirror=mirror;
		this.seat=seat;
		this.speed=speed;
	}
	public int getDoorN() {
		return DoorN;
	}
	public void setDoorN(int doorN) {
		this.DoorN = doorN;
	}
	public int getMirror() {
		return mirror;
	}
	public void setMirror(int mirror) {
		this.mirror = mirror;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void getSpeed(int speed) {
		this.speed=speed;
	}

	@Override
	public String toString() {
		return "CarClass [DoorN=" + DoorN + ", mirror=" + mirror + ", seat=" + seat + ", speed=" + speed + "]";
	}
	
		/*List<Integer> a = new ArrayList<>();
		a.contains("");*/
		
	

}
