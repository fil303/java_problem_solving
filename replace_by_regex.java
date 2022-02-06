import java.util.Scanner;

public class Main
{
    public static void main(String[] input)
    {

        String temp;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Any Sentence to replace by regex : ");
        temp=scan.nextLine();
        System.out.println(temp.replaceAll("[aeiouAEIOU]",""));

    }
}
