import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        long count = 0;

        while(true)
        {
            long divBy = 2;
            long val =  (new Scanner(System.in)).nextLong();
            if(val<= 1)
            {
                System.err.println("IllegalArgument");
                System.exit(-1);
            }
            if(val == 42)
            {
                System.out.println("Count of coffee-request : " + count);
                System.exit(0);
            }
            long k = val;
            long res = 0;
            while(k > 0)
            {
                res += k % 10;
                k /= 10;
            }
//            System.out.println("res: " + res);

            boolean isNotPrime = false;
            while((res/ (divBy - 1)) >= divBy)
            {
                if(res% divBy == 0 && res != divBy) {
                    isNotPrime = true;
                    break;
                }
                divBy++;
            }
            if( !isNotPrime )
            {
                count++;
            }
        }
    }
}