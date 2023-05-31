package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        double sum = 0;
        for(double grade : grades){
            sum += grade;
        }

        return sum / grades.size();
    }


    public ArrayList<Integer> getGrades() {
        return grades;
    }


//    public void getClassGrades(){
//        for(int i = 0; i <this.grades.size(); i ++){
//            System.out.println(this.grades.get(i) + " ");
//        }
//    }
//
//
//    public double getClassAverage(){
//        double total = 0;
//        for(int i = 0; i<grades.size(); i++){
//            total += grades.get(i);
//        }
//        return total/grades.size();
//    }
}
