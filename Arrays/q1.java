package Java.Google.Easy.Arrays;

import java.util.Scanner;
public class q1 {
    int a[][];
    q1()
    {
        a = new int[3][3];
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 9 elements.");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        sc.close();
    }
    void sum()
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                sum+=a[i][j];
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args)
    {
        q1 obj = new q1();
        obj.input();
        obj.sum();
    }
}
