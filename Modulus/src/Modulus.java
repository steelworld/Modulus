import java.util.Scanner;
public class Modulus
	{
	public static void main(String[] args)
	{
	//askTheUser();
	//yearOfTheLeap();
	//arrayList();
	fizzBuzz();
	}
	public static void askTheUser()
	{
		System.out.println("Please put in a postitive number");
		Scanner userlnput = new Scanner(System.in);
		int x = userlnput.nextInt();
		if(x % 2 == 0)
			{
				System.out.println("The number is even");
			}
		else
		{
			System.out.println("The number is odd");
		}
	}
	public static void yearOfTheLeap()
	{
		System.out.println("Put in a year");
		Scanner userlnput = new Scanner(System.in);
		int x = userlnput.nextInt();
		if(x % 4 == 0)
			{
				System.out.println("It is a leap year");
			}
		else
			{
			System.out.println("It is not a leap year");
			}
	}
	public static void arrayList()
	{
		int [] myArray1 = {2,5,-7,1,3,12,19,-16,4,20};
		int i = 0;
		for (i=0; i<10; i++)
			{
			if(i % 3 == 0)
			{
				System.out.println(myArray1[i]);
			}
			}
	}
	public static void fizzBuzz()
	{
		int i = 1;
		for(i =1; i < 100; i ++)
			{
				if (i % 5 == 0 && i % 3 == 0)
					{
						System.out.println("FizzBuzz");
					}
				else if(i % 3 == 0)
					{
						System.out.println("Fizz");
					}
				else if (i % 5 == 0)
				{
					System.out.println("Buzz");
				}
			
				else
					{
						System.out.println(i);
					}
			}
	}
	}
