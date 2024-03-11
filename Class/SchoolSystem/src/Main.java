import mx.edu.up.oop.schoolsys.GradeOutOfBoundsException;
import mx.edu.up.oop.schoolsys.SchoolPrograms;
import mx.edu.up.oop.schoolsys.Student;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        //TODO: task 4 - Create 3 students
        Student student0 = new Student(108851, "Gabriel", "Castillo");
        Student student1 = new Student(262370, "Regina", "Lopez");
        Student student2 = new Student(262142, "Omar", "Santos");
        // TODO: task 5 - Print the information of all students
        student0.info();
        student1.info();
        student2.info();
        */
        // TODO: task 6 - Do the same as above but with ONLY one variable.
        // Hint: use an array
        Student[] students = new Student[3];
        students[0] = new Student(108851, "Gabriel", "Castillo");
        students[1] = new Student(262370, "Regina", "Lopez");
        students[2] = new Student(262142, "Omar", "Santos");
        // TODO: task 8 - Assign a random gpa between 5 and 10
        /*try {
            students[0].addGrade(7.2, 1);  // OK
            //students[0].addGrade(8.5, 6);   // Index out of bounds
            //students[0].addGrade(123, 2);   // Grade out of bounds
            // students[0].addGrade(345, 9);   // Index out of bounds
        } catch(IndexOutOfBoundsException iobex) {
            System.out.println("The index is out of bounds. " + iobex.getMessage());
        } catch(GradeOutOfBoundsException gobex) {
            System.out.println("The grade is out of bounds. " + gobex.getMessage());
        } catch(Exception ex) {
            System.out.println("Some weird exception. " + ex.getMessage());
        }*/
        // TODO: task 10 - Assign grades to the 3 periods for all the students
        Random rnd = new Random();
        float minGrade = 5f;
        float maxGrade = 10f;
        for(int i=0; i< 3; i++) {
            for(int j=0; j< 3; j++) {
                try {
                    students[i].addGrade(rnd.nextFloat(maxGrade - minGrade + 1f) + minGrade, j);
                } catch (Exception ex) {
                    System.out.println("Error assigning grade for ");
                    //students[i].info();
                }
            }
            int maxProg = SchoolPrograms.values().length;
            int randProg = rnd.nextInt(maxProg);
            students[i].setProgram(SchoolPrograms.values()[randProg]);
            students[i].setGpa(rnd.nextFloat(maxGrade-minGrade+1f)+minGrade);
            students[i].info();
        }
    }
}