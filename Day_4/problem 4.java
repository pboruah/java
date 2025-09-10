import java.util.Scanner;

class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter student's name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();

        
        System.out.print("Enter marks in Subject 1: ");
        int sub1 = sc.nextInt();

        System.out.print("Enter marks in Subject 2: ");
        int sub2 = sc.nextInt();

        System.out.print("Enter marks in Subject 3: ");
        int sub3 = sc.nextInt();

        
        int total = sub1 + sub2 + sub3;
        double average = total / 3.0;

        
        
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Total Marks: " + total);
        System.out.println("Average    : " + average);

        sc.close();
    }
}

