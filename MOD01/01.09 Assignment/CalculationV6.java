public class CalculationV6 {
    public static void main(String[] args) {
        // Declare integer variables

        // Declare integer variables
        int iNum1 = 25;
        int iNum2 = 9;
        int iNum3 = 11;
        int iNumNew = 24;

        // Declare double variables
        double dNum1 = 43.21;
        double dNum2 = 3.14;
        double dNum3 = 10.0;
        double dNumNew = 12.5;

        // Subtraction
        System.out.println("Subtraction");
        System.out.println(iNum3 + " - " + iNum2 + " - " + iNum1 + " = " + (iNum3 - iNum2 - iNum1));
        System.out.println(dNum2 + " - " + dNum3 + " = " + (dNum2 - dNum3));
        System.out.println();

        // Multiplication
        System.out.println("Multiplication");
        System.out.println(iNum1 + " * " + iNum2 + " = " + (iNum1 * iNum2));
        System.out.println(dNum2 + " * " + dNum3 + " * " + dNum3 + " = " + (dNum2 * dNum3 * dNum3));
        System.out.println();

        // Division
        System.out.println("Division");
        System.out.println(iNum2 + " / " + iNum1 + " = " + (iNum2 / iNum1));
        System.out.println(dNum1 + " / " + dNum3 + " = " + (dNum1 / dNum3));
        System.out.println();

        // Modulus operator
        System.out.println("Modulus");
        System.out.println(iNum3 + " % " + iNum2 + " = " + (iNum3 % iNum2));
        System.out.println(dNum3 + " % " + dNum2 + " = " + (dNum3 % dNum2));
        System.out.println();

        // New mixed type and mixed operator example 1
        System.out.println("Mixed type and mixed operator");
        System.out
                .println(iNum3 + " + " + iNum2 + dNumNew + "/" + iNumNew + " = " + (iNum3 + iNum2 + dNumNew / iNumNew));
        System.out.println(iNum1 + " % " + iNum2 + " / " + dNumNew + " * " + "(" + dNum3 + "*" + iNumNew + ")" + " = "
                + (iNum1 % iNum2 / dNumNew * (dNum3 * iNumNew)));
        System.out.println();

        // New mixed type and mixed operator example 2
        System.out.println("Mixed type and mixed operator");
        System.out.println(
                iNum1 + " - " + iNum2 + " * " + dNumNew + " + " + dNum3 + " = " + (iNum1 - iNum2 * dNumNew + dNum3));
        System.out.println(dNum3 + " / " + iNum3 + " + " + iNumNew + " - " + "(" + dNumNew + " * " + iNum2 + ")" + " = "
                + (dNum3 / iNum3 + iNumNew - (dNumNew * iNum2)));
        System.out.println();

    }
}