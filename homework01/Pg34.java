package day0316;

public class Pg34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x; 
		int y; 
		int z;
		
		int absX;
		int absY; 
		int absZ;
		
		char signX;
		char signY; 
		char signZ;
		
		x=10;
		y=-5;
		z=0;
		
		absX = x >= 0 ? x : -x;
		absY = y >= 0 ? y : -y;
		absZ = z >= 0 ? z : -z;
		
		signX = x > 0 ? '+' : (x==0 ? ' ': '-');
		signY = y > 0 ? '+' : (y==0 ? ' ': '-');
		signZ = z > 0 ? '+' : (z==0 ? ' ': '-');
		
		System.out.printf("x=%c%d\n", signX, absX);
		System.out.printf("y=%c%d\n", signY, absY);
		System.out.printf("z=%c%d\n", signZ, absZ);
	}

}
