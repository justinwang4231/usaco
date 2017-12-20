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
    int c = Integer.parseInt(st.nextToken());


    ArrayList<Integer> indices = new ArrayList<Integer>();

    for (int i = 0;i<c;i++){
        st = new StringTokenizer(f.readLine());
        indices.add(Integer.parseInt(st.nextToken()));
    }
    if (m>=indices.size()){
        out.println(indices.size());
        out.close();
        System.exit(0);
    }
    Collections.sort(indices);
    System.out.print(indices.size());
    ArrayList<Integer> differences = new ArrayList<Integer>();
    int total = indices.get(indices.size()-1)-indices.get(0)+1;
    for (int i = 0; i < indices.size()-1;i++){
        differences.add(indices.get(i+1)-indices.get(i)-1);
    }
    Collections.sort(differences,Collections.reverseOrder());
    for (int i = 0; i < m-1; i++){
        total-=differences.get(0);
        differences.remove(0);
    }

    out.println(total+"");
    out.close();
}
}
