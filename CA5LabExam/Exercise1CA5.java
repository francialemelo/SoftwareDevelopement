package CA5LabExam;
// Exercise1.java
// This program declares variables to store information about a student
// and reconstructs a statement using those variables.

public class Exercise1CA5 {
    public static void main(String[] args) {

        // Declare a String variable to store the student's name
        String name = "Jane";

        // Declare a String variable to store the name of the institution
        String institution = "ATU";

        // Declare an int variable to store the duration of the course in years
        int courseDuration = 3;

        // Declare a String variable to store the name of the course
        String courseName = "Mechanical Engineering";

        // Declare a double variable to store the student's average grade percentage
        double averageGrade = 67.4;

        // Reconstruct and print the statement using the variables declared above
        // Line 1: Student and institution information
        System.out.println(name + " is a student in " + institution + ".");

        // Line 2: Course information
        System.out.println("She is doing a " + courseDuration + " year course in " + courseName + ".");

        // Line 3: Grade information
        System.out.println("Her average grade so far is " + averageGrade + "%.");
    }
}