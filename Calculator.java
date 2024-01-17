import java.io.*;
import java.util.*;
import java.lang.*;

class Calculator{
	
	//Method for Addition
	public static void addition(){
		UserInput input = new UserInput();
		double[] numbers = new double[2];
		numbers = input.inputNumbers();
		System.out.println("The Addition of " + numbers[0] + " and " + numbers[1] + " = " + (numbers[0] + numbers[1]));
	}
	
	//Method for Subtraction
	public static void subtraction(){
		UserInput input = new UserInput();
		double[] numbers = new double[2];
		numbers = input.inputNumbers();
		System.out.println("The Subtraction of " + numbers[0] + " and " + numbers[1] + " = " + (numbers[0] - numbers[1]));
	}
	
	//Method for Multiplication
	public static void multiplication(){
		UserInput input = new UserInput();
		double[] numbers = new double[2];
		numbers = input.inputNumbers();
		System.out.println("The Multiplication of " + numbers[0] + " and " + numbers[1] + " = " + (numbers[0] * numbers[1]));
	}
	
	//Method for Division
	public static void division(){
		UserInput input = new UserInput();
		double[] numbers = new double[2];
		numbers = input.inputNumbers();
		
		if (numbers[1] == 0){
			System.out.println("Cannot divide by zero!");
		} else {
			System.out.println("The Division of " + numbers[0] + " and " + numbers[1] + " = " + (numbers[0] / numbers[1]));
		}
	}
	
	//Method for Sum of Array
	public static void sumOfArray(){
		UserInput input = new UserInput();
		double[] array = input.inputArray();
		int n = array.length;
		double sum = 0;
		for (int i = 0; i < n; i++){
			sum = sum + array[i];
		}
		System.out.println("The sum of the Array is: " + sum);
	}
	
	//Method for mean of Array
	public static void meanOfArray(){
		UserInput input = new UserInput();
		double[] array = input.inputArray();
		int n = array.length;
		double sum = 0;
		for (int i = 0; i < n; i++){
			sum = sum + array[i];
		}
		double mean = sum / n;
		System.out.println("The Mean of the Array is: " + mean);
	}
	
	//Method for mode of Array
	public static void modeOfArray(){
		UserInput input = new UserInput();
		double[] array = input.inputArray();
		int n = array.length;
		double maxValue = 0;
		int maxCount = 0, i, j;
		for (i = 0; i < n; i++){
			int count = 0;
			for (j = 0; j < n; j++){
				if (array[j] == array[i])
				count++;
			}

			if (count > maxCount) {
				maxCount = count;
				maxValue = array[i];
			}
		}
		System.out.println("The Mode of the Array is: " + maxValue);
	}
	
	//Method for median of Array
	public static void medianOfArray(){
		UserInput input = new UserInput();
		double[] array = input.inputArray();
		int n = array.length;
		double median = 0;
		// Sorting the array
		Arrays.sort(array);
		
		if (n % 2 != 0){
			median = (double)array[n / 2];
		} else {
			median = (double)(array[(n - 1) / 2] + array[n / 2]) / 2.0;
		}
		System.out.println("The Median of the Array is: " + median);
	}
	
	//Method for Variance of Array
	public static void varianceOfArray(){
		UserInput input = new UserInput();
		double[] array = input.inputArray();
		int n = array.length;
		double mean = 0;
		
		//Mean calculation
		for (int i = 0; i < n; i++){
			mean = mean + array[i];
		}
		mean = mean / n;
		
		double deviation = 0;
		double tempo;
		
		//Deviation calculation
		for (int i = 0; i < n; i++){
			tempo = array[i] - mean;
			deviation = deviation + (tempo * tempo);
		}
		
		//Variance calculation
		double variance = deviation / n;
	
		System.out.println("The Variance of the Array is: " + variance);
	}
	
	//Method for Standard Deviation
	public static void stdOfArray(){
		UserInput input = new UserInput();
		double[] array = input.inputArray();
		int n = array.length;
		double mean = 0;
		
		//Mean calculation
		for (int i = 0; i < n; i++){
			mean = mean + array[i];
		}
		mean = mean / n;
		
		double deviation = 0;
		double tempo;
		
		//Deviation calculation
		for (int i = 0; i < n; i++){
			tempo = array[i] - mean;
			deviation = deviation + (tempo * tempo);
		}
		
		//Variance calculation
		double variance = deviation / n;
		
		//Standard deviation calculation
		double std = Math.sqrt(variance);
	
		System.out.println("The Standard Deviation of the Array is: " + std);
	}
}