/*
ID: juwang1
LANG: JAVA
TASK: namenum
*/
import java.io.*;
import java.util.*;
//import java.util.Collections;


public class namenum {

  public static void main (String [] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("namenum.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("namenum.out")));
    StringTokenizer st = new StringTokenizer(f.readLine());
    ArrayList<String> names=new ArrayList<String>();
    String num = (st.nextToken());
    System.out.print(check("KRISTOPHER","5747867437"));
    f = new BufferedReader(new FileReader("dict.txt"));
    st = new StringTokenizer(f.readLine());
    while (st.hasMoreTokens()){
        String numm = (st.nextToken());
        if(check(numm,num)){
            names.add(numm);
        }
        if (!(numm.equals("ZYTA"))){
        st = new StringTokenizer(f.readLine());}
    }
    if (names.size()==0){
        out.println("NONE");
    }
    else{
        for (int i =0; i < names.size();i++)
        {
            out.println(names.get(i));
        }
    }
    out.close();
//3*Character.getNumericValue(num.charAt(0))+59<=(int)(numm.charAt(0)) && 3*Character.getNumericValue(num.charAt(0))+61>=(int)(numm.charAt(0)) && numm.length()==num.length()
}

public static boolean check (String numm, String num){
    if (numm.length()!=num.length()){
        return false;
    }
    for (int i = 0; i < num.length(); i++){
        if (Character.getNumericValue(num.charAt(i))<=6&&!(3*Character.getNumericValue(num.charAt(i))+59<=(int)(numm.charAt(i)) && 3*Character.getNumericValue(num.charAt(i))+61>=(int)(numm.charAt(i))))
        {
            return false;
        }
        else if (Character.getNumericValue(num.charAt(i))>7&&!(3*Character.getNumericValue(num.charAt(i))+60<=(int)(numm.charAt(i)) && 3*Character.getNumericValue(num.charAt(i))+62>=(int)(numm.charAt(i)))){
            return false;
        }
        else if (Character.getNumericValue(num.charAt(i))==7&&!((numm.charAt(i))=='P'||(numm.charAt(i))=='R'||(numm.charAt(i))=='S')){
            return false;
        }
    }      
return true;
}


}
