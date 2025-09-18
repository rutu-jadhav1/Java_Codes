import java.util.Scanner;

public class SwappingUsing2Var {
    public static void main(String[] args){
        System.out.print("Enter first number :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter second number :");
        int b = sc.nextInt();
        System.out.println("Values before swapping are a = " + a + " & b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Values after swapping are a = " + a + " & b = " + b);

    }
}
