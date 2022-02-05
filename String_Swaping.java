import java.util.Scanner;

public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st String : ");

        String s1 = sc.nextLine();

        System.out.print("Enter 2nd String : ");

        String s2 = sc.nextLine();
        s1=s2+s1;
        s2=s1.replace(s2,"");
        s1=s1.replace(s2,"");

        System.out.println("S1 : "+s1);

        System.out.println("S2 : "+s2);
    }
}
