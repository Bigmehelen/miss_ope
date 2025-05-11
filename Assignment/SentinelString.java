import java.util.Scanner;
public class SentinelString{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

String sentinel = "stop";

int max = -2_000_000_000;

System.out.print ("Enter a number press Enter to quit: ");

while(true){

int num = input.nextInt();

if (num == sentinel){
break;
} else if (num > max) {
num = max;
System.out.print("The largest number is" + max);

}
}


}
}