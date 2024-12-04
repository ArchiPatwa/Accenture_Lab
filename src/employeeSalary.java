//Create a program to calculate the annual salary of an employee by using inheritance. Create a class named "User" with the
// following properties and methods: Properties: id(int): representing the id of the User name(String):representing the name
// of the User Constructor: Declare parameterized constructor to initialize id and name. Create a subclass named "Employee" that
// inherits from the "User" class. Add the following additional properties and methods: Properties: salary(double):representing the
// monthly salary of the employee Method: double calculateAnnualSalary():to calculate the annual salary earned by the employee.
// In the main method, create an object of "Employee" class. Calculate the annual salary of the employee and display it..
// [Hint:Use constructor or setter methods to set the value]
class User{  //Base class named user
    private int id;
    String userName;
    //parameterized constructor
    public User(int id, String userName){
        this.id = id;
        this.userName = userName;
    }
    //method that display the information of the user
    public void display(){
        System.out.println("ID:" + id);
        System.out.println("Name"+userName);
    }
}
//subclass employee inheriting from user
class Employee extends User{

    double salary; //Monthly salary
    //constructor of employee
    public Employee(double salary){
        super(101, "Alice");
        this.salary = salary;
    }
    //method to calculate the annual salary
    public double calulateAnnualSalary(){
        return salary*12;
    }
    //method to display the monthly and annual salary of employee
    public void displaySalary(){
        System.out.println("Monthly salary:"+salary);
        System.out.println("Annual Salary:"+calulateAnnualSalary());
    }
}
public class employeeSalary {
    public static void main(String[] args){
        //object of subclass named employee
   Employee emp = new Employee(12000.0);
   //calling the method of parent class
   emp.display();
   //calling the method of subclass
   emp.displaySalary();
    }
}
