/*
ID: juwang1
LANG: JAVA
TASK: transform
*/
import java.io.*;
import java.util.*;
//import java.util.Collections;


public class transform {

  public static void main (String [] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("transform.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("transform.out")));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int leng = Integer.parseInt(st.nextToken()); 
    ArrayList<String> sq1=new ArrayList<String>();
    ArrayList<String> sq2=new ArrayList<String>();
    int [][]rotated;

    for (int i=0;i<leng;i++){
      st = new StringTokenizer(f.readLine());
      sq1.add(st.nextToken());
    }

    for (int i=0;i<leng;i++){
      st = new StringTokenizer(f.readLine());
      sq2.add(st.nextToken());
    }

    rotated=rotate(sq1,leng);
    if (compare(rotated,sq2,leng)==true){
    out.println("1");                          
    out.close(); 
    System.exit(0);
    }

    rotated=rotate2(rotated,leng);
    if (compare(rotated,sq2,leng)){
    out.println("2");                          
    out.close(); 
    System.exit(0);
    }


    rotated=rotate2(rotated,leng);
    if (compare(rotated,sq2,leng)){
    out.println("3");                          
    out.close(); 
    System.exit(0);
    }

    rotated=reflect(sq1,leng);
    if (compare(rotated,sq2,leng)){
    out.println("4");                          
    out.close(); 
    System.exit(0);
    }

    rotated=reflect(sq1,leng);
    rotated=rotate2(rotated,leng);
    if (compare(rotated,sq2,leng)){
    out.println("5");                          
    out.close(); 
    System.exit(0);
    }

    rotated=reflect(sq1,leng);
    rotated=rotate2(rotated,leng);
    rotated=rotate2(rotated,leng);
    if (compare(rotated,sq2,leng)){
    out.println("5");                          
    out.close(); 
    System.exit(0);
    }

    rotated=reflect(sq1,leng);
    rotated=rotate2(rotated,leng);
    rotated=rotate2(rotated,leng);
    rotated=rotate2(rotated,leng);
    if (compare(rotated,sq2,leng)){
    out.println("5");                          
    out.close(); 
    System.exit(0);
    }

    if (compare2(sq1,sq2,leng)){
    out.println("6");                          
    out.close(); 
    System.exit(0);
    }

    out.println("7");                          
    out.close(); 
                           
  }


public static boolean compare2 (ArrayList<String> pass1, ArrayList<String> pass2, int n){
    for (int i = 0; i < n; i++){
        for (int j =0; j<n; j++){
            if (pass1.get(i).charAt(j) != pass2.get(i).charAt(j)){
              return false;
        }
    }   
    
}
return true;
}
public static boolean compare (int [][] passedIn, ArrayList<String> pass2, int n){
    for (int i = 0; i < n; i++){
        for (int j =0; j<n; j++){
            if (passedIn[i][j] != pass2.get(i).charAt(j)){
              return false;
        }
    }   
    
}
return true;
}

public static int [][] reflect (ArrayList<String> passedIn, int n){
    int [][] newarray = new int [n][n];
    for (int i = 0; i < n; i++){
        for (int j =0; j<n; j++){
            newarray[i][j] = passedIn.get(i).charAt(n-1-j);
        }
    }   
    return newarray;
}

public static int [][] rotate (ArrayList<String> passedIn, int n){
    int [][] newarray = new int [n][n];
    for (int i = 0; i < n; i++){
        for (int j =0; j<n; j++){
            newarray[i][j] = passedIn.get(n-1-j).charAt(i);
        }
    }   
    return newarray;
}
public static int [][] rotate2 (int [][] passedIn, int n){
    int [][] newarray = new int [n][n];
    for (int i = 0; i < n; i++){
        for (int j =0; j<n; j++){
            newarray[i][j] = passedIn[n-1-j][i];
        }
    }   
    return newarray;
}
}
