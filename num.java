import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 int count = 0, num;
Scanner s=new Scanner(System.in);
num=s.nextInt();
        while(num!=0)
        {
        num/=10;
        ++count;
        }          
       System.out.println( + count);
    
}
}
