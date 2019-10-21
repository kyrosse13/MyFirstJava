import java.util.Scanner;

public class Myfirstjava {
    public static void main(String args[]){
            System.out.println("Welcome to my world!");
        System.out.println("My name is Karen.");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name?");
        String userResponse = keyboard.nextLine();
        System.out.println("Your name is " +userResponse);

        int firstNo, secondNo;
        System.out.println("Enter your first number");
        firstNo = keyboard.nextInt();
        System.out.println("Enter your second number");
        secondNo = keyboard.nextInt();

        System.out.println ("Sum of" + firstNo + " and " + secondNo + " is " + sum);
    }
}
