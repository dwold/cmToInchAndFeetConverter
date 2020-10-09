import java.util.Scanner;

public class TestClass {

    static double ONE_INCH_IN_CM = 2.54;
    static int ONE_FEET_IN_INCH = 12;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input height in cm: ");
        int heightInCm = scanner.nextInt();
        double fullHeightInInch = cmToInch(heightInCm);
        int feetHeight = calculateFeetHeight(fullHeightInInch);
        int inchHeight = calculateInchHeight(fullHeightInInch);
        String formatedOutput = "Height is: " + feetHeight + "\'" + inchHeight + "\"";
        System.out.println(formatedOutput);
    }

    public static double cmToInch(int heightInCm){
        double fullHeightInInch = heightInCm / ONE_INCH_IN_CM;
        return fullHeightInInch;
    }
    public static int calculateFeetHeight(double fullHeightInInch) {
        int feetHeight = (int) ((fullHeightInInch - fullHeightInInch % ONE_FEET_IN_INCH) / ONE_FEET_IN_INCH);
        return feetHeight;
    }
    public static int calculateInchHeight(double fullHeightInInch) {
        return (int) Math.round (fullHeightInInch % ONE_FEET_IN_INCH) ;

    }
}
