package Java.Google.Easy.String;

import java.util.Scanner;
public class q2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String x="";
        System.out.println("Enter a string.");
        String y = sc.nextLine();
        for(int i=0;i<y.length();i++)
        {
            if(!Character.isWhitespace(y.charAt(i)))
            {
                x+=y.charAt(i);
            }
        }
        System.out.println(x);
        sc.close();
    }
}
