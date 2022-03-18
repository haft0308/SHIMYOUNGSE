package day0316;
import java.util.Scanner;
public class Pg40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수는?");
		int kor = sc.nextInt();
		
		System.out.println("영어 점수는?");
		int eng = sc.nextInt();
		
		System.out.println("수학 점수는?");
		int math = sc.nextInt();
		
		System.out.println("과학 점수는?");
		int sci = sc.nextInt();
		
		System.out.println("음악 점수는?");
		int music = sc.nextInt();
		
		int sum = kor+eng+math+sci+music;
		float avg = sum/5;
		System.out.println("합계는 "+sum+" 입니다.");
		System.out.println("평균은 "+avg+" 입니다.");

	}

}
