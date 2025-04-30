import java.util.Scanner;
public class Count{
public static void main (String [] args){

Scanner sc = new Scanner (System.in);


double total = 0;

double average ;
int neg = 0;
int pos = 0;

System.out.print("Enter an integer or press 0 to end: ");
double integer = sc.nextInt();

while(integer != 0){

if(integer < 0){
neg++;
}

if(integer > 0){
pos++;
}

total = total + integer;
integer = sc.nextInt();

}
average = total/ (neg + pos);
System.out.printf("The number of positive is %d%n " , neg);
System.out.printf("The number of negative is %d%n " , pos);
System.out.printf("Total is %.2f%n " ,total);

if(total > 0) System.out.printf("The average is %.2f%n ", average);


}
}