//Write a program to check whether a number is a Strong number or not. Strong number is a special number whose sum of factorial of digits is equal to the original number. For example: 145 is a strong number. Since, 1! + 4! + 5! = 145
public class StrongNum {
    public boolean CheckStrongNum(int num){
        int OriginalNumber = num;//Stores the original number
        int sum = 0;
        String str = Integer.toString(num); // Convert the number into string
        //now we create a loop that will run on the string
        for(int i =0; i<str.length(); i++){
            int digit = Character.getNumericValue(str.charAt(i));//Convert the character into integer
            int fact = 1;
            for(int j = 1; j<=digit; j++){ //this loop calculates the factorial of each digit
                 fact = fact*j;
            }
            sum += fact;
        }

        return sum==OriginalNumber;
    }
    public static void main(String[] args){
        StrongNum obj = new StrongNum();
        boolean res = obj.CheckStrongNum(125);
        if(res == true){
            System.out.println("Strong NUmber");
        }
        else{
            System.out.println("Not a strong number");
        }
    }
}
