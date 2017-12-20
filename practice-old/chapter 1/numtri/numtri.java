/*
ID: juwang1
LANG: JAVA
TASK: numtri
*/
import java.io.*;
import java.util.*;
import java.util.Collections;


class numtri {

  public static void main (String [] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("numtri.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("numtri.out")));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int m = Integer.parseInt(st.nextToken());

    int[][] whack =new int [m][m];

    for (int i=0;i<m;i++){
    	st = new StringTokenizer(f.readLine());
    	for(int j=0;j<i+1;j++){
    		whack[i][j]=Integer.parseInt(st.nextToken());
    	}
    }

    for(int i=m-2;i>=0;i--){
    	for (int j=0;j<=i;j++){
    		if (whack[i+1][j]>=whack[i+1][j+1]){
    			whack[i][j]=whack[i+1][j]+whack[i][j];
    		}
    		else {
    			whack[i][j]=whack[i+1][j+1]+whack[i][j];
    		}
    	}
    }
    //for (int i=0;i<m;i++){
    //	for (int j=0;j<m;j++){
    //		System.out.println(whack[i][j]);
    //	}
    //}

    out.println(whack[0][0]);
    out.close();
}
}
