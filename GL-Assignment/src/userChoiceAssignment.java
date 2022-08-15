import java.util.Scanner;

public class userChoiceAssignment {

	void palindromeCheck(int palinumber)
	{
		
		int revNum=0,modRem=0;
		int orgNum=palinumber;
		while(palinumber>0)
		{
			modRem=palinumber%10;
			revNum=revNum*10+modRem;
			palinumber=palinumber/10;
			
		}
		
		if(orgNum==revNum)
			
			System.out.println("The Given number " + orgNum + " is a palindrome number...>");
		
		else
			
			System.out.println("The Given number  " + orgNum + " is not a palindrome number..>");
		
		
		
	}
	
	void fibonacci(int l)
	{
		System.out.println("The fibonaaci series .....>");
		int sum=0;
		int no1=0;
		int no2=1;
		
		System.out.print(no1 + " " +no2 );
		for(int i=0;i<(l-2);i++)
		{
		
		
		
		sum=no1 + no2;
		System.out.print(" " +sum);
		no1=no2;
		no2=sum;
		

		}
		
		
	}
	
	void primeCheck(int primeNum)
	{
		
		
		
		if(primeNum==2)
		{
			System.out.println("The given number " + primeNum + " is a prime number..");
		}
		else if(primeNum%2!=0)
		{
			System.out.println("The given number " + primeNum + " is a prime number..");
		}
		else
		{
			System.out.println("The given number " + primeNum + " is not a prime number..");
		}
	}

	
	void starPattern (int starLimit)
	{
		
	
		for(int i=starLimit;i>0;i--)
		{
			//rows star
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
				
			}
			System.out.println("");
		}
	}
	public static void main (String []args)
	{
		
		userChoiceAssignment obj=new userChoiceAssignment();
		
		boolean exitCndn=true;
		
		do
		{
			
			Scanner in=new Scanner(System.in);
			System.out.println(" \n Enter the choice \n 0.  For Exit....>  \n 1. PALINDROME...> \n 2. FIBONACCI SERIES..> \n 3. PRIME NUMBER...\n 4. STAR PATTERN....>");
			int choice=in.nextInt();
			
			
		switch(choice)
		{
		
		case 0 :
		{
			exitCndn=false;
			System.out.println("you are going to exit now..>");
			break;
		}
		
		case 1: 
		{
			System.out.println("Enter the number to check whether it is palindrome or not..>");
			int palinumber=in.nextInt();
			
			obj.palindromeCheck(palinumber);
			break;
		}
		
		case 2 :
		{
			System.out.println("Enter the limit for Fibonaaci series...>");
			int limit=in.nextInt();
			obj.fibonacci(limit);
			break;
		}
		
		case 3:
		{
			System.out.println("Enter the number to check whether it is prime number or not..>");
			int primeNum=in.nextInt();
			obj.primeCheck(primeNum);
			break;
		}
		
		case 4:
		{
			System.out.println("Enter the rows(no of stars) limit number....>");
			int starLimit=in.nextInt();
			obj.starPattern(starLimit);
			break;
		}
		default:
			System.out.println("This is not a valid Choice..");
		}
		}while(exitCndn);
	}

}

