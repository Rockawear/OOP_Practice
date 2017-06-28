
public class Dog extends Animal {
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;

	public Dog(String name, String color, int eyes, int legs, int tail, int teeth) {
		super(name, color, 1, 1 );
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
	}
	private void chew(){
		System.out.println("dog.chew called");
	}
	@Override
	public void eat() {
		System.out.println("dog.eat called");
		chew();
		super.eat();
	}
	public void walk(){
		System.out.println("dog.walk called");
		super.move(5);
	}
	public void moveLegs(int speed){
		System.out.println("moveLegs called");
	}
	@Override
	public void move(int speed) {
		System.out.println("dog.moved called");
		moveLegs(speed);
		super.move(speed);
	}
	public void run(){
		System.out.println("dog.run called");
		move(20);
	}
}
