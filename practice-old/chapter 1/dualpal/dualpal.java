/*
ID: juwang1
LANG: JAVA
TASK: dualpal
*/
import java.io.*;
import java.util.*;
//import java.util.Collections;


class dualpal {

  public static void main (String [] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("dualpal.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("dualpal.out")));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int num1 = Integer.parseInt(st.nextToken());
    int num2 = Integer.parseInt(st.nextToken())+1;
    int check;
    for (int i = 0; i < num1; i++){
        while (true){
            check=0;
            for(int j = 2; j<= 10;j++){
                if (isPalindrome(num2,j)){
                    check++;
                }
            }
            if (check >=2){
                out.println(num2);
                break;
            }
            num2++;
        }
        num2++;
    }
    out.close();
}

public static boolean isPalindrome(int integer, int base) {
    String intStr = Long.toString(integer, base);
    return intStr.equals(new StringBuilder(intStr).reverse().toString());
}
}
