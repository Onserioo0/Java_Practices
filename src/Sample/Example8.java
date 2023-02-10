package Sample;

public class Example8 {
    public static void main(String[] args) {

        int var;    // declare int variable

        double x;   // declare floating point variable

        var = 10;   // assign var the value 10

        x = 10.0;   // assign x the value 10.0

        System.out.println("Original value of var: " + var);

        System.out.println("Original value of x: " + x);

        System.out.println();   // print blank line

        // Now, divide both by 4
        var = var / 4;

        x = x / 4;

        System.out.println("var after division: " + var);
        System.out.println("x after division: " + x);
    }
}
