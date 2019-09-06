import java.util.Scanner;

public class dn {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),i,j,k,l,m;
		int a[]=new int[n];
		int inc[]=new int[n];
		int c;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			c=0;
			for(j=i+1;j<n;j++)
			{
				if(a[j]>a[j-1])
				{
					c=c++;
				}
				else
				{
					break;
				}
			}
				inc[i]=c;
		}
		int max=0;
		int pos=0;
		for(i=0;i<n;i++)
		{
			if(max<inc[i])
			{
				max=inc[i];
				pos=i;
			}	
		}
		System.out.println(max);
		for(i=pos;i<=pos+max;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
