package day0316;
import java.util.Scanner;
public class Pg21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("소문자 알파벳을 입력하세요.");
		char sma = sc.next().charAt(0);
		
		if(sma<=122 && sma>=65)
		{
			char cap = (char)((int)sma-32);
			System.out.println(sma+"의 대문자는 "+cap+" 입니다.");
		}
		
		else
		{
			System.out.println("잘못된 입력입니다.");
		}
			
	}

}
