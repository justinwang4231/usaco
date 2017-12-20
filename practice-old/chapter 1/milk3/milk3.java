/*
ID: juwang1
LANG: JAVA
TASK: milk3
*/
import java.io.*;
//dumb, uses random solution. recursive DFS is better lol
import java.util.*;

class milk3 {
  public static void main (String [] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("milk3.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("milk3.out")));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int maxA = Integer.parseInt(st.nextToken());
    int maxB = Integer.parseInt(st.nextToken());
    int maxC = Integer.parseInt(st.nextToken());
    ArrayList<Integer> lmao= new ArrayList<Integer>();
    Random rand=new Random();
    int a=0;
    int b=0;
    int c=(int)(maxC);
    int rando=0;
    int[] ya;

    for (int x=0;x<15000000;x++){
        for (int y = 0;y<1;y++){
          rando=rand.nextInt(6);
          
          if (rando==0){
            ya=pour(a,b,maxA,maxB);
            a=ya[0];
            b=ya[1];
          }
          else if (rando==1)
          {
            ya=pour(b,c,maxB,maxC);
            b = ya[0];
            c = ya[1];
          }
          else if (rando==2)
          {
            ya=pour(a,c,maxA,maxC);
            a = ya[0];
            c = ya[1];
          }
          else if (rando==3)
          {
            ya=pour(c,b,maxC,maxB);
            c = ya[0];
            b = ya[1];
          }
          else if (rando==4)
          {
            ya=pour(b,a,maxB,maxA);
            b = ya[0];
            a = ya[1];
          }
          else{
            ya=pour(c,a,maxC,maxA);
            c = ya[0];
            a = ya[1];
          }
        }
        if (a==0 && !(lmao.contains(c))){
          lmao.add(c);
        }
        //System.out.println(""+a+" "+b+" "+c);
    }
    Collections.sort(lmao);
    String wa="";
    for (Integer gay:lmao){
    wa+=gay.toString();
    wa+=" ";}
    wa=wa.substring(0,wa.length()-1);
    out.println(wa);                         
    out.close();                        
  }
  public static int[] pour (int a,int b, int maxA, int maxB){
      int [] x = new int[2];
      if (a+b<=maxB){
          x[0]=0;
          x[1]=a+b;
      }
      else{
          x[0]=a+b-(maxB);
          x[1]=maxB;
      }
      return x;
  }
}