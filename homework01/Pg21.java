package day0316;
import java.util.Scanner;
public class Pg21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ҹ��� ���ĺ��� �Է��ϼ���.");
		char sma = sc.next().charAt(0);
		
		if(sma<=122 && sma>=65)
		{
			char cap = (char)((int)sma-32);
			System.out.println(sma+"�� �빮�ڴ� "+cap+" �Դϴ�.");
		}
		
		else
		{
			System.out.println("�߸��� �Է��Դϴ�.");
		}
			
	}

}
