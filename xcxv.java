import java.util.*;
import java.lang.*;
import java.io.*;


class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 int num, count, total = 0;

        
        Scanner scan = new Scanner(System.in);
        
        num = scan.nextInt();
        
        scan.close();
        for(count = 1; count <= num; count++){
            total = total + count;
        }

        System.out.println(+total);
    }
}
