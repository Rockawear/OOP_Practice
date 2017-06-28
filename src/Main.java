
public class Main {

	public static void main(String[] args) {
		Animal animal1 = new Animal("Animal", "green", 1, 1);
		animal1.getColor();
		
		Dog dog = new Dog("Boogie", "yellow", 2, 4, 1, 32);
//		dog.eat();
		System.out.println("Animal.eat was called");
		dog.walk();
//		dog.run();
	}

}
