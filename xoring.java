package codechef;

import java.util.Scanner;

public class xoring {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
			int a,b,n,t;
			t=sc.nextInt();
			for(int i=0;i<t;i++)
			{
				a=sc.nextInt();
				b=sc.nextInt();
				n=sc.nextInt();
				int z=1;
				while(z<n)
				{
				    z=z*2;
				}
				if((a^b)==0)
				{
					System.out.println("0");
				}
				else if((a^b)<n)
				{
					System.out.println("1");
				}
				else if((a^b)<z)
				{
				    System.out.println("2");
				}
				else
				{
				    System.out.println("-1");
				}
			}
		
	}

}
