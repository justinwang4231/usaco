/*
ID: juwang1
LANG: JAVA
TASK: castle
*/
import java.io.*;
import java.util.*;
import java.util.Collections;


class castle {

  public static void main (String [] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("castle.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("castle.out")));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int m = Integer.parseInt(st.nextToken());
    int s = Integer.parseInt(st.nextToken());

    out.println(total+"");
    out.close();
}
}
