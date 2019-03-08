import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int year;
    	Scanner scan = new Scanner(System.in);
    	System.out.println("enter the year:");
    	year = scan.nextInt();
    	scan.close();
        boolean isLeap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }
            else
                isLeap = true;
        }
        else 
        {
            isLeap = false;
        }

        if(isLeap==true)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
