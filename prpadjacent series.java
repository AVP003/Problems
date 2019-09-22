import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class two 
{
	public static void main(String[] args) 
	{
		int n=5;
		int s=10;
		int i=1;
		int j;
		int sum=s;
		for(j=2;j<=n;j++)
		{
			sum+=(s*(j-1))+((s+i)*j);
			s=s+i;
		}
		System.out.println(sum);
	}
}
