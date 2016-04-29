import java.util.Scanner;
public class Quizzer
	{
		public static void main(String[] args)
			{
				int counter = 0;
				int i = 0;
				System.out.println("Welcome to the modulus quiz, where you get to pick the number of questions you will be quizzed on");	
				Scanner userlnput = new Scanner(System.in);
				int questions1 = userlnput.nextInt();
				for(i = 2; i <questions1; i++)
					{
					int randomnumber1 = (int)(Math.random()*10)+1;
					int randomnumber2 =	(int)(Math.random()*5)+1;
					System.out.println(randomnumber1 +"%" + randomnumber2);
					Scanner userlnput2 =  new Scanner(System.in);
					int questions2 = userlnput.nextInt();
					int correct = 0;
					}
				equals();
				zeros();
				theRest();
			}	
	public static void equals()
	{
		int randomnumber1 = (int)(Math.random()*10)+1;
		int randomnumber2 =	(int)(Math.random()*5)+1;
		System.out.println(randomnumber1 +"%" + randomnumber2);
		Scanner userlnput3 =  new Scanner(System.in);
		int questions3 = userlnput.nextInt();
		if (questions3 == randomnumber1 % randomnumber1)
			{
				System.out.println("You are correct");
				counter++;
			}
		else
			{
			System.out.println("You are correct");
			}
	public static void zeros()		
	{
		int randomnumber1 = (int)(Math.random()*10)+1;
		int randomnumber2 =	(int)(Math.random()*5)+1;
		System.out.println(randomnumber2 +"%" + randomnumber1);
		Scanner userlnput4 =  new Scanner(System.in);
		int questions4 = userlnput.nextInt();
		if (questions4 == randomnumber1 % randomnumber1)
			{
				System.out.println("You are correct");
				counter++;
			}
		else
			{
				System.out.println("You are correct");
			}
		public static void theRest()		
		for(i = 2; i <questions1; i++)
					{
					int randomnumber1 = (int)(Math.random()*10)+1;
					int randomnumber2 =	(int)(Math.random()*5)+1;
					System.out.println(randomnumber1 +"%" + randomnumber2);
					Scanner userlnput2 =  new Scanner(System.in);
					int questions2 = userlnput.nextInt();
					int correct = 0;
					if (questions2 == randomnumber1 % randomnumber2)
						{
							System.out.println("You are correct");
							counter++;
						}
					else
						{
							System.out.println("You are correct");
						}
			}

	}
	}
