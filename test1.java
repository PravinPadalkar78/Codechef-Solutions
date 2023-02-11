package codechef;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class test1{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			
			int n=sc.nextInt();
			int m=sc.nextInt();
			int k=sc.nextInt();
			HashMap<Integer, Integer> fre= new HashMap<Integer,Integer>();
			fre.put(k,0);
			for(int i=0;i<n;i++)
			{
				
				if(fre.containsKey(i))
				{
					int a=fre.get(i);
					fre.put(i, a+1);
				}
				else
				{
					fre.put(i, 1);
				}
			}
			int mex=0;
		for(int j=0;j<k;j++)
		{
			if(fre.get(j)!=null)
			{
				mex++;
			}
			else
			{
				break;
			}
		}
		int available = n-fre.get(k);
		if(k<=m && mex==k && available>=m)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		
			
		
			t--;
		}
	}
}
