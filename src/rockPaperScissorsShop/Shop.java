package rockPaperScissorsShop;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Shop {
	// 스캐너 sc로 통일했음
	static String bookName = "책이름";
	static int bookCoin = 0;
	static Scanner sc = new Scanner(System.in); // 전역으로 선언하면 다 쓸수 있다
	static int result; // 전역으로 선언
	
	// 메인 메소드
	public static void main(String[] args) {
		
		selectMenu();
	}

	public static void selectMenu() { // 메소드로 묶어주었다 (호출하면 반복하게)
		// 1. 아이템 선택 메뉴 전시
		while(true) {
			try {
				shopMain();
				result = Integer.parseInt(sc.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println(" > 에러 : 입력 에러. 숫자를 입력하세요. \n\n\n\n");
				continue;
			} catch (InputMismatchException e) {
				System.out.println(" > 에러 : asdfasdf입력 에러. 숫자를 입력하세요. \n\n\n\n");
				continue;
			}
		}
		
		switch (result) {
		case 1 : menuSwitch("혼자 공부하는 자바", 10); break;
		case 2 : menuSwitch("자바스크립트 + 제이쿼리 입문", 10); break;
		case 3 : menuSwitch("점프 투 파이썬", 20); break;		
		case 4 : menuSwitch("스프링 퀵 스타트", 20); break;
		case 5 : menuSwitch("개발자", 99); break;
		case 0 :
			System.out.println(" > 메인 화면으로 돌아갑니다.");
			selectMenu();
			break;	
		}
	}
	    

	public static void shopMain() {
		
		// JAVA SHOP으로 들어가면 나오는 메뉴
		System.out.println(" ▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦ ");
		System.out.println();
		System.out.println(" 	[ 가위바위보 코인을 모아 웹개발 책 아이템을 구입해 보세요~ ] ");
		System.out.println();
		System.out.println(" ▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦");
		System.out.println();
		System.out.println(" ▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦ ");
		System.out.println();
		System.out.println(" 1. 혼자 공부하는 자바 (10코인)	2. 자바스크립트 + 제이쿼리 입문 (10코인) ");
		System.out.println(" 3. 점프 투 파이썬 (20코인)		4. 스프링 퀵 스타트 (20코인) ");
		System.out.println(" 5. 개발자 (99코인) ");
		System.out.println();
		System.out.println(" 			0. 메인화면으로		 ");
		System.out.println();
		System.out.println(" ▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦");
		System.out.print(" > ");
	}
	
	
	
	
	
	static void menuSwitch(String bookName, int bookCoin) {
		
	System.out.println(" > [" + bookName + "]은(는) [" + bookCoin + "코인]입니다. 구입할까요? (현재 잔여 코인 : " +  ")"); // coin 연결하기
	System.out.println("		☞ 1. YES		☞ 2. NO		");
	System.out.print(" > ");
	
		while (true) {
			try {
				if (Integer.parseInt(sc.nextLine()) == 1) { 
					// 여기서 코인 차감하는 코드넣기 (어쩌구 = 현재코인 - 코인값)
					System.out.println("-------------------------------------------------------------");
					System.out.println();
					System.out.println("> [" + bookName + "]를 구입했습니다. (현재 잔여 코인 : " + ")");
					try {
						System.out.println();
						System.out.println(" > 3초 후 상점 화면으로 돌아갑니다.\n\n\n\n\n\n");
						Thread.sleep(3000); // 3초 지연 해부리기
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				
				selectMenu();
				
				
	//			break;
				
			} catch (NumberFormatException e) {
				System.out.println(" > 에러 : 문자열은 입력될 수 없습니다. 숫자를 입력하세요. \n\n\n\n");
				continue;
			}
		}
	}
}
