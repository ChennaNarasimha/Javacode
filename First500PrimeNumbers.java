import java.util.Scanner;


public class First500PrimeNumbers {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("The prime Numbers that You want : ");
		int num=sc.nextInt();
		int f=1,count=1;
		int i;
			while(f<=10000)
			{
				boolean flag=false;
				if(count<=num)
				{
					
				for( i=2;i<=f/2;i++)
				{
					if(f%i==0)
					{
						flag=true;
						break;
					}
				}
				
				if(flag==false)
				{
					System.out.println(f+",");
					count++;
				}
				f++;
			}
		}
	}
}
