package Java.Google.Easy.String;

import java.util.Scanner;
public class q1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word and a character.");
        String word = sc.next();
        char c = sc.next().charAt(0);
        int count=0;
        for(int i =0;i<word.length();i++)
        {
            if(word.charAt(i)== c)
            {
                count++;
            }
        }
        System.out.println("Count: "+count);
        sc.close();
    }
}
