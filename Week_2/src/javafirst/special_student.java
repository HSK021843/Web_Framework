package javafirst;

public class special_student extends student {
	@Override
	public String toString() {
		return "special_student [SpecialTypeId=" + SpecialTypeId + "]";
	}

	@Override
	void Work() {
		// TODO Auto-generated method stub
		super.Work();
		
		System.out.println("Special Studen Work");
	}

	public int getSpecialTypeId() {
		return SpecialTypeId;
	}

	public void setSpecialTypeId(int specialTypeId) {
		SpecialTypeId = specialTypeId;
	}

	public special_student(String name, int age, String id, String address, int specialTypeId) {
		super(name, age, id, address);
		SpecialTypeId = specialTypeId;
	}

	private int SpecialTypeId;
	

}
