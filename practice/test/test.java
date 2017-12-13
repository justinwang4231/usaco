/*
ID: juwang1
LANG: JAVA
TASK: test
*/
import java.io.*;
import java.util.*;
import java.util.Collections;


class test {

  public static void main (String [] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("test.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("test.out")));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int m = Integer.parseInt(st.nextToken());
    int s = Integer.parseInt(st.nextToken());

    out.println(total+"");
    out.close();
}
}
