import java.util.*;
class InvalidMarksException extends Exception {
    InvalidMarksException(String msg) {
        super(msg);
    }
}
public class CustomException {
    static void checkMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100)
            throw new InvalidMarksException("Invalid Marks");
        System.out.println("Valid Marks");
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        try {
            checkMarks(marks);
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
    }
}

