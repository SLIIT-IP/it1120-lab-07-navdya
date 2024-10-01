import java.util.Scanner;
public class IT24100652Lab7Q1B
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);

        int x;
        int total;

        for ( x = 1; x <= 3; x++) 
        {
            System.out.println("Student " + x);
            System.out.print("Enter marks : ");

            int sub1 = sc.nextInt();
            int sub2 = sc.nextInt();
            int sub3 = sc.nextInt();
            int sub4 = sc.nextInt();

            double average = (sub1 + sub2 + sub3 + sub4) / 4.0;
            System.out.println("Average is : " + average);

            if (average>=75 && average<=100)
            {
                System.out.println("Overall Grade is : Distinction");
            }
            else if (average<=74 && average>=50)
            {
                System.out.println("Overall Grade is : Credit");
            }
            else if (average<=49 && average>=0)
            {
                System.out.println("Overall Grade is : Fail");
            }
            else
            {
                System.out.println();
            }
            
            System.out.println();
        }

    }
}