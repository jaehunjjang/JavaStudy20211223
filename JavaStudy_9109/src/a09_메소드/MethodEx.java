package a09_메소드;

public class MethodEx {
	//매개변수 , 반환값 x	
	public static void printInfo() {
		System.out.println("정");
		System.out.println("재");
		System.out.println("훈");
		System.out.println("입");
		System.out.println("니");
		System.out.println("다");
		
	}
	
	// 매개변수는 있고 반환값은 없다.
	public static void printName(String name) {
		System.out.println("이름 : " + name);
	}

	//매개변수 x, 반환값 o 
	public static String getName() {
		String name = "정재훈";
		return name;
		
	}
	
	//매개변수 o, 반환값o 
	public static String transferName(String name) {
		String tName = name + "님";
		return tName;
	}
	
	public static String transferName2(String name, int number) {
		return number + "번 고객" + name;
	}
		
	
	
	public static void main(String[] args) {
		printInfo();
		
		System.out.println("프로그램 종료");
		
		String name = "정재훈";
		printName(name);
		
		String name2 = getName();
		System.out.println(name2);
		System.out.println(getName());
		
		String name3 = transferName("정재훈");
		System.out.println(name3);
		System.out.println(transferName("정재훈"));
		
		System.out.println(transferName2("정재훈", 1));
			
		
	} //end of main

} // end of class
