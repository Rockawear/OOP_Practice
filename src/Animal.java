
public class Animal {
	private String name;
	private String color;
	private int shape;
	private int weight;

	public Animal(String name, String color, int shape, int weight) {
		this.name = name;
		this.color = color;
		this.shape = shape;
		this.weight = weight;
		
	}
	public void eat(){
		
	}
	public void move(int speed){
		System.out.println("Animal.move called . A nimal always moving at "+ speed);
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public int getShape() {
		return shape;
	}

	public int getWeight() {
		return weight;
	}

}
