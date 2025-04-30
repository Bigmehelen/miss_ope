import java.util.Scanner;
public class Costofshipping{
public static void main (String [] args){

//Declaring variables
//Read input from the user
//condition to be calculate cost
//First condition is the if statement

double cost = 0;

Scanner input = new Scanner(System.in);

System.out.print("Enter the weight: ");
double weight = input.nextDouble();

if (weight <=1){
cost = 3.5;
System.out.printf("The shipping cost is: %.2f%n", cost);
} else if (weight > 1 && weight <= 3){
cost = 5.5;
System.out.printf("The shipping cost is: %.2f%n", cost);
} else if (weight > 3 && weight <= 10 ){
cost = 8.5;
System.out.printf("The shipping cost is: %.2f%n", cost);
}else if (weight > 10 && weight <= 20){
cost = 10.5;
System.out.printf("The shipping cost is: %.2f%n", cost );
}else {
System.out.println("The package cannot be shipped");
}





}
}