package constructordemo;

public class Box {
	
	int len;
	
	int width;
	int height;
	
	 Box(){
		 this(100,100,100);
		System.out.println("Non Pramaeterized constructor");
	}
	 
	 public Box(int len, int width, int height1) {
		  
			this.len = len;
			this.width = width;
			height = height1;
			System.out.println("Parameterised constructor");
		}
	
	
	
	public static void main(String[] args) {
		Box box = new Box();
		
	//	Box box = new Box(100, 100, 100);
		
		System.out.println(box.len);
		System.out.println(box.width);
		System.out.println(box.height);
		
		
		
	}

}
