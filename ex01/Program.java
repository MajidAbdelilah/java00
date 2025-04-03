import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        long numIter = 0;
        long divBy = 2;
        double val = (new Scanner(System.in)).nextDouble();
        long valInt = (long)val;
        if(valInt <= 1)
        {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }
        while((valInt/ (divBy - 1)) >= divBy)
        {
            numIter++;
            if(valInt% divBy == 0) {
                System.out.println("false " + numIter);
                System.exit(0);
            }
            divBy++;
        }
        System.out.println("true " + numIter);
    }
}