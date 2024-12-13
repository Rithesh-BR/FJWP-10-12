import java.util.Scanner;

public class ThreeDArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][][] age = new int[2][][];

        age[0] = new int[2][];

        age[1] = new int[3][];

        for (int j = 0; j < age[0].length; j++) {
            System.out.println("Enter the number of students in classroom " + (j + 1) + " of college 1:");
            int students = s.nextInt();
            age[0][j] = new int[students];

            for (int k = 0; k < students; k++) {
                System.out.println("Enter the age of student " + (k + 1) + " in classroom " + (j + 1) + " of college 1:");
                age[0][j][k] = s.nextInt();
            }
        }


        for (int j = 0; j < age[1].length; j++) {
            System.out.println("Enter the number of students in classroom " + (j + 1) + " of college 2:");
            int students = s.nextInt();
            age[1][j] = new int[students];

            for (int k = 0; k < students; k++) {
                System.out.println("Enter the age of student " + (k + 1) + " in classroom " + (j + 1) + " of college 2:");
                age[1][j][k] = s.nextInt();
            }
        }


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
