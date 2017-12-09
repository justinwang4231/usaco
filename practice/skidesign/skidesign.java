/*
ID: juwang1
LANG: JAVA
TASK: skidesign
*/
import java.io.*;
import java.util.*;

class skidesign {
  public static void main (String [] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("skidesign.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("skidesign.out")));
    StringTokenizer st = new StringTokenizer(f.readLine());
    ArrayList<Integer> lmao = new ArrayList<Integer>();
    int n = Integer.parseInt(st.nextToken());

    for (int i =0; i<n;i++){
        st = new StringTokenizer(f.readLine());
        lmao.add(Integer.parseInt(st.nextToken()));
    }
    out.println();                           
    out.close();                        
  }
}