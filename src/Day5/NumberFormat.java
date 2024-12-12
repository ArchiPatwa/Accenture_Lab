package Day5;

import java.util.Scanner;

public class NumberFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
try{
    String input = scanner.nextLine();

    int num = Integer.parseInt(input);

    System.out.println("Number"+num);
}
    catch (NumberFormatException e){
        System.out.println("Error : Number Format Exception");
    }

    }
}
