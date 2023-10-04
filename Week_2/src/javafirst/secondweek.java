package javafirst;

public class secondweek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열로 저장하기
		String [] testArray;
		
		String [] StudentNames = new String[30];
		int [] StudentAges = new int[30];
		String [] StudentIds = new String[30];
		String [] StudentAddress = new String[30];
		
		
		testArray = new String[100];
		System.out.println(testArray.length);
		
		
		StudentNames[0] = "가나다";
		StudentNames[1] = "홍길동";
		StudentNames[2] = "마바사";
		StudentNames[3] = "아자차";
		StudentNames[4] = "길동";
		StudentNames[5] = "김시민";
		StudentNames[6] = "타파하";
		StudentNames[7] = "ABC";
		StudentNames[8] = "DEF";
		StudentNames[9] = "GHI";
		
		StudentAges[0] = 21;
		StudentAges[1] = 23;
		StudentAges[3] = 33;
		StudentAges[4] = 13;
		StudentAges[5] = 24;
		StudentAges[6] = 34;
		StudentAges[7] = 28;
		StudentAges[8] = 20;
		StudentAges[9] = 25;
		
		StudentIds[0] = "123456789";
		StudentIds[1] = "234567890";
		StudentIds[2] = "345678901";
		StudentIds[3] = "284858384";
		StudentIds[4] = "239593838";
		StudentIds[5] = "493892381";
		StudentIds[6] = "483829382";
		StudentIds[7] = "329382352";
		StudentIds[8] = "392436522";
		StudentIds[9] = "385838843";
		
		StudentAddress[0] = "서울";
		StudentAddress[1] = "부산";
		StudentAddress[2] = "제주";
		StudentAddress[3] = "대구";
		StudentAddress[4] = "서귀포";
		StudentAddress[5] = "광주";
		StudentAddress[6] = "강릉";
		StudentAddress[7] = "용인";
		StudentAddress[8] = "울산";
		StudentAddress[9] = "전주";
		
		for (int i = 0; i < 5; i ++) {
			System.out.println(StudentNames[i]);
			System.out.println(StudentAges[i]);
			System.out.println(StudentIds[i]);
		}
		
				
		// 클래스로 저장하기 -> '.'을 이용해서 'i번의 이름, 나이, 아이디의 관점'에서 'i번인 학생의 이름, 나이, 아이디의 관점'으로 전환 -> 연관이 생김으로써 관리에 유리
		student [] students = new student[30];
		
//		for (int i = 0; i < 30; i++) {
//			students[i] = new student();
//		}
		
		
		students[0] = new student("가나다", "123456789");
		students[1] = new student("홍길동", "234567890");
		students[2] = new student("홍길동", "345678901");
		
		students[0].setAge(21);
//		students[0].Name = "가나다";
//		students[0].Age = 21;
//		students[1].Id = "123456789";
		
		students[1].setAge(23);
//		students[1].Name = "홍길동";
//		students[1].Age = 23;
//		students[1].Id = "234567890";
		
		students[2].setAge(33);
//		students[2].Name = "마바사;
//		students[2].Age = 33;
//		students[2].Id = "345678901"
		

		for (int i = 0; i < 3; i++) {
			System.out.println(students[i].getName());
			System.out.println(students[i].getAge());
			System.out.println(students[i].getId());
			System.out.println(students[i].toString());
			students[i].Work();
		}
		  
		special_student ss = new special_student("tester", 45, "ss12345", null, 2);
		System.out.println(ss.getName());
		System.out.println(ss.getAge());
		System.out.println(ss.getId());
		System.out.println(ss);
		ss.Work();
		
		
		registable [] registables = new registable[4];
		
		for (int i = 0; i < 3; i++) {
			registables[i] = students[i];
		}
		
		registables[3] = ss;
		
		
		for (registable reg : registables) {
			reg.regist();
		}
		
		for (registable reg : registables) {
			reg.drop();
		}
		
	}

}
