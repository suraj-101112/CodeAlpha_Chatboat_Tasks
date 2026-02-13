import java.util.*;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        int sum = 0, max = 100, min = 0;

        for(int i = 0; i < n; i++){
            System.out.print("Enter marks of student " + (i+1) + ": ");
            marks[i] = sc.nextInt();

            sum += marks[i];
            if(marks[i] > max) max = marks[i];
            if(marks[i] < min) min = marks[i];
        }

        double avg = (double)sum / n;

        System.out.println("Average Marks: " + avg);
        System.out.println("Highest Marks: " + max);
        System.out.println("Lowest Marks: " + min);
    }
}