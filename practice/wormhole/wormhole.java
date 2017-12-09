/*
ID: juwang1
LANG: JAVA
TASK: wormhole
*/
import java.io.*;
import java.util.*;

class wormhole {
  public static void main (String [] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("wormhole.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("wormhole.out")));
    StringTokenizer st = new StringTokenizer(f.readLine());
    ArrayList<Integer[]> lmao = new ArrayList<Integer[]>();
    int n = Integer.parseInt(st.nextToken());
    int a;
    int b;
    for (int i =0; i<n;i++){
        st = new StringTokenizer(f.readLine());
        a=Integer.parseInt(st.nextToken());
        b=Integer.parseInt(st.nextToken());
        lmao.add(new Integer[] {b,a});
    }
    Collections.sort(lmao,new Comparator<Integer[]>() {
            public int compare(Integer[] strings, Integer[] otherStrings) {
                return ((strings[0])).compareTo((otherStrings[0]));
            }
        });
    String nums = "";
    for (int i = 0; i < n; i++){
        nums += Integer.toHexString(i);
    }
    ArrayList<String> re = new ArrayList<String>();
    generate(re,"",nums,n);

/*for (String d: re){
        System.out.println(d);
    }*/
/*for (Integer[] d: lmao){
        System.out.print(d[0] + " ");
        System.out.println(d[1]);
    }*/
    int re2 = checks(lmao,re,n);

    out.println(re2);                           
    out.close();                        
  }
public static boolean run(ArrayList<Integer[]> lmao, String gen, int pos){
    for (int i = 0; i < gen.length()+30;i++)
        {
            if(i%2==0)
            {
                if ((int)(Long.parseLong(gen.substring(pos,pos+1),16))+1==gen.length()){
                    return false;
                }
                else if (!(lmao.get((int)(Long.parseLong(gen.substring(pos,pos+1),16)))[0].equals(lmao.get(1+(int)(Long.parseLong(gen.substring(pos,pos+1),16)))[0]))){
                    return false;
                }
                else {
                    pos=gen.indexOf(Integer.toString((int)(Long.parseLong(gen.substring(pos,pos+1),16))+1,16));
                }
            }
        else{
            if (pos%2==0){
                pos++;
            }
            else{
                pos-=1;
            }
        }
        }
        return true;
  }

  public static boolean check(ArrayList<Integer[]> lmao, String gen){
    for (int i = 0; i < gen.length();i++)
        {

                if((run(lmao,gen,i)))
                {
                    return true;
                }

        }
        return false;
  }

  public static void generate(ArrayList<String> woo,String curr,String input, int n){
    if (n==2){
        curr+=(input.charAt(0));
        curr+=(input.charAt(1));
        woo.add(curr);
    }
    else{
        for (int i = 1; i<n; i++){
            generate(woo,curr+input.charAt(0)+input.charAt(i),(input.substring(0,i)+input.substring(i+1)).substring(1),n-2);
        }
    }
  }

  public static int checks(ArrayList<Integer[]> lmao, ArrayList<String> lmao2,int n){
    int count=0;
    for (String gen:lmao2){
        if(check(lmao,gen)){
            count++;
        }
    }
    return count;
  }

}