# BMI-Calculator2.0

BMI Calculator
A simple Java console application that calculates and categorizes the Body Mass Index (BMI) based on user input.

📋 Description
This program prompts the user to enter their weight in pounds and height in meters, converts the weight to kilograms, and calculates the BMI using the formula:

ini
Copy
Edit
BMI = weight (kg) / (height (m) × height (m))
After calculating, it categorizes the BMI based on standard BMI ranges:

Underweight: BMI < 18.5

Healthy weight: 18.5 ≤ BMI < 24.9

Overweight: 25.0 ≤ BMI < 29.9

Obese: BMI ≥ 30.0

📦 Package
java
Copy
Edit
package day3;
🧮 How It Works
Takes user input for weight in pounds and height in meters.

Converts the weight to kilograms using the conversion: 1 lb = 0.453592 kg.

Calculates BMI.

Outputs the BMI value and corresponding health category.

💻 How to Run
Make sure you have Java installed.

Save the program as BMIcalculator.java inside a folder named day3.

Compile and run it using the terminal:

bash
Copy
Edit
javac day3/BMIcalculator.java
java day3.BMIcalculator
Follow the prompts to enter your weight and height.

✅ Example
bash
Copy
Edit
Enter your weight in Pounds
160
Enter your height in meters:
1.75
Your BMI is: 23.55
You are Healthy weight
