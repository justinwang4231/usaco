/*
ID: juwang1
LANG: JAVA
TASK: palsquare
*/
import java.io.*;
import java.util.*;
//import java.util.Collections;


class palsquare {

  public static void main (String [] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("palsquare.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("palsquare.out")));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int num = Integer.parseInt(st.nextToken());
    int count=1;
    for (int i =0; i < 300; i++)
    {
        if (isPalindrome(count*count,num)){
            out.println(Long.toString(count, num).toUpperCase()+" "+Long.toString(count*count,num).toUpperCase());
        }
        count++;
    }
    out.close();

}

public static boolean isPalindrome(int integer, int base) {
    String intStr = Long.toString(integer, base);
    System.out.println(intStr);
    return intStr.equals(new StringBuilder(intStr).reverse().toString());
}
}
