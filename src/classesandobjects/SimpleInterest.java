package classesandobjects;

public class SimpleInterest {
	
	public static void main(String[] args) {
		
		int amount = 40000;
		int ri = 5;
		int ti = 5;
		
		int  ta = amount+si(amount,ri,ti);
		System.out.println("SI "+si(amount,ri,ti));
		System.out.println(ta);
		
	
		
	}
	
	public static int si(int principle, int roi, int time) {
	int in = (principle*roi*time)/100;
	
	return in;
	}
	
	public static String whoareyou(String name) {
		return name;
	}

}
