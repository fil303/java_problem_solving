import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String line = sn.nextLine();
        int count = 0;
        String[] allKeys = line.split(" ");
        String[] uniqKeys = getUniqueKeys(allKeys);
        for (String uniq: uniqKeys){
            for(String key: allKeys){
                if(uniq.equals(key)) count++;
            }
            System.out.println("this [ "+uniq+" ] is "+count+" time");
            count = 0;
        }
    }

    private static String[] getUniqueKeys(String[] keys)
    {
       ArrayList<String> uniq = new ArrayList<String>();
       int c = 0;
       uniq.add(keys[0]);
       for(String key: keys){
           if(!uniq.contains(key)) uniq.add(key);
       }
       String[] u = new String[uniq.size()];
       Iterator<String> i = uniq.iterator();
       while (i.hasNext()){
           u[c] = i.next();
           c++;
       }
       return u ;
    }
}
