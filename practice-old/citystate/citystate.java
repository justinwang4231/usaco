/*
ID: juwang1
LANG: JAVA
TASK: citystate
*/
import java.io.*;
import java.util.*;
import java.util.Collections;


class citystate {

  public static void main (String [] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("citystate.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("citystate.out")));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int n = Integer.parseInt(st.nextToken());
    int wow=0;
    String [] lmao = new String [n];
    int count=0;
    for(int i=0;i<n;i++){
    	st = new StringTokenizer(f.readLine());
    	lmao[i]=st.nextToken().substring(0,2)+st.nextToken();
    }
    Arrays.sort(lmao);

    for(int i=0;i<n;i++){
wow=binarySearch(lmao,lmao[i].substring(2,4)+lmao[i].substring(0,2));
    	if (wow!=-1 && !(lmao[i].substring(2,4).equals(lmao[i].substring(0,2)))){
    		for (int j = wow; j< lmao.length;j++){
    		if(lmao[j].equals(lmao[i].substring(2,4)+(lmao[i].substring(0,2))))
    		count++;
    	else{
    		break;
    	}}
    	for (int j = wow-1; j>=0;j-=1){
    		if(lmao[j].equals(lmao[i].substring(2,4)+(lmao[i].substring(0,2))))
    		count++;
    	else{
    		break;
    	}}
    	}
    }

    out.println(count/2);
    out.close();
}
 public static int binarySearch(String[] a, String x) {
        int low = 0;
        int high = a.length - 1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;

            if (a[mid].compareTo(x) < 0) {
                low = mid + 1;
            } else if (a[mid].compareTo(x) > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

}
