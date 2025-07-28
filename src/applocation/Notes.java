package applocation;

import entites.Student;

import java.util.Scanner;

public class Notes {
    public Notes() {
        Scanner scanner = new Scanner(System.in);

            Student student = new Student();
            student.studentData(scanner);

            double notesResult = student.verifyNotes(scanner);

            student.results(notesResult);



        scanner.close();
    }

    public static void main(String[] args) {
        new  Notes();
    }
}
