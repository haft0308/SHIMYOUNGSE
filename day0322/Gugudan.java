package day0322;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 몇단을 외우고 싶나요?");
		int gugudan = sc.nextInt();
		int multip = 0;
		int ans = 0;
		
		for(multip=1; multip <=9; multip++)
		{
			ans=gugudan*multip;
			System.out.println(gugudan+"*"+multip+"="+ans);
		}
		

	}

}
