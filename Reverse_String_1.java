import java.util.*;

public class Main
{
    public static void main(String args[])
    {
        String original, reverse = "" , temp = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string to reverse");
        original = in.nextLine();

        int length = original.length();

        for ( int i = length - 1 ; i >= 0 ; i-- ) {
            if (original.charAt(i) == ' ') {
                reverse = reverse + temp + " ";
                temp = "";
            }
            else temp = original.charAt(i) + temp;
        }
        reverse = reverse + temp ;
        System.out.println("Reverse of entered string is: "+reverse);
    }
}
