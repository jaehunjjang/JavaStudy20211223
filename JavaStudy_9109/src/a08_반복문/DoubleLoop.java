package a08_반복문;

public class DoubleLoop {

	public static void main(String[] args) {
		//1.while
		int i = 0;
		while(i <5) {
			System.out.println("[i값]: " + i);
			int j = 0;
			while(j < 3) {
				System.out.println("j값: " + j);
				j++;
			}
			i++;
			
		}

		
		//2. for 규칙적인 반복이 일어나면 포문을 쓰
		
		
			System.out.println("[i값]: " + i);
			for(int j = 0; j < 3; j++) {
				System.out.println("j값: " + j);	
			}
				
		}
			
			
			
	}


