import java.util.Scanner;

public class ThreeDArray {
    public static void main(String[] args) {
        int age[][][] = new int[2][2][5];
        Scanner s = new Scanner(System.in);

        // Input ages
        for (int i = 0; i < age.length; i++) { 
            for (int j = 0; j < age[i].length; j++) { 
                for (int k = 0; k < age[i][j].length; k++) { 
                    System.out.println("Enter the age of student " + (k + 1) + " in classroom " + (j + 1) + " of college " + (i + 1));
                    age[i][j][k] = s.nextInt();
                }
            }
        }

        // Display the entered ages
        System.out.println("The entered ages are:");
        for (int i = 0; i < age.length; i++) {
            System.out.println("College " + (i + 1) + ":");
            for (int j = 0; j < age[i].length; j++) {
                System.out.println("  Classroom " + (j + 1) + ":");
                for (int k = 0; k < age[i][j].length; k++) {
                    System.out.println("    Student " + (k + 1) + ": " + age[i][j][k]);
                }
            }
        }

        s.close();
    }
}
