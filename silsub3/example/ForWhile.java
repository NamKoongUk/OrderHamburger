package com.kh.silsub3.example;

import java.util.Scanner;

public class ForWhile {
	Scanner sc = new Scanner(System.in);
	public void printStar() {


		System.out.print("���� �ϳ� �Է� : ");
		int row = sc.nextInt();
		if(row < 0) {
			System.out.println("����� �ƴմϴ�.");
		}
		for(int r = 1; r<=row; r++) {
			for(int x=1; x <=r; x++) {
				if(r==x) {
					System.out.print(r);
				}else {
					System.out.print("*");
				}

			}
			System.out.println();
		}
	}

	public void printStar2() {
		System.out.print("���� �Է� : ");
		int row = sc.nextInt();

		if(row>0) {
			for(int r=1; r<=row; r++) {
				for(int x=0; x<r; x++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}else if(row < 0) {
			for(int r=0; r<=-row; r++) {
				for(int x=0; x< -row-r; x++) {
					System.out.print("*");
				}
				System.out.println();
			}

		}else {
			System.out.println("��� ����� �����ϴ�.");
		}
	}

	public void selectMenu() {
		int price = 0;
		int sum = 0;
		int sum2 = 0;
		String name = "";
		String totalmanu="";
		do {	

			System.out.println("*** �޴��� �����ϼ��� ***");
			System.out.println("�ܹ��� ***************");
			System.out.println("1. �Ұ����� 3500��");	
			System.out.println("2. ġŲ����  3200��");	
			System.out.println("�߰� ***************");
			System.out.println("3. ����Ƣ��  1000��");
			System.out.println("4. ġ�ƽ  400��");
			System.out.println("5. ������ 2000��");
			System.out.println("����� ***************");
			System.out.println("6. �ݶ� 700��");
			System.out.println("7. ���̵� 1200��");
			System.out.println("8. Ŀ�� 1000��");
			System.out.println("*******************");
			System.out.print("�޴� ���� : " );
			int num = sc.nextInt();
			System.out.print("������? : " );
			int num2 = sc.nextInt();
			
			
			
			System.out.print("�߰��ֹ��Ͻðڽ��ϱ�?(y/n) : ");
			char ch = sc.next().charAt(0);

			switch(num) {
			case 1 : price=3500; name="�Ұ�����"; sum+=price*num2; sum2+=num2; break;
			case 2 : price=3200; name="ġŲ����"; sum+=price*num2;sum2+=num2; break;
			case 3 : price=1000; name="����Ƣ��"; sum+=price*num2;sum2+=num2; break;
			case 4 : price=400; name="ġ�ƽ"; sum+=price*num2;sum2+=num2; break;
			case 5 : price=2000; name="������"; sum+=price*num2;sum2+=num2; break;
			case 6 : price=700; name="�ݶ�"; sum+=price*num2;sum2+=num2; break;
			case 7 : price=1200; name="���̵�"; sum+=price*num2; sum2+=num2;break;
			case 8 : price=1000; name="Ŀ��"; sum+=price*num2; sum2+=num2;break;


			}

			totalmanu = totalmanu + (name + " : " + num + "�� - " + price + "��" +"\n");
			
			if(ch=='y' || ch=='Y') {
				continue;
			}else if(ch=='n' || ch=='N'){

				break;
			}






		}while(true);
		System.out.println("�ֹ��Ͻ� ������ ������ �����ϴ�");
		System.out.println("----------------------");
		System.out.println(totalmanu);
		System.out.println("----------------------");
		System.out.println("�Ѱ��� : " + sum);
	}
	
	public void countInputCharacter() {
		System.out.print("���ڿ��� �Է��Ͻÿ� : ");
		String str = sc.nextLine();
	
		
		System.out.print("���� ���ڸ� �Է��Ͻÿ� : ");
		char ch = sc.next().charAt(0);
		
		char str2 =' ';
		int count = 0;
	for(int i=0; i<str.length(); i++) {
		
		str2 = str.charAt(i);
		
		if(str2==i) {
		System.out.println("�����ڰ� �ƴմϴ�");
	}else if(str2 == ch) {
			count++;
		} 
	}
	
System.out.println("���Ե� ���� : " + count);
	
	}
	
}
