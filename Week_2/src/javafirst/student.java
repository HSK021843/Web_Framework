package javafirst;

class student {
	@Override
	public String toString() {
		return "student [Name=" + Name + ", Age=" + Age + ", Id=" + Id + ", Address=" + Address + "]";
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		if (age < 0) {
			System.out.println("Wrong Age");
		}
		
		Age = age;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public student(String name, int age, String id, String address) {
		super();
		Name = name;
		Age = age;
		Id = id;
		Address = address;
	}

	public student(String name, String id) { //생성자.
		super();
		Name = name;
		Id = id;
	}

	private String Name;
	private int Age;
	private String Id;
	private String Address;
	
//	String ToString() {
//		return "Test String";
//	}
	
	void Work() {
		System.out.println("Student Work");
	}
}