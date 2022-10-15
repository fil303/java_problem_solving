import java.util.Scanner;

public class Main {
    public static int[] inputs;
    public static void main(String[] args){
        Main.inputs = new int[10];
        System.out.println("Please inpute 10 differant number that more than 0");
        Scanner sc = new Scanner(System.in);

        int count = 0;
        while(count < 10){
            System.out.println("Enter A Number : ");
            int number = sc.nextInt();
            Main.inputs[count] = number;
            if(number == 0){
                System.out.println("\"0\" Not Accept Able");
                return;
            }
            if(Main.checkUniqeNumber(number)){
                System.out.println("Similer Number Found!!");
                return;
            }
            count++;
        }
        int big = Main.inputs[0];
        int small = Main.inputs[0];
        for (int i = 0 ; i < Main.inputs.length ; i++){
            if(big < Main.inputs[i]) big = Main.inputs[i];
            if(small > Main.inputs[i]) small = Main.inputs[i];
        }
        System.out.println("The Bigest Number Is : "+big);
        System.out.println("The Smallest Number Is : "+small);
    }

    public static boolean checkUniqeNumber(int number) {
       for (int i = 0 ; i < Main.inputs.length ; i++){
           if(Main.inputs[i] == 0) continue;
           int s = Main.inputs[i];
           for(int j=0; j<Main.inputs.length;j++){
               if(i == j) continue;
               if(s == Main.inputs[j]) return true;
           }
       }
       return false;
    }
}



