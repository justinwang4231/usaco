/*
ID: juwang1
LANG: JAVA
TASK: measurement
*/
import java.io.*;
import java.util.*;
import java.util.Collections;


class measurement {

  public static void main (String [] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("measurement.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("measurement.out")));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int n = Integer.parseInt(st.nextToken());
    int count=0;
    String parse = "";
    String [][] poo= new String [n][3];
    //don't need G
    //http://codippa.com/how-to-sort-a-two-dimensional-array-on-column-values-in-java/
    //used that link to find out how to sort arrays, modified code
    for (int i=0;i<n;i++){
    	st = new StringTokenizer(f.readLine());
    	poo[i][0]=(st.nextToken());
    	poo[i][1]=(st.nextToken());
    	poo[i][2]=(st.nextToken());
    }
    Arrays.sort(poo, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				Integer poo1 = Integer.parseInt(o1[0]);
				Integer poo2 = Integer.parseInt(o2[0]);
				return poo1.compareTo(poo2);
			}
		});

    Map<String, Integer> dictionary = new HashMap<String, Integer>();
    String id=""; //second column
    int sum = 0; //third column
    Integer value;
    int lastHigh = 0;
    int last = 0;
    int max = 0;
    int now = 0; //it only changes if it was max before and now isnt or vice versa.

    for (int i=0;i<n;i++){
    	id = poo[i][1];
    	sum = Integer.parseInt(poo[i][2]);
    	value = dictionary.get(id);
    	if (value != null) {
    		last = value;
			dictionary.put(id,value+sum);
			now=value+sum;
		} 
		else {
			last = 0;
			dictionary.put(id,sum);
			now=sum;
		}
		max = Collections.max(dictionary.values());
		if (last==lastHigh){
			if (lastHigh==0)
				count++;
			else if (now==max&&Collections.frequency(dictionary.values(),lastHigh)==0&&Collections.frequency(dictionary.values(),now)==1)
				count+=0;
			else
				count++;
		}
		else if (now>=lastHigh && last<now){
			count++;
		}
		lastHigh = max;
		if (lastHigh<0)
			lastHigh=0;
    }

    out.println(count);
    out.close();
}
}
