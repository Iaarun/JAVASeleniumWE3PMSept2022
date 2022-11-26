package abstractionDemo;

public class Cat extends Animal implements InterfaceTwo, InterfaceOne{
    
	@Override
	public void animalsound() {
             System.out.println("Cat meow");
	}

	@Override
	public void test1() {
		System.out.println("Implemented in Cat Class");
		
	}

}
