import java.util.Scanner;
public class ConvertBase{
public static void main (String[] args){

Scanner input = new Scanner(System.in);


int i = 0;
int vowel = 0;
int consonant = 0;
int space = 0;
int noSpace = 0;

System.out.print("Enter a word: ");
String word = input.nextLine();

int length = word.length();

word = word.toLowerCase();

for(i = 0; i < length; i++){

char ch = word.charAt(i);


if (ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
vowel++;
} else if (ch >= 'a' && ch <= 'z'){
consonant++;
} else if (ch == ' '){
space++;
}

}

System.out.print("\nvowel is  " + vowel );
System.out.print("\nconsonant is " + consonant );
System.out.print("\nspace is " + space );
System.out.print("\nlength is " + length );
System.out.print("\noSpace is " + noSpace );




}
}
