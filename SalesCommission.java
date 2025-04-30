import java.util.Scanner;
public class SalesCommission{
public static void main (String [] args ){

Scanner input = new Scanner (System.in);

int count = 0;
double total = 0; 
double totalPay = 0;

System.out.println("Item\tvalue");

while(true){

int sales = input.nextInt();

if(sales == 0)break;

if (sales == 1){
total += 239.99;
} else if (sales == 2){
total += 129.75;
} else if (sales == 3){
total += 99.95;
} else if (sales == 4){
total += 350.89;

} 

totalPay = 200 + 0.09 * total;



}

System.out.printf("Total Sales Earned is %.2f", totalPay);






}
}