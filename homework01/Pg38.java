package day0316;
import java.util.Scanner;
public class Pg38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����µ���?");
		
		float deg = sc.nextFloat();
		float fire = 0f;
		fire = deg * (float)1.8f + 32;
		
		System.out.printf("ȭ���µ��� %4.1f�Դϴ�.\n",fire);
	}

}
