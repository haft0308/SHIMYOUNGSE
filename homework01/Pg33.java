package day0316;

import java.util.Scanner;

public class Pg33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요. : ");
		int score = sc.nextInt();
		
		if(score >=90 && score <= 100)
		{
			System.out.println('A');
		}
		else if (score >=80)
		{
			System.out.println('B');
		}
		else if (score >=70)
		{
			System.out.println('C');
		}
		else if (score >=60)
		{
			System.out.println('D');
		}
		else if (score >=0)
		{
			System.out.println('F');
		}
		else
		{
			System.out.println("잘못된 정보 입력.");
		}

	}

}
