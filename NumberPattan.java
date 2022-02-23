import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while( num == 0) {
            System.out.println("Please Enter A Number Below 10");
            num = sc.nextInt();
        }
        int tempLoop = num;
        int tempNum = num;
        int loop = num + (num - 1);
        int just = 0;
        boolean fl = false;
        boolean sl = false;
        for(int i = 0 ; i < loop ; i++){

            for(int l = 0 ; l < loop ; l++){
                if(tempLoop <= tempNum) { System.out.print(tempNum); just = tempNum; }
                else{ System.out.print(just); }
                if(tempNum == 1) sl = true ;
                if(sl)
                    tempNum++;
                else
                    tempNum--;
            }

            System.out.print("\n");
            tempNum = num;
            sl = false ;
            if(tempLoop == 1) fl = true;
            if(fl)
                tempLoop++;
            else
                tempLoop--;
        }
    }
}
