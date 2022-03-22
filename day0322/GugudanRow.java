package day0322;

public class GugudanRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = 0;
		int multip = 0;
		int multip2 = 0;
		for(multip=2; multip <=9; multip++)
		{
			for(multip2=1; multip2 <=9; multip2++)
			{
				ans=multip*multip2;
				System.out.print(multip+"*"+multip2+"="+ans+"\t");
			}
			System.out.println();
		}

	}

}
