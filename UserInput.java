import java.io.*;
import java.util.*;

class UserInput{
	
	// Method to get the user's choice
	public static int choice(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your choice (1-10):");
		int choose = scan.nextInt();
		return choose;
	}
	
	// Method to get 2 numbers form user
	public static double[] inputNumbers(){
		Scanner scan = new Scanner(System.in);
		
		// Input for one number
		System.out.println("Enter First Number:");
		double firstNumber = scan.nextDouble();
		
		// Input for another number
		System.out.println("Enter Second Number:");
		double secondNumber = scan.nextDouble();
		
		double[] numbers = new double[2];
		numbers[0] = firstNumber;
		numbers[1] = secondNumber;
		
		return numbers;
	}
	
	// Method to get an array input from user
	public static double[] inputArray(){
		Scanner scan = new Scanner(System.in);

        // Entering the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();

        // Create an array of the specified size
        double[] numbersArray = new double[size];

        // Prompt the user to enter each element of the array
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbersArray[i] = scan.nextDouble();
        }

		return numbersArray;	
	}
}