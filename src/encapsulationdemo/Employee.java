package encapsulationdemo;

//POJO
public class Employee {

	private String name;
	private int age;
	private String uid;
	private String orgName = "TCS";

	public String getOrgName() {
		return orgName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<=65 && age >=18) {
			this.age = age;
		}else {
			System.out.println("Invalid Age");
		}
		
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}
}
