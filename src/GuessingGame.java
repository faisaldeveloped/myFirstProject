import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner (System.in);

		System.out.print("الأول الرقم خمن: ");
		int num = reader.nextInt();
		
		System.out.print("الثاني الرقم خمن: ");
		int num1 = reader.nextInt();
		
		System.out.print("الثالث الرقم خمن: ");
		int num2 = reader.nextInt();
		
		System.out.println("⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇ النتيجة ⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇");
		getGuess(num,num1,num2);
		getScore(num, num1, num2);
	}
	
	public static void getGuess(int num, int num2, int num3)
	{
		System.out.println();
		
		int[] numbers = new int[3];
		int i =0;
		
		for( i = 0; i< numbers.length;)
		{
			if(num == 20 && num2 == 50 && num3 == 100)
			{
				System.out.println("🌟🌟🌟 فائز !! 🌟🌟🌟");
				break;
			}
			
			else if(num == 20 && num2 != 50 && num3 == 100 || num != 20 && num2 == 50 && num3 == 100 || num == 20 && num2 == 50 && num3 != 100)
			{
				
				System.out.println("🌟🌟🌟 فائز !! 🌟🌟🌟");
				break;
			}
			
			else if(num == 20 && num2 != 50 && num3 != 100 || num != 20 && num2 == 50 && num3 != 100 || num != 20 && num2 != 50 && num3 == 100)
			{
				System.out.println("🌟🌟🌟 مقبول !! 🌟🌟🌟");
				break;
			}
			else 
			{
				System.out.println("خسرت 😢");
				break;
			}
		}
		System.out.println();
	}
	public static void getScore(int num, int num2, int num3)
	{
		int [] numbers = new int[3];
		
		for(int i =0; i< numbers.length;)
		{
	
		 if( num == 20 && num2 == 50 && num3 == 100)
		{
			System.out.println("5/5 :نقاطك  ");
			break;
		}
		 else if(num == 20 && num2 == 50 && num3 != 100 || num == 20 && num2 != 50 && num3 == 100 || num != 20 && num2 == 50 && num3 == 100)
		 {
		   System.out.println("3/5 :نقاطك ");
			 break;
		 }

		 else if(num != 20 && num2 != 50 && num3 == 100 || num == 20 && num2 != 50 && num3 != 100 || num != 20 && num2 == 50 && num3 != 100)
		 {
			 System.out.println("1/5 :نقاطك ");
			 break;
		 }
		else
		{
		    System.out.println("0/5 نقاطك: ");
		    break;
		}
		}
	}

}
