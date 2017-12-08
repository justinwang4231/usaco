/*
ID: juwang1
LANG: JAVA
TASK: milk2
*/
import java.io.*;
import java.util.*;
import java.util.Collections;

class milk2 {
  public static void main (String [] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("milk2.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("milk2.out")));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int leng = Integer.parseInt(st.nextToken()); 
    ArrayList<Integer[]> indices = new ArrayList<Integer[]>();
    
    for (int i=0;i<leng;i++){
      st = new StringTokenizer(f.readLine());
      int start = Integer.parseInt(st.nextToken());
      int end = Integer.parseInt(st.nextToken());
      indices.add(new Integer[] {start,end});
    }

    Collections.sort(indices,new Comparator<Integer[]>() {
            public int compare(Integer[] strings, Integer[] otherStrings) {
                return strings[0].compareTo(otherStrings[0]);
            }
        });

    int currStart = (indices.get(0)[0]);
    int maxStop=0;
    int start;
    int end;
    int currEnd=(indices.get(0)[1]);
    int maxGo=currEnd-currStart;
    for (int i=0;i<indices.size();i++){
      start=(indices.get(i)[0]);
      end=(indices.get(i)[1]);
      if (currEnd<start){
        if (start-currEnd>maxStop){
          maxStop=start-currEnd;
          currStart=start;
          currEnd=end;
          if (currEnd-currStart>maxGo){
            maxGo=currEnd-currStart;
          }
        }
        else{
          currStart=start;
          currEnd=end;
          if (currEnd-currStart>maxGo){
            maxGo=currEnd-currStart;
          }
        }
      }
      else if (end>currEnd){
        currEnd=end;
        if (currEnd-currStart>maxGo)
        {
          maxGo=currEnd-currStart;
        }
      }
    }


    out.println(maxGo+" "+maxStop);                          
    out.close();                                 
  }
}
