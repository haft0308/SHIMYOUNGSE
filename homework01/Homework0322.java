package day0322;

import java.util.Scanner;

public class Homework0322 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1-10������ ���ڸ� �Է��ϼ���. 0�� �Է��ϸ� �����մϴ�.");
		int num = sc.nextInt();
		int i = 0;

			while(true)
			{
				
				if(num <=10 && num>0)
				{
					i++;
					System.out.println("1-10������ ���ڸ� �Է��ϼ���. 0�� �Է��ϸ� �����մϴ�.");
					num = sc.nextInt();
				}
				
				else if(num >10 || num<0)
				{
					System.out.println("�߸��� �Է��Դϴ�.");
					System.out.println("1-10������ ���ڸ� �Է��ϼ���. 0�� �Է��ϸ� �����մϴ�.");
					num = sc.nextInt();
				}
					
				else if(num==0)
				{
					System.out.println(i+"�� �Է��Ͽ����ϴ�.");
					break;
				}
					
		}
		
	}

}
