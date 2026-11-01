import java.io.*;

class Exam2{
    public static void main(String... args) throws Exception {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter age:");

        int age = Integer.parseInt(br.readLine());

        if (age >= 1 && age < 5) {
            System.out.println("Elementary School Student");
        }
        else if (age >= 5 && age < 10) {
            System.out.println("Junior School Student");
        }
        else if (age >= 10 && age < 14) {
            System.out.println("Middle School Student");
        }
        else if (age >= 14 && age < 16) {
            System.out.println("High School Student");
        }
        else if (age >= 16 && age < 22) {
            System.out.println("College Student");
        }
        else {
            System.out.println("Not a Student");
        }
    }
}