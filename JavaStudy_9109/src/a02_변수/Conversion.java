package a02_변수;

public class Conversion {

	public static void main(String[] args) {
		int num = 10;
		double number = num;
		int age = (int)number;  //형변환 방법  앞에 자료형을 써주면 됨  
		
		System.out.println(age);
		
		//업캐스팅
		//1. 문자 -> 정수  문자2바이트  정수4바이트 가능 
		char c = 'A';
		int i_c = c;
		System.out.println(i_c);
		
		//다운캐스팅 
		
		int i = 10000000;
		char c_i = (char)i;
		System.out.println(c_i);
	
		//정수 - 실수 
		double i_d = i;
		System.out.println(i_d);
		
		double d = 3.14;
		int d_i = (int)d;
		System.out.println(d_i);
		
		int a = 10;
		System.out.print(++a);
		System.out.print(a);
		
		
		
		
		
		
		

	}

}
