package HomeworkWeek7;
/* 2. Write a java program to input any year like (ex.2007) and find out if it is leap year or Not? */
import java.util.Scanner;
public class Project2LeapYear {
        public static void main(String[] args) {

            int year =2007; //Take any leap year

            System.out.print("Enter the year then press Enter : ");

            Scanner input = new Scanner(System.in);

            year = input.nextInt();

            if ((year < 2400) && ((year % 4) == 0)) {  //Only enter leap years up to 2400 year
                System.out.println(year + " Leap year");
            } else {
                System.out.println(year + " Not a leap year!");
                input.close();
            }
        }
    }
