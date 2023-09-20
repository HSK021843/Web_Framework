package javafirst;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 25;
		double score = 4.5;
		
		char [] char_array = {'힌', '남', '노'};

		String longText = "힌남노는 어쩌고 저쩌고";
		
		int [] int_array = {1, 2, 3, 4}; 
		
		
		
		System.out.println("hello 김형석"); // 알고 싶은 코드 위에서 Shift + F2로 공식 문서로 이동 가능
		System.out.println(age);
		System.out.println(score);
		System.out.println(char_array);
		System.out.println(longText);
		System.out.println(longText.length());
		//System.out.println(int_array);
		
		for (int i = 0; i < 5; i++) {
			System.out.print("hello 김형석");
		}
		
		System.out.print(age);
		System.out.print(score);
		System.out.println();
		
		
		//int age = 32;
		
		// 20대
		if (age > 19 && age < 30)
		{
			System.out.println("hello 20대");
		}
		else if (age > 29 && age < 40)
		{
			System.out.println("hello 30대");
		}
		else
		{
			System.out.println("hello 40대 이상");
		}
		
		
		switch (age)
		{
		case 15:
			break;
		}
		
		
		for (int i = 0; i < char_array.length; i++)
		{
			if (i == 2)
			{
				continue; // 반복문의 한 회차를 스킵
			}
			
			System.out.println(char_array[i]);
		}
		
		
		for (char item : char_array)
		{
			System.out.println(item);
		}
		
		
		int i = 0;
		while (i < 5)
		{
			System.out.println("hello");
			i++;
			
			if (i > 100)
			{
				break; // 반복문 정지
			}
			
		}
		
	}

}	
