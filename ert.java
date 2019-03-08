import java.util.*;
import java.lang.*;
import java.io.*;


class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
			int n,sum=0,k;
			Scanner s=new Scanner(System.in);
			n=s.nextInt();
			k=s.nextInt();
	        int array[]=new int[n];
            for(int i=0;i<n;i++)
            {
            	array[i]=s.nextInt();
            }
              for(int i=0;i<k;i++)
	         {
             sum=sum+array[i];
        	}
	       System.out.println(sum);
	}
}
