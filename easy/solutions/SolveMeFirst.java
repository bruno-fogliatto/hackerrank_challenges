import java.util.*;

public class SolveMeFirst
{
    static int solveMeFirst(int a, int b)
    {
        return a + b;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = in.nextInt();
        System.out.println("Enter the second number:");
        int b = in.nextInt();
        in.close();
        int sum = solveMeFirst(a, b);
        System.out.println("Result: " + sum);
    }
}