package grades;

public class StudentTest {

    public static void main(String[] args) {
        Student s1 = new Student("Joseph");
        Student s2 = new Student("Sue");
        Student s3 = new Student("Mary");
        Student s4 = new Student("John");

        s1.addGrade(9);
        s1.addGrade(10);
        s1.addGrade(7);
        s2.addGrade(7);
        s2.addGrade(10);
        s2.addGrade(9);
        s3.addGrade(7);
        s3.addGrade(8);
        s3.addGrade(10);
        s4.addGrade(9);
        s4.addGrade(8);
        s4.addGrade(8);

        Student s5 = new Student("George");
        s5.addGrade(10);
        s5.addGrade(10);
        s5.addGrade(10);



        System.out.println(s4.getGrades());
        System.out.println(s4.getGradeAverage());
        System.out.println(s4.getName());

        System.out.println(s2.getGrades());
        System.out.println(s2.getGradeAverage());
        System.out.println(s2.getName());

        System.out.println(s5.getGrades());
        System.out.println(s5.getGradeAverage());
        System.out.println(s5.getName());


    }

}
