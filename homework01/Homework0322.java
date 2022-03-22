package day0322;

import java.util.Scanner;

public class Homework0322 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1-10사이의 숫자를 입력하세요. 0을 입력하면 종료합니다.");
		int num = sc.nextInt();
		int i = 0;

			while(true)
			{
				
				if(num <=10 && num>0)
				{
					i++;
					System.out.println("1-10사이의 숫자를 입력하세요. 0을 입력하면 종료합니다.");
					num = sc.nextInt();
				}
				
				else if(num >10 || num<0)
				{
					System.out.println("잘못된 입력입니다.");
					System.out.println("1-10사이의 숫자를 입력하세요. 0을 입력하면 종료합니다.");
					num = sc.nextInt();
				}
					
				else if(num==0)
				{
					System.out.println(i+"번 입력하였습니다.");
					break;
				}
					
		}
		
	}

}
