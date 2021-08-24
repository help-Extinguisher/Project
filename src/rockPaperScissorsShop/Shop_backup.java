//package rockPaperScissorsShop;
//
//import java.util.Scanner;
//
//
//class ShopMenuSwitch {
//	
//	static Scanner scan = null;
//	
//	
//	static void menuSwitch() {
//		
//	System.out.println(" > [혼자 공부하는 자바]는 [10코인]입니다. 구입할까요? (현재 잔여 코인 : " + ")");
//	System.out.println("		☞ 1. YES		☞ 2. NO		");
//	String yesOrNo = scan.nextLine();
//		if (Integer.parseInt(yesOrNo) == 1) { 
//			System.out.println("-------------------------------------------------------------");
//			System.out.println();
//			System.out.println("> [혼자 공부하는 자바]를 구입했습니다. (현재 잔여 코인 : " + ")");
//			try {
//				System.out.println();
//				System.out.println(" > 3초 후 상점 화면으로 돌아갑니다.\n\n\n\n\n\n");
//				Thread.sleep(3000); // 3초 지연
//				ShopMain.shopMain();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			
//		} else {
//			System.out.println(" > 상점 화면으로 돌아갑니다.\n\n\n\n\n\n");
//			ShopMain.shopMain();
////			break;
//		}
//		
////		scan.close();
//		
//	}
//}
//
//
//
//public class Shop_backup {
//	public static void main(String[] args) {
//		
//		ShopMenuSwitch swh = new ShopMenuSwitch();
//		swh.scan = new Scanner(System.in);
//				
////		ShopMenuSwitch.scan = new Scanner(System.in);
//		
//		
//		ShopMain.shopMain();
//		
//		
//		
//		while(true) {
//			
//			String sNum = swh.scan.nextLine();
//
//
//			switch(sNum) {
//			case "1" : ShopMenuSwitch.menuSwitch(); break;
//			
////				System.out.println(" > [혼자 공부하는 자바]는 [10코인]입니다. 구입할까요? (현재 잔여 코인 : " + ")");
////				System.out.println("		☞ 1. YES		☞ 2. NO		");
////				String yesOrNo = scan.nextLine();
////					if (Integer.parseInt(yesOrNo) == 1) { 
////						System.out.println("-------------------------------------------------------------");
////						System.out.println();
////						System.out.println("> [혼자 공부하는 자바]를 구입했습니다. (현재 잔여 코인 : " + ")");
////						try {
////							System.out.println();
////							System.out.println(" > 3초 후 상점 화면으로 돌아갑니다.\n\n\n\n\n\n");
////							Thread.sleep(3000); // 3초 지연
////							ShopMain.shopMain();
////						} catch (InterruptedException e) {
////							e.printStackTrace();
////						}
////						
////					} else {
////						System.out.println(" > 상점 화면으로 돌아갑니다.\n\n\n\n\n\n");
////						ShopMain.shopMain();
////						break;
////					}
//					
//					
//				
//				
//			case "2" :
//				System.out.println("2번 들어갈곳");
//				break;
//				
//				
//			case "3" :
//				System.out.println("3번 들어갈곳");
//				break;
//				
//				
//			case "4" :
//				System.out.println("4번 들어갈곳");
//				break;
//				
//				
//			case "5" :
//				System.out.println("5번 들어갈곳");
//				break;
//				
//				
//			case "0" :
//				System.out.println(" > 메인 화면으로 돌아갑니다.");
//				try {
//					System.out.println();
//					Thread.sleep(3000); // 3초 지연
//					ShopMain.shopMain(); // 여기다 메인화면으로 들어가는 뭐시기 호출해서 넣기
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			
//				
//				break;
//				
//				
//			
//			}
//		}
//		
//		
//	}
//	    
//
//}
