import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second number: ");

        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("Addition of two number is : " + sum);
    }
}
