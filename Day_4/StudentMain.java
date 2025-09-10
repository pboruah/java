import java.util.Scanner;


class Student {
    
    String name;
    int id;
    double marks;

    
    void inputDetails() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter student name: ");
        name = sc.nextLine();
        
        System.out.print("Enter student ID: ");
        id = sc.nextInt();
        
        System.out.print("Enter student marks: ");
        marks = sc.nextDouble();
    }

    
    void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name  : " + name);
        System.out.println("ID    : " + id);
        System.out.println("Marks : " + marks);
    }
}


public class StudentMain {
    public static void main(String[] args) {
        
        Student s1 = new Student();

        
        s1.inputDetails();
        s1.displayDetails();
    }
}
