import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int number;
	Scanner num=new Scanner(System.in);
	System.out.println("enter a number to find its factors");
	number=num.nextInt();
	for(int i=1;i<=number;i++)
	if(number%i==0)
	{
		System.out.format("\n %d",i);
	}
	
	}
}
