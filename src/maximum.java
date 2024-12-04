import java.util.Scanner;
public class maximum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your First Number");
        int num1 = scanner.nextInt();
        System.out.println("Enter your second Number");
        int num2 = scanner.nextInt();

        int max = (num1>num2) ? num1: num2;

        System.out.println("The maximum number is :" + max);
    }
}

