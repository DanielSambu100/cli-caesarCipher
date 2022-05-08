package caesarCipher;

import java.util.Scanner;

public class Encryption {
private String text;
    public Encryption() {

    }

    public  static Scanner encrypt(String text, int key){
        Scanner result = new Scanner(System.in);

        for (int i=0; i<text.length(); i++)
        {
            if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) +
                        key - 65) % 26 + 65);
                result.next().charAt(ch);
            }
            else
            {
                char ch = (char)(((int)text.charAt(i) +
                        key - 97) % 26 + 97);
                result.next().charAt(ch);
            }
        }
        return result;
    }

    public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);
System.out.println("Welcome to CaesarCipher Encryption");
System.out.println("Please enter your plain text for encryption");
String text = keyboard.next();
System.out.println("Please enter your preferred key");
Integer key = keyboard.nextInt();
System.out.println("Your cipher text is "+ encrypt(text,key));
    }
}
