import java.util.Scanner;

public class TwoDimenArray {
    public static void main(String[] args) {
        int age[][] = new int[2][5];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < age.length; i++) {
            for (int j = 0; j < age[i].length; j++) {
                System.out.println("Enter the age of student belonging to class: " + (i + 1) + " and roll no: " + (j + 1));
                age[i][j] = s.nextInt();
            }
        }

        System.out.println("The entered ages are:");
        for (int i = 0; i < age.length; i++) {
            System.out.println("Class " + (i + 1) + ":");
            for (int j = 0; j < age[i].length; j++) {
                System.out.println("  Roll No " + (j + 1) + ": " + age[i][j]);
            }
        }

        s.close();
    }
}
