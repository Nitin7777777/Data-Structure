package Lecture_3;
import java.util.Scanner;
public class ConditionalStatements {
    public static void main(String[] args) {
        System.out.println("Starting.....");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Age: ");
        int age = scan.nextInt();
        if(age>18)
            System.out.println("You can Drive");
        else if (age<18)
            System.out.println("You Cant Drive.");
        else
            System.out.println("Wrong Input.");
        System.out.println("Even & ODD");
        for(int i=0;i<100;i++){
            if(i%2==0)
                System.out.println("Even number = " + i);
            if(i%2!=0)
                System.out.println("Odd Number " + i);
        }
    }
}
