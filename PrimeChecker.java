import java.util.Scanner;
public class PrimeChecker {
public static void main (String[] args){

Scanner input = new Scanner(System.in);

boolean isPrime = true;
int i = 2;

System.out.println("Enter a number: ");
int num = input.nextInt();

if (num <= 1){
isPrime = false;
} else {
i = 2;
while(i <= num / 2){
if(num % i == 0){
isPrime = false;
break;
}
i++;
}
}


if(isPrime){
System.out.println("The number is a prime number");
}else{
System.out.println("The number is not a prime number");
}


















}
}