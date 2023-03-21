package HomeworkWeek7;
/*Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry*/

import java.util.Scanner;

public class Project8CityName {

    public static void main(String[] args) {

        String alphabet;
        System.out.println("Enter the alphabet from A To F");
        Scanner k = new Scanner(System.in);
        alphabet = k.nextLine();
        switch (alphabet) {
            case "A":
                System.out.println("City name is Aberdean");
                break;
            case "B":
                System.out.println("City name is Bath");
                break;
            case "C":
                System.out.println("City name is Cambridge ");
                break;
            case "D":
                System.out.println("City name is Derby");
                break;
            case "E":
                System.out.println("City name is Exeter");
                break;
            case "F":
                System.out.println("City name is Florida");
                break;
            default:
                System.out.println("Incorrect Alphabet");
                k.close();
                break;
        }
    }
}