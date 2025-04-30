//name the class
//create a method
//import a scanner
//name the scanner
//collect input from user

import java.util.Scanner;
public class Financial{
public static void main (String [] args){

Scanner input = new Scanner(System.in);

System.out.print(" Enter the exchange rate from dollar to RMB: ");
double exchange = input.nextDouble();
if (exchange < 0){
System.out.print(" invalid number");
} else if (exchange == 0 ){
System.out.print(" invalid number");
} 
System.out.print(" Enter 0 to convert to us dollar and 1 viceversa: ");
double convert = input.nextDouble();


if (convert == 0){
System.out.print("Enter dollar amount: ");
double dollarAmount = input.nextDouble();
double convertRate = exchange * dollarAmount;
System.out.printf("$ %.2f is %.2f yuan", dollarAmount , convertRate );
} else if (convert == 1){
System.out.print("Enter rmb amount: ");
double rmbAmount = input.nextDouble();
double dollarConvert = exchange * rmbAmount;
System.out.printf("yuan %.2f is $ %.2f", rmbAmount , dollarConvert);
} else if (convert < 0){
System.out.print("invalid number");
} 








}
}