import java.util.Scanner;
public class TaxCalculator{
public static void main (String [] args ){

int count = 1;
double total = 0;
double hTotal = 0;
String taxName = " ";
String secondName = " ";
int maxTax = 30_000;
int minTax = 30_000;

Scanner sc = new Scanner (System.in);

System.out.println("Enter citizen name and their earnings: ");

for ( count = 1; count <= 3; count++){

String name = sc.next();
int tax = sc.nextInt();

     
if (tax > maxTax){
maxTax = tax;
taxName = name;
hTotal =  tax - (tax * 0.20);
System.out.printf("citizen name is %s and total tax above $30000 is %.2f%n",taxName, hTotal);

}

if ( tax <= minTax){
     minTax = tax;
     secondName = name;
total = tax - (tax * 0.15);
System.out.printf("citizen name is %s and total tax within $30000 is %.2f%n",secondName, total);

} 

}




}
}