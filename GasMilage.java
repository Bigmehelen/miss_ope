//prompt the user to enter miles driven
//promt the user to enter the amount of gallons used
//initialize milecounter to one
//initialize galloncounter to one
//display the amount of gallons used divived by miles driven

import java.util.Scanner;
public class GasMilage{
public static void main (String [] args ){

Scanner input = new Scanner (System.in);

double mileCounter = 1;
double gallonCounter = 1;
double total = 0;

System.out.print("Enter the miles driven or -1 to quit: ");
double milesDriven = input.nextDouble();

System.out.print("Enter the amount of gallons used: ");
double gallonUsed = input.nextDouble();

while(milesDriven != -1){
System.out.print("Enter the miles driven or -1 to quit: ");
milesDriven = input.nextDouble();
mileCounter = mileCounter * milesDriven;
gallonCounter = gallonCounter * gallonUsed;
break;
}
total = mileCounter / gallonCounter;
System.out.printf("Mile per gallon for all trips %.2f", total);
}
}