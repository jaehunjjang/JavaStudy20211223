package a07_조건;

public class IfScore {

	public static void main(String[] args) {
		int score = 100;
		
		// 만약에 스코어가 
		//90이상이면 A등급입니다.
		//80이상이면 B등급입니다. 
		//70이상이면 C등급입니다.
		//60이상이면 D등급
		//이하 에프
		
		
		
		if(score > 100 || score<0) {
			System.out.println("계산할 수  없는 점수 입니다.");
	    }else if (score > 89) {
			System.out.println("A등급 입니다.");
		}else if(score > 79) {
			System.out.println("B등급 입니다.");
		}else if(score > 69) {
			System.out.println("C등급 입니다.");
		}else if(score > 59) {
			System.out.println("D등급 입니다.");
		}else {
			System.out.println("F등급입니다.");
		}
		
		
		
		

}
}