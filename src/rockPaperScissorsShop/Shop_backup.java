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
//	System.out.println(" > [ȥ�� �����ϴ� �ڹ�]�� [10����]�Դϴ�. �����ұ��? (���� �ܿ� ���� : " + ")");
//	System.out.println("		�� 1. YES		�� 2. NO		");
//	String yesOrNo = scan.nextLine();
//		if (Integer.parseInt(yesOrNo) == 1) { 
//			System.out.println("-------------------------------------------------------------");
//			System.out.println();
//			System.out.println("> [ȥ�� �����ϴ� �ڹ�]�� �����߽��ϴ�. (���� �ܿ� ���� : " + ")");
//			try {
//				System.out.println();
//				System.out.println(" > 3�� �� ���� ȭ������ ���ư��ϴ�.\n\n\n\n\n\n");
//				Thread.sleep(3000); // 3�� ����
//				ShopMain.shopMain();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			
//		} else {
//			System.out.println(" > ���� ȭ������ ���ư��ϴ�.\n\n\n\n\n\n");
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
////				System.out.println(" > [ȥ�� �����ϴ� �ڹ�]�� [10����]�Դϴ�. �����ұ��? (���� �ܿ� ���� : " + ")");
////				System.out.println("		�� 1. YES		�� 2. NO		");
////				String yesOrNo = scan.nextLine();
////					if (Integer.parseInt(yesOrNo) == 1) { 
////						System.out.println("-------------------------------------------------------------");
////						System.out.println();
////						System.out.println("> [ȥ�� �����ϴ� �ڹ�]�� �����߽��ϴ�. (���� �ܿ� ���� : " + ")");
////						try {
////							System.out.println();
////							System.out.println(" > 3�� �� ���� ȭ������ ���ư��ϴ�.\n\n\n\n\n\n");
////							Thread.sleep(3000); // 3�� ����
////							ShopMain.shopMain();
////						} catch (InterruptedException e) {
////							e.printStackTrace();
////						}
////						
////					} else {
////						System.out.println(" > ���� ȭ������ ���ư��ϴ�.\n\n\n\n\n\n");
////						ShopMain.shopMain();
////						break;
////					}
//					
//					
//				
//				
//			case "2" :
//				System.out.println("2�� ����");
//				break;
//				
//				
//			case "3" :
//				System.out.println("3�� ����");
//				break;
//				
//				
//			case "4" :
//				System.out.println("4�� ����");
//				break;
//				
//				
//			case "5" :
//				System.out.println("5�� ����");
//				break;
//				
//				
//			case "0" :
//				System.out.println(" > ���� ȭ������ ���ư��ϴ�.");
//				try {
//					System.out.println();
//					Thread.sleep(3000); // 3�� ����
//					ShopMain.shopMain(); // ����� ����ȭ������ ���� ���ñ� ȣ���ؼ� �ֱ�
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
