package HomeworkWeek7;

/* Write a Java program to sum values of an array.*/

public class Project18SumValue {

    public static void main(String[] args) {
        int[] array = {20, 14, 23, 22, 12, 20};   //in this array is no limit yuo can store any number of elemetnts you want
        int sum = 0;
        for (int i : array)
            sum += i;                 // all the i values we are now assigning to sum
        System.out.println("The sum is " + sum);
    }

}

