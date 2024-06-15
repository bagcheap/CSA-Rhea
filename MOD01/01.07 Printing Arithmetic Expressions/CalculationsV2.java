
/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 *  
 * @ author Rhea Bagchee
 * @ version 2024-06-02
 */
public class CalculationsV2
{
    public static void main(String[ ] args)
    {
        // Addition
        System.out.println("Addition");
        System.out.println( "25 + 9 = " + (25 + 9) );
        System.out.println( "43.21 + 3.14 = " + (43.21 + 3.14));
        System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println( "11 - 9 - 25 = " + (11 - 9 - 25) );
        System.out.println( "3.14 - 10.0 = " + (3.14 - 10.0) );
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println( "25 * 9 = " + (25 * 9) ); 
        System.out.println("3.14 * 10.0 * 10.0 = " + (3.14 * 10.0 * 10.0) );
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println("9 / 25 = " + (9 / 25) );
        System.out.println("43.21 / 10.0 = " + (43.21 / 10.0) );
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println( "11 % 9 = " + (11 % 9) );
        System.out.println("10.0 % 3.14 = " + (10.0 % 3.14) );
        System.out.println();
        
        // 1.08 Additional int Equations
        System.out.println("Mixed Equations");
        System.out.println( "14 % 6 + 12/3 - 2^2 = " + (14 % 6 + 12/3 - 2^2) );
        System.out.println("10 * 2 + 20/5 - 6 - 3^3 = " + (10 * 2 + 20/5 - 6 - 3*3) );
        System.out.println();
        
        
        // 1.09 Additional mixed double Equations
        System.out.println("Mixed double Equations");
        System.out.println( "14.4d % 6.2 + 12.2d/3.1 - 2.3^2 = " + (14.4d % 6.2 + 12.2d/3.1 - 2.02d*2) );
        System.out.println("100.0004d * 2.2d + 20.1d/5.00000005d - 6.6 - 3.333d^3 = " + (100.0004d * 2.2d + 20.1d/5.00000005d - 6.6 - 3.333d*3) );
        System.out.println();
        
               
    } // end of main method
} // end of class
