// Name: Richa Gupta
// PRN: 22070126087
// Batch: AIML B1

import java.io.*;
import java.util.*;

class Main{
	public static void main(String  args[]){
		System.out.println("Welcome to Calculator!");
		
		UserInput input = new UserInput();
		Calculator calc = new Calculator();
		int conti;
		do{
			Scanner scanner = new Scanner(System.in);
			
			//Displaying the menu
			menuDisplay();
			
			int choice = input.choice();
			
			//Computing according to user input
			switch(choice){
				case 1:
					calc.addition();
					break;
				case 2:
					calc.subtraction();
					break;
				case 3:
					calc.multiplication();
					break;
				case 4:
					calc.division();
					break;
				case 5:
					calc.sumOfArray();
					break;
				case 6:
					calc.meanOfArray();
					break;
				case 7:
					calc.modeOfArray();
					break;
				case 8:
					calc.medianOfArray();
					break;
				case 9:
					calc.varianceOfArray();
					break;
				case 10:
					calc.stdOfArray();
					break;
				default:
					System.out.println("Invalid choice!. Please give input from 1 to 10");
			}
			System.out.println("Do you want to continue? (1-Yes or 0-No):");
			conti = scanner.nextInt();
		}while (conti == 1);
	}
		// Displaying the menu
	public static void menuDisplay(){
		System.out.println("Menu for Calculator:");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Sum of Array");
		System.out.println("6. Mean of Array");
		System.out.println("7. Mode of Array");
		System.out.println("8. Median of Array");
		System.out.println("9. Variance of Array");
		System.out.println("10. Standard Deviation of Array");
	}
}