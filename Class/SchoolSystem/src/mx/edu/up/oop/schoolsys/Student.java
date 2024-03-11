package mx.edu.up.oop.schoolsys;

import java.util.Date;

public class Student {

    // student id
    private final int student_id;
    // name
    private final String name;
    // last_name
    private final String last_name;
    // date of birth
    private Date dob;
    // program
    private SchoolPrograms program;
    // semester
    private int semester;
    // gpa
    private double gpa;

    private final double[] grades;

    // TODO: task 2 - Create constructor that receives id, name and last name
    public Student(int id, String name, String last_name){
        this.student_id = id;
        this.name = name;
        this.last_name = last_name;
        this.grades  = new double[]{-1d, -1d, -1d};
    }

    // TODO: task 7 - Create a method for assigning the GPA of the student
    @Deprecated
    public void setGpa(double gpa) {
        // this.gpa = gpa;
    }
    // TODO: task 7.1 - Add the gpa to the information when printed

    // TODO: task 3 - Create a method that shows the information of the student
    // Expected output: 108851 Gabriel Castillo
    public void info(){
        String prog = "";
        switch (this.program) {
            case ANM -> prog = "Animation";
            case ARQ -> prog = "Architecture";
            case BIO -> prog = "Biology";
            case BUS -> prog = "Business";
            case COM -> prog = "Computers";
            case DES -> prog = "Design";
        }
        switch (prog){
            case "BUS":
        }
        System.out.println(this.student_id + " " + this.name + " " + this.last_name +
                " gpa: " + this.getGpa() + "  Program: " + prog);

    }

    // TODO: task 9 - Create a method that will take in a grade and then generate the gpa with those grades.
    public void addGrade(double grade, int period) throws IndexOutOfBoundsException, GradeOutOfBoundsException {
        if(period > 3 || period < 0)
            throw new IndexOutOfBoundsException("The period is invalid");
        if(grade > 10d || grade < 0d)
            throw new GradeOutOfBoundsException("Not a valid grade");
        //System.out.println("Adding " + grade + " to student " + this.student_id);
        this.grades[period] = grade;
    }

    public double getGpa() {
        double accum = 0d;
        int gradesSet = 0;
        for(int i= 0; i< 3; i++) {
            if(this.grades[i] >= 0d) {
                //System.out.println(this.grades[i]);
                accum += this.grades[i];
                gradesSet++;
            }
        }
        try {
            return accum / gradesSet;
        } catch (ArithmeticException aex) {
            System.out.println("No grades added yet. " + aex.getMessage());
            return 0d;
        } catch (Exception ex) {
            System.out.println("Unknown exception.");
            return 0d;
        }
    }

    // TODO: task 11 - Create a method to assign the program to the student
    public void setProgram(SchoolPrograms program) {
        this.program = program;
    }
}
