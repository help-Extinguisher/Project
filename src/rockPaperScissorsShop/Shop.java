package rockPaperScissorsShop;

import java.util.Scanner;


class ShopMenuSwitch {
	
	static Scanner scan = null;
	
	static String bookName = "책이름";
	static int bookCoin = 0;
	
	
	static void menuSwitch(String bookName, int bookCoin) {
		
	System.out.println(" > [" + bookName + "]은(는) [" + bookCoin + "코인]입니다. 구입할까요? (현재 잔여 코인 : " + ")");
	System.out.println("		☞ 1. YES		☞ 2. NO		");
	String yesOrNoSc = scan.nextLine(); // yesOrNo 주석처리했는데 왜돌아가냐고 이거
		if (Integer.parseInt(yesOrNoSc) == 1) { 
			System.out.println("-------------------------------------------------------------");
			System.out.println();
			System.out.println("> [" + bookName + "]를 구입했습니다. (현재 잔여 코인 : " + ")");
			try {
				System.out.println();
				System.out.println(" > 3초 후 상점 화면으로 돌아갑니다.\n\n\n\n\n\n");
				Thread.sleep(3000); // 3초 지연 해부리기
				ShopMain.shopMain();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		} else {
			System.out.println(" > 상점 화면으로 돌아갑니다.\n\n\n\n\n\n");
			ShopMain.shopMain();
//			break;
		}
		
//		scan.close(); // 근데 이거 안닫아도 되나? 닫으면 스캐너 꺼져서 에러남
		
	}
}



public class Shop {
	public static void main(String[] args) {
		
		ShopMenuSwitch swh = new ShopMenuSwitch();
		swh.scan = new Scanner(System.in);
				
		
		ShopMain.shopMain();
		
		
		while(true) {
			
			String sNum = swh.scan.nextLine();


			switch(sNum) {
			case "1" : ShopMenuSwitch.menuSwitch("혼자 공부하는 자바", 10); break;
			
			case "2" : ShopMenuSwitch.menuSwitch("자바스크립트 + 제이쿼리 입문", 10); break;
				
				
			case "3" : ShopMenuSwitch.menuSwitch("점프 투 파이썬", 20); break;
				
				
			case "4" : ShopMenuSwitch.menuSwitch("스프링 퀵 스타트", 20); break;
				
				
			case "5" : ShopMenuSwitch.menuSwitch("개발자", 99); break;
				
				
			case "0" :
				System.out.println(" > 메인 화면으로 돌아갑니다.");
				try {
					System.out.println();
					Thread.sleep(3000); // 3초 지연
					ShopMain.shopMain(); // 여기다 메인화면으로 들어가는 뭐시기 호출해서 넣기
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
				
				break;
				
				
			
			}
		}
		
		
	}
	    

}
