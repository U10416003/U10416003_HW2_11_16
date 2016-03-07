//U10416003 ±i³Í³Ç

import java.util.ArrayList;
import java.util.Scanner;

public class RepeatAdditionQuiz{
	public static void main (String[] args){
		int number1 = (int)(Math.random()*10);
		int number2 = (int)(Math.random()*10);
		//Create ArrayList
		ArrayList inputs = new ArrayList();
		
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is"+number1+"*"+number2+"?");
		int answer = input.nextInt();
		
		while ( number1 * number2 != answer){
			if(inputs.contains(answer)){
				System.out.print("The number is not answer number"+answer+"!");
			}
			System.out.print("Wrong answer . Try again . Waht is "+number1+"*"+number2+"?");
			inputs.add(answer);
			answer = input.nextInt();
		}

		System.out.println("You got it!");
	}
}