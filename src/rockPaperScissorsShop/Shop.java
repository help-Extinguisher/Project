package rockPaperScissorsShop;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Shop {
	// ��ĳ�� sc�� ��������
	static String bookName = "å�̸�";
	static int bookCoin = 0;
	static Scanner sc = new Scanner(System.in); // �������� �����ϸ� �� ���� �ִ�
	static int result; // �������� ����
	
	// ���� �޼ҵ�
	public static void main(String[] args) {
		
		selectMenu();
	}

	public static void selectMenu() { // �޼ҵ�� �����־��� (ȣ���ϸ� �ݺ��ϰ�)
		// 1. ������ ���� �޴� ����
		while(true) {
			try {
				shopMain();
				result = Integer.parseInt(sc.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println(" > ���� : �Է� ����. ���ڸ� �Է��ϼ���. \n\n\n\n");
				continue;
			} catch (InputMismatchException e) {
				System.out.println(" > ���� : asdfasdf�Է� ����. ���ڸ� �Է��ϼ���. \n\n\n\n");
				continue;
			}
		}
		
		switch (result) {
		case 1 : menuSwitch("ȥ�� �����ϴ� �ڹ�", 10); break;
		case 2 : menuSwitch("�ڹٽ�ũ��Ʈ + �������� �Թ�", 10); break;
		case 3 : menuSwitch("���� �� ���̽�", 20); break;		
		case 4 : menuSwitch("������ �� ��ŸƮ", 20); break;
		case 5 : menuSwitch("������", 99); break;
		case 0 :
			System.out.println(" > ���� ȭ������ ���ư��ϴ�.");
			selectMenu();
			break;	
		}
	}
	    

	public static void shopMain() {
		
		// JAVA SHOP���� ���� ������ �޴�
		System.out.println(" �ˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢ� ");
		System.out.println();
		System.out.println(" 	[ ���������� ������ ��� ������ å �������� ������ ������~ ] ");
		System.out.println();
		System.out.println(" �ˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢ�");
		System.out.println();
		System.out.println(" �ˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢ� ");
		System.out.println();
		System.out.println(" 1. ȥ�� �����ϴ� �ڹ� (10����)	2. �ڹٽ�ũ��Ʈ + �������� �Թ� (10����) ");
		System.out.println(" 3. ���� �� ���̽� (20����)		4. ������ �� ��ŸƮ (20����) ");
		System.out.println(" 5. ������ (99����) ");
		System.out.println();
		System.out.println(" 			0. ����ȭ������		 ");
		System.out.println();
		System.out.println(" �ˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢˢ�");
		System.out.print(" > ");
	}
	
	
	
	
	
	static void menuSwitch(String bookName, int bookCoin) {
		
	System.out.println(" > [" + bookName + "]��(��) [" + bookCoin + "����]�Դϴ�. �����ұ��? (���� �ܿ� ���� : " +  ")"); // coin �����ϱ�
	System.out.println("		�� 1. YES		�� 2. NO		");
	System.out.print(" > ");
	
		while (true) {
			try {
				if (Integer.parseInt(sc.nextLine()) == 1) { 
					// ���⼭ ���� �����ϴ� �ڵ�ֱ� (��¼�� = �������� - ���ΰ�)
					System.out.println("-------------------------------------------------------------");
					System.out.println();
					System.out.println("> [" + bookName + "]�� �����߽��ϴ�. (���� �ܿ� ���� : " + ")");
					try {
						System.out.println();
						System.out.println(" > 3�� �� ���� ȭ������ ���ư��ϴ�.\n\n\n\n\n\n");
						Thread.sleep(3000); // 3�� ���� �غθ���
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				
				selectMenu();
				
				
	//			break;
				
			} catch (NumberFormatException e) {
				System.out.println(" > ���� : ���ڿ��� �Էµ� �� �����ϴ�. ���ڸ� �Է��ϼ���. \n\n\n\n");
				continue;
			}
		}
	}
}
