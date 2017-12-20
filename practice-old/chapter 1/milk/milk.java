/*
ID: juwang1
LANG: JAVA
TASK: milk
*/
import java.io.*;
import java.util.*;
//import java.util.Collections;


class milk {

  public static void main (String [] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("milk.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("milk.out")));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int curr =0;
    int count=0;
    int total=0;
    ArrayList<Integer[]> indices = new ArrayList<Integer[]>();
    if (n==0||m==0){
            out.println("0");
    out.close();
            System.exit(0);}
    for (int i = 0; i < m; i++){
        st = new StringTokenizer(f.readLine());
        indices.add(new Integer[] {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())});
    }

    Collections.sort(indices,new Comparator<Integer[]>() {
            public int compare(Integer[] strings, Integer[] otherStrings) {
                return strings[0].compareTo(otherStrings[0]);
            }
        });

    while (true){
        if (curr+indices.get(count)[1]>=n){
            total+=(n-curr)*indices.get(count)[0];
            break;
        }
        else{
            total+=indices.get(count)[1]*indices.get(count)[0];

            curr += indices.get(count)[1];
            count++;
        }
    }
    out.println(total);
    out.close();
}
}
