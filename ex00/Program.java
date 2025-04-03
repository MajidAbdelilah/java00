public class Program
{
    public static void main(String[] args)
    {
        int val = 479598;
        int k = val;
        int res = 0;
        while(k > 0)
        {
            res += k % 10;
            k /= 10;
        }
        System.out.println(res);
    }
}