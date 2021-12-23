package a06_입력임;

import java.util.Scanner;

public class Userinfo {
 
	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			String name;
			String id;
			int passward;
			String email;
			
			System.out.println("사용자의 이름을 입력해 주세요: ");
			name = in.nextLine();
			System.out.println("사용자의 아이디를 입력해 주세요: ");
			id = in.nextLine();
			System.out.println("사용자의 비밀번호를 입력해 주세요: ");
			passward = in.nextInt();
			in.nextLine(); //버퍼로 날릴것 nextline 하나를 만들어준다
			System.out.println("사용자의 이메일을 입력해 주세요: ");
			email = in.nextLine();
			
			System.out.println("\n[입력한 사용자의 정보]\r\n"
					+ "이름: " + name + "\r\n"
					+ "아이디: " + id + "\r\n"
					+ "비밀번호: " + passward + "\r\n"
					+ "이메일: " + email + "\r\n");
	}

}
