import java.util.Scanner;
public class Calculator{
public static void main (String [] args){

Scanner sc = new Scanner (System.in);


boolean main = true;
while(main){ 

System.out.print("""
1. Add numbers
2. Subtract number
3. Multiplication
4. Division
0. Turn Off
""");

System.out.println("choose a number: ");
int mains = sc.nextInt();
switch(mains){
case 1-> {
boolean add = true;
while(add){
System.out.println("Enter two numbers: ");
int num = sc.nextInt();
int numA = sc.nextInt();
int total = num + numA;
System.out.printf("The sum of number is %d%n",total );
System.out.println("Press 0 to back");
int addNum = sc.nextInt();
switch(addNum){
case 0->  add = false;
default-> System.out.print("choose a valid number");
}
}
}// case add ends

case 2-> {
boolean subt = true;
while(subt){
System.out.println("Enter two numbers: ");
int sub1 = sc.nextInt();
int sub2 = sc.nextInt();
int sub = sub1 - sub2;
System.out.printf("The subt of number is %d%n",sub );
System.out.println("Press 0 to back");
int subNum = sc.nextInt();
switch(subNum){
case 0->  subt = false;
default-> System.out.print("choose a valid number");
}
}
}//substraction case ends

case 3->{
boolean mulp = true;
while (mulp){
System.out.println("Enter two number: ");
int mul = sc.nextInt();
int mult = sc.nextInt();
int multiply = mul * mult;
System.out.printf("The multiplication of number is %d%n", multiply);
System.out.println("Press 0 to go back");
int multNum = sc.nextInt();
switch (multNum){
case 0-> mulp = false;
default-> System.out.print("Choose a valid number");
}//switch ends
}//while mult ends
}//case mult end

case 4-> {
boolean divd = true;
while (divd){
System.out.println("Enter two number: ");
int div = sc.nextInt();
int divn = sc.nextInt();
int division = div / divn;
System.out.printf("The Division of number is %d%n", division);
System.out.println("Press 0 to go back");
int divdNum = sc.nextInt();
switch (divdNum){
case 0-> divd = false;
default-> System.out.print("Choose a valid number");
}//switch ends
}//while divd ends
}//case div end

int mainMenu = sc.nextInt();
switch(mainMenu){
case 0-> main = false;
default-> System.out.print("Choose a valid number");
}




}// main switch ends
}// man case ends




}
}