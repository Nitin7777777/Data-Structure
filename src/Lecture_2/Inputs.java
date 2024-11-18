package Lecture_2;
import java.util.Scanner;
public class Inputs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENter First Number.");
        int a = scan.nextInt();
        System.out.println("ENter Second Number.");
        int b = scan.nextInt();
        int sum = a+b;
        System.out.println("Sum = " + sum);
    }
}
