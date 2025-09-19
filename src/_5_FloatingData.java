import java.util.Scanner;

public class _5_FloatingData {
    public static void main(String[] args){
        System.out.print("Enter first float number : ");
        Scanner sc = new Scanner(System.in);
        float a =sc.nextFloat();
        System.out.print("Enter second float number :");
        float b = sc.nextFloat();

        float c = a + b;
        System.out.println("Addition of float numbers is : " + c );
    }
}
