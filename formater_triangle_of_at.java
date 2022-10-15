public class Main {
    public static void main(String[] args){
       for (int i = 1 ; i <= 6 ; i++){
           for(int j = 1; j <= i; j++){
               if(j == i) {
                   System.out.print("@");
                   continue;
               }
               if(i == 6){
                   System.out.print("@");
                   continue;
               }
               if(j == 1) {
                   System.out.print("@");
                   continue;
               }
               System.out.print(" ");
           }
           System.out.println("");
       }
    }
}
//        @
//        @@
//        @ @
//        @  @
//        @   @
//        @@@@@@
