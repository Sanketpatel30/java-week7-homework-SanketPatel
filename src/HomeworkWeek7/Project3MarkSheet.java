package HomeworkWeek7;

/* Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
*/
import java.util.Scanner;
public class Project3MarkSheet {
    public static void main(String[] args) {

        String name, result;
        int roll;
        int math;
        int science;
        int english;
        String Pass;
        String grade = "A+";
        System.out.println("Enter Student name");
        Scanner a = new Scanner(System.in);
        name = a.nextLine();
        System.out.println("Enter roll number");
        Scanner b = new Scanner(System.in);
        roll = b.nextInt();
        System.out.println("Enter marks for math, science and english");
        Scanner c = new Scanner(System.in);
        math = c.nextInt();
        science = c.nextInt();
        english = c.nextInt();
        int total = math + science + english;
        float percentage = ((total * 100) / 300);

        if (percentage >= 35) {
            result = "pass";
        } else {
            result = "fail";
        }

        if (percentage >= 80) {
            grade = "A+";
            System.out.println("Grade :" + grade);
        } else if (percentage >= 60 && percentage < 80) {
            grade = "A";
            System.out.println("Grade : " + grade);

        } else if (percentage >= 50 && percentage < 60) {
            grade = "B";
            System.out.println("Grade : " + grade);

        } else if (percentage >= 35 && percentage < 50) {
            grade = "C";
            System.out.println("Grade : " + grade);
        } else {
            grade = "No grade";
        }


        System.out.println("  ___________ ");
        System.out.println(" |           Mark Sheet           |");
        System.out.println(" |____________|");
        System.out.println(" |   Name         :    " + name + "    |"); // Sweta
        System.out.println(" |   Roll No:     " + roll + "              |"); //34
        System.out.println(" |___________ |");
        System.out.println(" |   Subjects     :         Marks |");
        System.out.println(" |___________ |");
        System.out.println(" |   Math         :      " + math + "       |"); // 78
        System.out.println(" |   Science:   " + science + "                |"); //67
        System.out.println(" |   English:   " + english + "                |"); // 89
        System.out.println(" |____________|");
        System.out.println(" |   Total        :      " + total + "      |");
        System.out.println(" |____________|");
        System.out.println(" |   Percentage    :   " + percentage + "       |");
        System.out.println(" |   Result        :     " + result + "     |");
        System.out.println(" |   Grade         :      " + grade + "       |"); //A
        System.out.println(" |____________|");
        a.close();
        b.close();
        c.close();
    }
}