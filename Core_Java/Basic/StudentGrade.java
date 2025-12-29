import java.util.*;
class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 5 subjects:");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int s4 = sc.nextInt();
        int s5 = sc.nextInt();
        int total = s1 + s2 + s3 + s4 + s5;
        double percentage = total / 5.0;
        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage);
        if (percentage >= 90){
            System.out.println("Grade: A");
		}
        else if (percentage >= 75){
            System.out.println("Grade: B");
		}
        else if (percentage >= 60){
            System.out.println("Grade: C");
		}
        else if (percentage >= 40){
            System.out.println("Grade: D");
		}
        else{
            System.out.println("Grade: Fail");
		}
    }
}
