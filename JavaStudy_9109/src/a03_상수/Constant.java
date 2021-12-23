package a03_상수;

public class Constant {

	public static void main(String[] args) {
		int maxNumber;
		final int MAX_NUMBER;
		
		maxNumber = 100;
		MAX_NUMBER = 200;
		
		System.out.print("변수: ");
		System.out.println(maxNumber);
		System.out.print("상수: ");
		System.out.println(MAX_NUMBER);
		
		maxNumber = 200;
	
		System.out.print("변수: ");
		System.out.println(maxNumber);
		System.out.print("상수: ");
		System.out.println(MAX_NUMBER - 100); //상수는 바뀔수 없어서 안에 기준값을 건들여 줘야함 
		
	}

}
