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
    int n = Integer.parseInt(st.nextToken());
    int[][] whew=new int[n][m];

    for(int i=0;i<n;i++){
    	st = new StringTokenizer(f.readLine());
    	for(int j = 0; j<m;j++){
    		whew[i][j]=Integer.parseInt(st.nextToken());
    	}
    }

    out.println();
    out.close();
}
}
