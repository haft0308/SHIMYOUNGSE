package day0316;
import java.util.Scanner;
public class Pg40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ������?");
		int kor = sc.nextInt();
		
		System.out.println("���� ������?");
		int eng = sc.nextInt();
		
		System.out.println("���� ������?");
		int math = sc.nextInt();
		
		System.out.println("���� ������?");
		int sci = sc.nextInt();
		
		System.out.println("���� ������?");
		int music = sc.nextInt();
		
		int sum = kor+eng+math+sci+music;
		float avg = sum/5;
		System.out.println("�հ�� "+sum+" �Դϴ�.");
		System.out.println("����� "+avg+" �Դϴ�.");

	}

}
