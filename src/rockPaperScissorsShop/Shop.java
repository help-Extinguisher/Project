package rockPaperScissorsShop;

import java.util.Scanner;


class ShopMenuSwitch {
	
	static Scanner scan = null;
	
	static String bookName = "å�̸�";
	static int bookCoin = 0;
	
	
	static void menuSwitch(String bookName, int bookCoin) {
		
	System.out.println(" > [" + bookName + "]��(��) [" + bookCoin + "����]�Դϴ�. �����ұ��? (���� �ܿ� ���� : " + ")");
	System.out.println("		�� 1. YES		�� 2. NO		");
	String yesOrNoSc = scan.nextLine(); // yesOrNo �ּ�ó���ߴµ� �ֵ��ư��İ� �̰�
		if (Integer.parseInt(yesOrNoSc) == 1) { 
			System.out.println("-------------------------------------------------------------");
			System.out.println();
			System.out.println("> [" + bookName + "]�� �����߽��ϴ�. (���� �ܿ� ���� : " + ")");
			try {
				System.out.println();
				System.out.println(" > 3�� �� ���� ȭ������ ���ư��ϴ�.\n\n\n\n\n\n");
				Thread.sleep(3000); // 3�� ���� �غθ���
				ShopMain.shopMain();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		} else {
			System.out.println(" > ���� ȭ������ ���ư��ϴ�.\n\n\n\n\n\n");
			ShopMain.shopMain();
//			break;
		}
		
//		scan.close(); // �ٵ� �̰� �ȴݾƵ� �ǳ�? ������ ��ĳ�� ������ ������
		
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
			case "1" : ShopMenuSwitch.menuSwitch("ȥ�� �����ϴ� �ڹ�", 10); break;
			
			case "2" : ShopMenuSwitch.menuSwitch("�ڹٽ�ũ��Ʈ + �������� �Թ�", 10); break;
				
				
			case "3" : ShopMenuSwitch.menuSwitch("���� �� ���̽�", 20); break;
				
				
			case "4" : ShopMenuSwitch.menuSwitch("������ �� ��ŸƮ", 20); break;
				
				
			case "5" : ShopMenuSwitch.menuSwitch("������", 99); break;
				
				
			case "0" :
				System.out.println(" > ���� ȭ������ ���ư��ϴ�.");
				try {
					System.out.println();
					Thread.sleep(3000); // 3�� ����
					ShopMain.shopMain(); // ����� ����ȭ������ ���� ���ñ� ȣ���ؼ� �ֱ�
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
				
				break;
				
				
			
			}
		}
		
		
	}
	    

}
