import java.util.ArrayList;

//Create a class named Student with two attributes: one for the student's name and one for their grades.
// Add a method to the Student class that calculates and returns the average of the grades.
// Create student objects, each with a unique name and a set of grades.
// Print each student's name along with their average grade.


public class Student {

    String name;
    ArrayList<Double> grades;

    public Student(String name, ArrayList<Double> grades){

        this.name = name;
        this.grades = grades;

    }

    public double calculateAverageGrade() {
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Average Grade: " + calculateAverageGrade());
    }
}

public void main(String[] args) {
    ArrayList<Double> grades1 = new ArrayList<>();
    grades1.add(4.5);
    grades1.add(5.5);
    grades1.add(5.0);
    grades1.add(5.5);

    Student student1 = new Student("Magi", grades1);

    ArrayList<Double> grades2 = new ArrayList<>();
    grades2.add(5.5);
    grades2.add(5.5);
    grades2.add(5.0);
    grades2.add(6.0);

    Student student2 = new Student("Bibi", grades2);

    ArrayList<Double> grades3 = new ArrayList<>();
    grades3.add(4.5);
    grades3.add(4.0);
    grades3.add(5.0);
    grades3.add(3.0);

    Student student3 = new Student("Ani", grades3);

    student1.displayStudentInfo();
    student2.displayStudentInfo();
    student3.displayStudentInfo();


}