package codechef;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class prime_xor
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			long a,b,c;
			int x=sc.nextInt();
			int y=sc.nextInt();
	        int z=x^y;
			if(x%2==0 && y%2!=0)
			{
				c=2;
				a=z^c;
				b=y^c;
			}
			else if(x%2!=0 && y%2!=0)
			{
				b=2;
				a=x^b;
				c=y^b;
			}
			else
			{
				a=2;
				b=x^a;
				c=z^a;
			}
			long[] ar= {a,b,c};
			Arrays.sort(ar);
			for(int i=0;i<3;i++)
			{
				System.out.print(ar[i]+" ");
			}
			System.out.print("\n");
			t--;
		}
	}
}
