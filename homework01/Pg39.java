package day0316;
import java.util.Scanner;
public class Pg39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("삼각형의 밑변을 입력하시오.");
		int b = sc.nextInt();
		System.out.println("삼각형의 높이를 입력하시오.");
		int h = sc.nextInt();
		System.out.printf("삼각형의 넓이는 %3.1f", (float)b*h/2);

	}

}
