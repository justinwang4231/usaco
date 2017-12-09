/*
ID: juwang1
LANG: JAVA
TASK: combo
*/
import java.io.*;
import java.util.*;
import static java.lang.Math.*;
//import java.util.Collections;


class combo {

  public static void main (String [] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("combo.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("combo.out")));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int n = Integer.parseInt(st.nextToken());
    int count=0;

    ArrayList<Integer> indices = new ArrayList<Integer>();
    st = new StringTokenizer(f.readLine());
    for (int i = 0;i<3;i++){
        indices.add(Integer.parseInt(st.nextToken()));
    }

    ArrayList<Integer> indices1 = new ArrayList<Integer>();
    st = new StringTokenizer(f.readLine());
    for (int i = 0;i<3;i++){
        indices1.add(Integer.parseInt(st.nextToken()));
    }

    for (int i = 0; i< n; i++){
        for (int j = 0; j< n; j++){
            for (int k = 0; k< n; k++){
                if (check(i,j,k,indices, n)){
                    count++;
                }
                else if(check(i,j,k,indices1, n)){
                    count++;
                }
            }
        }
    }

    out.println(count+"");
    out.close();
}

public static boolean check(int i, int j, int k, ArrayList<Integer> indices, int n){
    int count=0;
    for (int w = 0; w < 5; w++){
        if (Math.floorMod(i-2+w,n)!=Math.floorMod(indices.get(0),n)){
            count++;
        }
    }
    if (count==5){
        return false;
    }
    count=0;
    for (int w = 0; w < 5; w++){
        if (Math.floorMod(j-2+w,n)!=Math.floorMod(indices.get(1),n)){
            count++;
        }
    }
    if (count==5){
        return false;
    }
    count=0;
    for (int w = 0; w < 5; w++){
        if (Math.floorMod(k-2+w,n)!=Math.floorMod(indices.get(2),n)){
            count++;
        }
    }
    if (count==5){
        return false;
    }
    return true;
}
}
