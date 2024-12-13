import java.util.Scanner;

public class ExampleForArray_1 {

    public static void main(String[] args) {
        int age[] = new int[5];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < age.length; i++) {
            System.out.println("Enter the age of student: " + (i + 1));
            age[i] = s.nextInt();
        }
        for (int i = 0; i < age.length; i++) {
            System.out.println("The ages Are:"+age[i]);
        }
    }
}