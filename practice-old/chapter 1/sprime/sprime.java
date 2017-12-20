/*
ID: juwang1
LANG: JAVA
TASK: sprime
*/
import java.io.*;
import java.util.*;


class sprime {

  public static void main (String [] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("sprime.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sprime.out")));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int m = Integer.parseInt(st.nextToken());
    ArrayList<String> arr = new ArrayList<String>();
    ArrayList<String> newArr = new ArrayList<String>();
    arr.add("");

    for (int i=0;i<m;i++){
    	for (int j=0;j<arr.size();j++){
    		for (int z=1;z<10;z+=2){
    			if(isPrime((long)(Integer.parseInt(arr.get(j)+Integer.toString(z))))){
    				newArr.add(arr.get(j)+Integer.toString(z));
    			}
    		}
    		if(i==0)
    		newArr.add(0,"2");
    	}
    	arr.clear();
    	for(String zi: newArr){
    		arr.add(zi);
    	}
    	newArr.clear();
    }
for(String zi: arr){
    		out.println(zi);
    	}
    out.close();
}

public static boolean isPrime(long n) {
    if(n < 2) return false;
    if(n == 2 || n == 3) return true;
    if(n%2 == 0 || n%3 == 0) return false;
    long sqrtN = (long)Math.sqrt(n)+1;
    for(long i = 6L; i <= sqrtN; i += 6) {
        if(n%(i-1) == 0 || n%(i+1) == 0) return false;
    }
    return true;
}

}
