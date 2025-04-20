package day3;

import java.util.Scanner;

public class BMIcalculator {

	public static void main(String[] args) 
	
	{
		
	Scanner scanner= new Scanner(System.in);
	
	System.out.println("Enter your weight in Pounds");
	
	double weightInPounds = scanner.nextDouble();
	
	System.out.println("Enter your height in meters: ");
	
	double height = scanner.nextDouble();
	
	//kg = lbs * 0.453592
	
	double weightInKg =  weightInPounds*0.453592;
	
	//BMI = Weight (kg) / height (m)^2
	
	double bmi= weightInKg/ (height*height);
	
	System.out.println("Your BMI is: "+bmi);
	
	if (bmi<18.5)
	{
		System.out.println(" You are underweight");
	}
	else if (bmi>=18.5 && bmi < 24.9)
	{
		System.out.println("You are Healthy weight");
	}
	
	else if (bmi>=25.0 && bmi < 29.9)
	{
		System.out.println("You are overweight weight");
	}
	else 
	{
		System.out.println("You are obese");
	}
	scanner.close();
	
	
	
		
		
		
		

	}

}
