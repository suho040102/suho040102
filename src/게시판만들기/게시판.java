package 게시판만들기;

import java.util.ArrayList;
import java.util.Scanner;

public class 게시판 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> titles = new ArrayList<String>();
		ArrayList<String> bodys = new ArrayList<String>();
		ArrayList<Integer> nums = new ArrayList<Integer>(); 
		int num = 1;
		
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
				nums.add(num);
				num++;
				 
			} else if(s.equals("list")) {
				for(int i = 0; i < nums.size(); i++) {
					System.out.println("번호 : "+nums.get(i));
					System.out.println("제목 : "+titles.get(i));
					System.out.println("------------------------");
				}
				
			} else if(s.equals("read")) {
				System.out.println("보고싶은 게시물의 번호를 입력해주세요 : ");

				int number = Integer.parseInt(sc.nextLine());
				
				for(int i = 0; i < nums.size(); i++) {
					if(number == nums.get(i)) {
					System.out.println("번호 : "+nums.get(i));
					System.out.println("제목 : "+titles.get(i));
					System.out.println("내용 : "+bodys.get(i));
					break;
					
					}
				}
				
			} else if(s.equals("update")) {
				System.out.println("수정하고싶은 게시물의 번호를 입력해주세요 : ");

				int number = Integer.parseInt(sc.nextLine());
				
				for(int i = 0; i < nums.size(); i++) {
					if(number == nums.get(i)) {
						System.out.println("새로운 제목");
						String title = sc.nextLine();
						System.out.println("새로운 내용");
						String body = sc.nextLine();
						
						titles.set(i, title);
						bodys.set(i, body);
						break;
					
					}
				}
				
			} else if(s.equals("delete")) {
				System.out.println("삭제하고싶은 게시물의 번호를 입력해주세요 : ");

				int number = Integer.parseInt(sc.nextLine());
				
				for(int i = 0; i < nums.size(); i++) {
					if(number == nums.get(i)) {
						nums.remove(i);
						titles.remove(i);
						bodys.remove(i);
						break;
					
					}
				}
			}
		}
	}

}
