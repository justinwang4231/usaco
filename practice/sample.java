/*
ID: juwang1
LANG: JAVA
TASK: barn1
*/
import java.io.*;
import java.util.*;
import java.util.Collections;


class barn1 {

  public static void main (String [] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("barn1.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("barn1.out")));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int m = Integer.parseInt(st.nextToken());
    int s = Integer.parseInt(st.nextToken());

    out.println(total+"");
    out.close();
}
}
