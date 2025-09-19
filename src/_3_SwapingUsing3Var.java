import java.util.Scanner;

public class _3_SwapingUsing3Var {
    public static void main(String [] args){
        System.out.print("Enter the first number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter the second number :");
        int b = sc.nextInt();

        System.out.println("Values before swapping are a = " + a + " & b = " + b);

        int c = a;
        a = b ;
        b = c;


        System.out.println("Values after swapping are a = " + a + " & b = " + b);

    }
}
