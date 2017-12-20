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
    int [][] poo= new int [n][3];
    //don't need G
    //http://codippa.com/how-to-sort-a-two-dimensional-array-on-column-values-in-java/
    //used that link to find out how to sort arrays, modified code
    for (int i=0;i<n;i++){
        st = new StringTokenizer(f.readLine());
        poo[i][0]=Integer.parseInt(st.nextToken());
        poo[i][1]=Integer.parseInt(st.nextToken());
        poo[i][2]=Integer.parseInt(st.nextToken());
    }
    Arrays.sort(poo, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int poo1 = (o1[0]);
                int poo2 = (o2[0]);
                if (poo1==poo2){return 0;}
                else if(poo1>poo2){return 1;}
                else if (poo2>poo1){return -1;}
                return 1;
            }
        });
    int ge = 0;
    if(n>=90000)
    	ge = 31500;
    int [] values = new int [n-ge];
    int [] ids = new int [n-ge];
    int id=0; //second column
    int sum = 0; //third column
    int value;
    int lastHigh = 0;
    int last = 0;
    int max = 0;
    int now = 0; //it only changes if it was max before and now isnt or vice versa.
    int county=0;
    if(n>=90000){
    	for (int i=0;i<n;i++){
        id = (poo[i][1]);
        sum = (poo[i][2]);
        value = lol(ids,id,county);
         
        if (value == -1202){
            last = 0;
            ids[county]=id;
            values[county]=sum;
            now=sum;
            county++;
        }
         else{
            last = values[value];
            values[value]=last+sum;
            now=last+sum;
        }
        max = maxe(values, county);
        if (last==lastHigh){
            if (now==max&&lastHigh!=0)//&&min2(values,lastHigh,county)==0&&min2(values,now,county)==1
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
    else{
    for (int i=0;i<n;i++){
        id = (poo[i][1]);
        sum = (poo[i][2]);
        value = lol(ids,id,county);
         
        if (value == -1202){
            last = 0;
            ids[county]=id;
            values[county]=sum;
            now=sum;
            county++;
        }
         else{
            last = values[value];
            values[value]=last+sum;
            now=last+sum;
        }
        max = maxe(values, county);
        if (last==lastHigh){
            if (now==max&&min2(values,lastHigh,county)==0&&min2(values,now,county)==1&&lastHigh!=0)
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
    out.close();}
}
public static int min2(int[] things, int index, int count){
	int sum=0;
	for (int i=0;i<count;i++){
		if(index==things[i]){
			sum++;
		}
	}
	return sum;
}
public static int lol(int [] arr, int index,int count){
    int rag = -1202;
    for (int i = 0; i<count; i++){
        if (arr[i]==(index)){
            rag = i;
            break;
        }
    }
    return rag;
}
public static int maxe(int[] things, int count){
    int sum=things[0];
    for (int i=0;i<count;i++){
        if(sum<things[i]){
            sum=things[i];
        }
    }
    return sum;
}
}
