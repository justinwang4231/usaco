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
    int total=0;
    int low=1000000000;

    for (int i =0; i<n;i++){
        st = new StringTokenizer(f.readLine());
        lmao.add(Integer.parseInt(st.nextToken()));
    }

    for (int i =0;i<79;i++){
        //i, i+17
        total=0;
        for (Integer p: lmao)
        {
            if (p>=i &&p<=i+17){
                continue;
            }
            else if (p < i){
                total += (i-p)*(i-p);
            }
            else if (p > i+17){
                total += (p-i-17)*(p-i-17);
            }
        }
        if (total<low){
            low=total;
        }
    }

    out.println(low);                           
    out.close();                        
  }
}