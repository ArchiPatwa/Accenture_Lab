//Program to check the leap year
public class leapYear {
    public void isLeapYear(int year){
        if(year %400 == 0){
            System.out.println("Leap Year");
        }
        else if(year%100 == 0){
            System.out.println("Not a leap Year");
        }
        else if(year%4==0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
    public static void main(String[] args){
        leapYear obj = new leapYear();
        obj.isLeapYear(1800);
    }
}
