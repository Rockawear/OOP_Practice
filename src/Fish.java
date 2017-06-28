
public class Fish extends Animal{
	private int gilles;
	private int eyes;
	private int fins;
	
	public Fish(String name, String color, int gilles, int eyes, int fins) {
		super(name, color, 1, 1);
		this.gilles = gilles;
		this.eyes = eyes;
		this.fins = fins;
	}
	private void rest(){
		
	}
	private void moveMuscle(){
		
	}
	private void moveBackFin(){
		
	}
	private void swim(int speed){
		moveMuscle();
		moveBackFin();
		super.move(speed);
	}

}
