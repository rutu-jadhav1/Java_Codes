import java.util.Scanner;

public class Arithmatic_Operations {
    public static void main(String[] args) {
        System.out.print("Enter first number :");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.print("Enter second number :");
        int num2 = sc.nextInt();

        int add = num1 + num2;
        System.out.println("Addition :" +add);
    }
}