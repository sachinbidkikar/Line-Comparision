import java.util.Scanner;

public class CalculateLengthUC3 {
    public static double compareLine(double length1, double length2) {

        String stringFirst = Double.toString(length1);
        String stringSecond = Double.toString(length2);
        int check = stringFirst.compareTo(stringSecond);

        if (check == 0) {
            System.out.println("Both Lines are equal");
        } else if (check > 0) {
            System.out.println("First line is longer than second line");
        } else {
            System.out.println("Second line is longer than First line");
        }
        return 0;
    }

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in); // using scanner class to read input
        System.out.println("enter the number for x1 and y1 FOR LINE1");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("enter the number for x2 and y2 FOR LINE1");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        // X1 X2 Y1 Y2 IS FOR LINE1 & X3 X4 Y3 Y4 USED FOR LINE 2
        System.out.println("enter the number for x1 and y1 FOR LINE2");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        System.out.println("enter the number for x2 and y2 FOR LINE2");
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        double length1 = Math.sqrt((Math.pow((x2-x1), 2)) + Math.pow((y2-y1), 2)); // FORMULA : Length of a Line = sqrt( (x2 - x1) ^ 2 + (y2- y1) ^ 2)
        double length2 = Math.sqrt((Math.pow((x4-x3), 2)) + Math.pow((y4-y3), 2)); // FORMULA : Length of a Line = sqrt( (x2 - x1) ^ 2 + (y2- y1) ^ 2)

        System.out.println("Lenght of Line 1 : " + length1);
        System.out.println("Lenght of Line 2 : " + length2);
        compareLine(length1,length2);
    }
}
