package Day5;
import java.sql.SQLOutput;
import java.util.Scanner;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
public class ValidateAge {
    public void validAge() throws InvalidAgeException{
        System.out.println("Enter the age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age<18){
            throw new InvalidAgeException("You are not eligible for voting");
        }
        else{
            System.out.println("You are eligible for voting");
        }
    }
    public static void main(String[] args) {
          ValidateAge obj = new ValidateAge();
        try {
            obj.validAge();
        } catch (InvalidAgeException e) {
            e.printStackTrace();;
        }

    }
}
