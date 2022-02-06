import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
       Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int[][] all = new int[t][3];

        for(int i=0;i<t;i++){
            all[i][0] = in.nextInt();
            all[i][1] = in.nextInt();
            all[i][2] = in.nextInt();
        }
        in.close();
        result(all,t);
    }
    private static void result(int[][] all,int t){
        int result;
        int loopp = 1 ;
        for(int i = 0 ; i < t ; i++){
            int a = all[i][0];
            int b = all[i][1];
            int n = all[i][2];
            result = a + b;
            for (int j = 0 ; loopp <= n ; j++){
                if(j==1)j=2;
                if(j==0)System.out.printf("%d ",result);
                else {
                    result = result + j * b;
                    System.out.printf("%d ",result);
                    j = j * 2;
                    j--;
                }
                loopp++;
            }
            loopp=1;
            System.out.print("\n");
        }

    }
}
