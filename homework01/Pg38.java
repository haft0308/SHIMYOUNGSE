package day0316;
import java.util.Scanner;
public class Pg38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¼·¾¾¿Âµµ´Â?");
		
		float deg = sc.nextFloat();
		float fire = 0f;
		fire = deg * (float)1.8f + 32;
		
		System.out.printf("È­¾¾¿Âµµ´Â %4.1fÀÔ´Ï´Ù.\n",fire);
	}

}
