package Java.Google.Easy.Arrays;

import java.util.Scanner;

public class q2 {
    int a[][];
    q2()
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
                a[i][j] = sc.nextInt();
            }
        }
        display();
        System.out.println("Enter a number.");
        int num = sc.nextInt();
        if(ifExists(num))
        {
            System.out.println("The number exists in the array.");
        }
        else
        {
            System.out.println("The number does not exist in the array.");
        }
        sc.close();
    }
    void display()
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
    boolean ifExists(int num)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(a[i][j] == num)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        q2 obj = new q2();
        obj.input();
    }
}
