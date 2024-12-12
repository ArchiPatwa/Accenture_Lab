package Day5;

public class DivideByZeroDemo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;



        try{
            int result = num1 / num2;
            System.out.println("Result:"+result);
        }catch (ArithmeticException e){
            System.out.println("Error:Divide by zero");
        }
        finally {
            System.out.println("Division Successful");
        }
    }
}
