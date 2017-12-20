/*
ID: juwang1
LANG: JAVA
TASK: shuffle
*/
import java.io.*;
import java.util.*;
import java.util.Collections;


class shuffle {

  public static void main (String [] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("shuffle.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("shuffle.out")));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int m = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(f.readLine());
    int [] shuffle = new int[m]; 
    for (int i=0;i<m;i++){
    	shuffle[i]=Integer.parseInt(st.nextToken());
    }
    ArrayList<Integer> cows= new ArrayList<Integer>();
    ArrayList<Integer> cows2= new ArrayList<Integer>();
    for (int i=0;i<m;i++){
    	cows.add(i);
    }
    int poo=800;
    if (m>80000){
    	poo=30;
    }
    for (int i =0; i<poo;i++){
    	for (Integer d: cows){
    		cows2.add(shuffle[d]-1);
    	}
    	cows.clear();
    	for (Integer d: cows2){
    		cows.add(d);
    	}
    	cows2.clear();
    }
    Set<Integer> we = new LinkedHashSet<Integer>(cows);
    int total=we.size();

    out.println(total);
    out.close();
}
}
