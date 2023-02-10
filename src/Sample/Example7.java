package Sample;

//  Make a program which creates a sort of truth table
//  To how the behaviour of all the logical operators
public class Example7 {
    public static void main(String[] args) {
        boolean p, q;
        System.out.println("P \t  \t Q\t\tPANDQ\t\tPORQ\t\tPXORQ\t\tNOTP");

        p = true; q = true;
        System.out.print( p + "\t" + q + "\t");
        System.out.print( (p&q)+ "\t" + "\t" +(p|q) + "\t" +"\t");
        System.out.println( (p^q)+ "\t" + "\t" + (!p) );

        p = true; q = false;
        System.out.print( p + "\t" + q + "\t");
        System.out.print( (p&q)+ "\t" + "\t" +(p|q) + "\t" +"\t");
        System.out.println( (p^q)+ "\t" + "\t" + (!p) );

        p = false; q = true;
        System.out.print( p + "\t" + q + "\t");
        System.out.print( (p&q)+ "\t" + "\t" +(p|q) + "\t" +"\t");
        System.out.println( (p^q)+ "\t" + "\t" + (!p) );

        p = false; q = false;
        System.out.print( p + "\t" + q + "\t");
        System.out.print( (p&q)+ "\t" + "\t" +(p|q) + "\t" +"\t");
        System.out.println( (p^q)+ "\t" + "\t" + (!p) );
    }
}
