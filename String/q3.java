package Java.Google.Easy.String;

import java.util.Scanner;

public class q3 {
    static boolean areAnagrams(String str1, String str2)
    {
        if(str1.length() != str2.length())
        {
            return false;
        }
        int[] count = new int[256];
        for(int i=0;i<str1.length();i++)
        {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for(int i=0;i<count.length;i++)
        {
            if(count[i]!=0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings.");
        String a = sc.next();
        String b = sc.next();
        if(areAnagrams(a, b))
        {
            System.out.println("The Strings are Anagrams.");
        }
        else
        {
            System.out.println("The Strings are not Anagrams.");
        }
        sc.close();
    }
}
