/*
ID: juwang1
LANG: JAVA
TASK: haybales
*/
import java.io.*;
import java.util.*;
import java.util.Collections;


class haybales {

  public static void main (String [] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("haybales.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("haybales.out")));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int n = Integer.parseInt(st.nextToken());
    int q = Integer.parseInt(st.nextToken());
    int[] place=new int[n];
    st = new StringTokenizer(f.readLine());

    for(int i=0;i<n;i++){
    	place[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(place);
    int low;
    int high;
    for(int i=0;i<q;i++){
    	st = new StringTokenizer(f.readLine());
    	low = Integer.parseInt(st.nextToken());
    	high = Integer.parseInt(st.nextToken());
    	out.println(indexOf(place,high)-indexOf2(place,low)+1);
    }
    out.close();
}

   public static int indexOf(int[] a, int key) {
        int lo = 0;
        int mid=0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        if (key > a[mid])
        return mid;
    	if (key < a[mid])
    	return mid-1;
    return -10000;
    }
    public static int indexOf2(int[] a, int key) {
        int lo = 0;
        int mid=0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        if (key > a[mid])
        return mid+1;
    	if (key < a[mid])
    	return mid;
    return -10000;
    }

}
