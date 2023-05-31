package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Joseph");
        student1.addGrade(90);
        student1.addGrade(90);
        student1.addGrade(80);

        Student student2 = new Student("Sue");
        student2.addGrade(90);
        student2.addGrade(80);
        student2.addGrade(80);

        Student student3 = new Student("Mary");
        student3.addGrade(80);
        student3.addGrade(90);
        student3.addGrade(100);

        Student student4 = new Student("John");
        student4.addGrade(70);
        student4.addGrade(70);
        student4.addGrade(70);

        students.put("joseph12", student1);
        students.put("sue123", student2);;
        students.put("mary1234", student3);;
        students.put("john34", student4);;

        System.out.println(students);

        Scanner input = new Scanner(System.in);
        String choice;

        do {
            System.out.println("GitHub usernames of students: ");
            for (String username : students.keySet()) {
                System.out.println("|" + username + "| ");
            }


            System.out.print("Choose student");
            String usernameInput = input.nextLine();

            if (students.containsKey(usernameInput)) {
                Student student = students.get(usernameInput);
                System.out.println("Name: " + student.getName());
                System.out.println("Grades: " + student.getGrades());
                System.out.println("Average grade: " + student.getGradeAverage());
            } else {
                System.out.println("No user was found");
            }

            System.out.print("Add student? (y/n) ");
            choice = input.nextLine();

        } while (choice.equalsIgnoreCase("y"));

        System.out.println("Goodbye");


    }
}
