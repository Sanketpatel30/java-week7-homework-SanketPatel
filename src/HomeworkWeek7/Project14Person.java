package HomeworkWeek7;
/*Write a class with the name Person. The class needs three fields (instance variables) with the names
firstName, lastName of type String and age of type int.
Write the following methods (instance methods):
*Method named getFirstName without any parameters, it needs to return the value of the firstName
field.
*Method named getLastName without any parameters, it needs to return the value of the lastName
field.
*Method named getAge without any parameters, it needs to return the value of the age field.
*Method named setFirstName with one parameter of type String, it needs to set the value of the
firstName field.
*Method named setLastName with one parameter of type String, it needs to set the value of the
lastName field.
*Method named setAge with one parameter of type int, it needs to set the value of the age field. If
the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
*Method named isTeen without any parameters, it needs to return true if the value of the age field is
greater than 12 and less than 20, otherwise, return false.
*Method named getFullName without any parameters, it needs to return the full name of the person.
 *In case both firstName and lastName fields are empty, Strings return an empty String.
 *In case firstName is an empty String, return firstName.
 *In case lastName is an empty String, return lastName.
To check if s String is empty, use the method isEmpty from the String class. For example,
firstName.isEmpty() returns true if the String is empty or in other words, when the String does not
contain any characters. */

public class Project14Person {
    String firstName;
    String lastName;
    int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age <= 0 || age >= 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen() {
        boolean r;
        if (age > 12 && age < 20) {
            r = true;
        } else {
            r = false;
        }
        return r;
    }

    public String getFullName() {
        String fullName;
        if (firstName.isEmpty() && lastName.isEmpty()) {
            fullName = " ";
        } else {
            fullName = firstName.concat(lastName);
        }
        return fullName;

    }

    public static void main(String[] args) {
        Project14Person person = new Project14Person();
        System.out.println("result of empty string");
        person.setFirstName(" ");// set the value of firstname
        person.setLastName(" ");// set the value of firstname
        System.out.println("getfirstname =" + person.getFirstName());
        System.out.println("getlastname =" + person.getLastName());
        System.out.println("result of fullname with empty string");
        System.out.println("fullName =" + person.getFullName());
        System.out.println("result of age not is teen between 12 to 20");
        person.setAge(10);
        System.out.println("teen =" + person.isTeen());
        System.out.println("age =" + person.getAge());
        // System.out.println("fullName =" + person.getFullName());

        person.setAge(18);
        System.out.println("result of age is teen between 12 to 20");
        System.out.println("isTeen =" + person.isTeen());
        System.out.println("age =" + person.getAge());
        person.setLastName("Smith");
        System.out.println("result of lastname is empty");
        System.out.println("fullName =" + person.getFullName());
        // System.out.println("teen =" + person.isTeen());

        //System.out.println("fullName = " + person.getFullName());
    }
}