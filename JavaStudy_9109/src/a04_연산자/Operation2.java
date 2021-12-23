package a04_연산자;

/**
 * 
 * @author ITPS
 * 클래스의 사용설명서
 * 
 * 논리연산자
 * ADN: 곱, 
 * true(1) && true(1) -> true   
 * true(1) && false(0) -> false 
 * false(0) && false(0) -> false
 * 
 * OR: 합,
 * true or true -> true
 * true or false -> true
 * false or false -> false
 * 
 *  
 * NOT: 반전, 부정, 
 * !true -> false
 * !false ->true
 * !(true or false) -> false 
 * 
 */



public class Operation2 {
	/**
	 * 
	 * @param args
	 * 메소드의 사용설명서 
	 */
	public static void main(String[] args) {
		//한줄 주석 
		
		/*
		 * 여러줄 주석 
		 * 
		 */
		
		/*
		안녕
		하세요
		반갑습니다 
		*/

		boolean trueFalse = (5>3) && (3<1);
		System.out.println(!trueFalse);
		
		
		
	}

}
