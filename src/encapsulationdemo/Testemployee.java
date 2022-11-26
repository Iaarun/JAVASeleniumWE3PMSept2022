package encapsulationdemo;

public class Testemployee {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		
		emp1.setName("Virat");
		emp1.setAge(3200);
		emp1.setUid("21484661");
		
		System.out.println(emp1.getName());
		System.out.println(emp1.getUid());
		System.out.println(emp1.getAge());
		System.out.println(emp1.getOrgName());
	}

}
