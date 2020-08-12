package 게시판만들기;

import java.util.ArrayList;
import java.util.Scanner;

public class 게시판 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> titles = new ArrayList<String>();
		ArrayList<String> bodys = new ArrayList<String>();
		
		while(true) {
			
			String s = sc.nextLine();
			
			if(s.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
				
			} else if(s.equals("add")) {
				System.out.println("게시물의 제목을 입력해주세요 : ");
				String title = sc.nextLine();
				System.out.println("게시물의 내용을 입력해주세요 : ");
				String body = sc.nextLine();
				
				titles.add(title);
				bodys.add(body);
				
			} else if(s.equals("list")) {
				
				for(int i = 0; i < titles.size(); i++) {
					System.out.println("제목 : "+ titles.get(i));
					System.out.println("내용 : "+ bodys.get(i));
					System.out.println("-----------------------------------");
				}
			}	
		}
		
	}

}
