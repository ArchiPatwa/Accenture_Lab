package Day5;
import java.util.Scanner;
class Student{
    private String name;
    private int age;
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("Name:"+name+"Age:"+age);
    }
}
public class StudentRecord {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Student[] students = new Student[10];

       try{
           System.out.println("Enter student details");

           for(int i =0; i<10; i++){
               System.out.println("Enter the Detail of Student"+ i+1);
               System.out.println("Name:");
               String name = scanner.nextLine();
               System.out.println("Age:");
               int age = scanner.nextInt();
              scanner.nextLine();
              students[i] = new Student(name, age);
           }
           System.out.println("\nStored Student Records:");
           for (int i = 0; i < 10; i++) {
               students[i].display();
           }
       }
       catch (ArrayIndexOutOfBoundsException e){
           System.out.println("error: Array out of bound");
       }
       finally {
           System.out.println("program execution completed");
           scanner.close();
       }
    }
}
