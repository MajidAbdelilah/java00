public class Main
{
    public static void main(String[] args)
    {
        int val = 479598;
        int tmp = val;
        int res = 0;
        while(tmp > 0)
        {
            res += tmp % 10;
            tmp /= 10;
        }
        System.out.println(res);
    }
}