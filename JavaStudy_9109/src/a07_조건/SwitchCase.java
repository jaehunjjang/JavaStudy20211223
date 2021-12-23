package a07_조건;

public class SwitchCase {

	public static void main(String[] args) {
		char select = 'G';
		
		switch(select) {
			case 'A': 
				System.out.println("A");
				break;
			case 'B':  
				System.out.println("B");
				break; //케이스 B만 실행시키고 싶을때 break를 써준다 
			case 'C': 
				System.out.println("C");
				break;
			case 'D': 
				System.out.println("D");
				break;
			case 'F': 
				System.out.println("F");
				break;
			default:
				System.out.println("잘못된 성적");
		}

	}

}
