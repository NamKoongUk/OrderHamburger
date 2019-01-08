package com.kh.silsub3.example;

import java.util.Scanner;

public class ForWhile {
	Scanner sc = new Scanner(System.in);
	public void printStar() {


		System.out.print("정수 하나 입력 : ");
		int row = sc.nextInt();
		if(row < 0) {
			System.out.println("양수가 아닙니다.");
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
		System.out.print("정수 입력 : ");
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
			System.out.println("출력 기능이 없습니다.");
		}
	}

	public void selectMenu() {
		int price = 0;
		int sum = 0;
		int sum2 = 0;
		String name = "";
		String totalmanu="";
		do {	

			System.out.println("*** 메뉴를 선택하세요 ***");
			System.out.println("햄버거 ***************");
			System.out.println("1. 불고기버거 3500원");	
			System.out.println("2. 치킨버거  3200원");	
			System.out.println("추가 ***************");
			System.out.println("3. 감자튀김  1000원");
			System.out.println("4. 치즈스틱  400원");
			System.out.println("5. 샐러드 2000원");
			System.out.println("음료수 ***************");
			System.out.println("6. 콜라 700원");
			System.out.println("7. 에이드 1200원");
			System.out.println("8. 커피 1000원");
			System.out.println("*******************");
			System.out.print("메뉴 선택 : " );
			int num = sc.nextInt();
			System.out.print("수량은? : " );
			int num2 = sc.nextInt();
			
			
			
			System.out.print("추가주문하시겠습니까?(y/n) : ");
			char ch = sc.next().charAt(0);

			switch(num) {
			case 1 : price=3500; name="불고기버거"; sum+=price*num2; sum2+=num2; break;
			case 2 : price=3200; name="치킨버거"; sum+=price*num2;sum2+=num2; break;
			case 3 : price=1000; name="감자튀김"; sum+=price*num2;sum2+=num2; break;
			case 4 : price=400; name="치즈스틱"; sum+=price*num2;sum2+=num2; break;
			case 5 : price=2000; name="샐러드"; sum+=price*num2;sum2+=num2; break;
			case 6 : price=700; name="콜라"; sum+=price*num2;sum2+=num2; break;
			case 7 : price=1200; name="에이드"; sum+=price*num2; sum2+=num2;break;
			case 8 : price=1000; name="커피"; sum+=price*num2; sum2+=num2;break;


			}

			totalmanu = totalmanu + (name + " : " + num + "개 - " + price + "원" +"\n");
			
			if(ch=='y' || ch=='Y') {
				continue;
			}else if(ch=='n' || ch=='N'){

				break;
			}






		}while(true);
		System.out.println("주문하신 정보는 다음과 같습니다");
		System.out.println("----------------------");
		System.out.println(totalmanu);
		System.out.println("----------------------");
		System.out.println("총가격 : " + sum);
	}
	
	public void countInputCharacter() {
		System.out.print("문자열을 입력하시오 : ");
		String str = sc.nextLine();
	
		
		System.out.print("비교할 문자를 입력하시오 : ");
		char ch = sc.next().charAt(0);
		
		char str2 =' ';
		int count = 0;
	for(int i=0; i<str.length(); i++) {
		
		str2 = str.charAt(i);
		
		if(str2==i) {
		System.out.println("영문자가 아닙니다");
	}else if(str2 == ch) {
			count++;
		} 
	}
	
System.out.println("포함된 갯수 : " + count);
	
	}
	
}
