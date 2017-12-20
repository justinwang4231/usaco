/*
ID: juwang1
LANG: JAVA
TASK: crypt1
*/
import java.io.*;
import java.util.*;
import java.util.Collections;


class crypt1 {

  public static void main (String [] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("crypt1.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("crypt1.out")));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int n = Integer.parseInt(st.nextToken());

    ArrayList<String> indices = new ArrayList<String>();
        st = new StringTokenizer(f.readLine());
    for (int i = 0;i<n;i++){
        indices.add((st.nextToken()));
    }
    int count = 0;
    for (String i: indices){
        for (String j: indices){
            for (String k: indices){
                for (String l: indices){
                    for (String m: indices){
                        if (check(indices,String.valueOf(Integer.parseInt(i+j+k)*Integer.parseInt(l+m)),4)||check(indices,String.valueOf(Integer.parseInt(i+j+k)*Integer.parseInt(l+m)),5)){
                            if (check(indices,String.valueOf(Integer.parseInt(i+j+k)*Integer.parseInt(l)),3)&&check(indices,String.valueOf(Integer.parseInt(i+j+k)*Integer.parseInt(m)),3)){
                                count++;
                            }
                        }
                    }
                }
            }
        }
    }

    out.println(count+"");
    out.close();
}
public static boolean check(ArrayList<String> indices,String f, int len){
    if (f.length()!=len){
        return false;
    }
    for (int i = 0; i < len; i++){
        if (!(indices.contains(String.valueOf(f.charAt(i))))){
            return false;
        }
    }
    return true;
}
}
