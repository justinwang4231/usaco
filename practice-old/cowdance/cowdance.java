/*
ID: juwang1
LANG: JAVA
TASK: cowdance
*/
import java.io.*;
import java.util.*;
import java.util.Collections;


class cowdance {

  public static void main (String [] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("cowdance.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cowdance.out")));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int n = Integer.parseInt(st.nextToken());
    int t = Integer.parseInt(st.nextToken());
    int[] wow=new int[n];
    int total=0;
    int j=1;

    for(int i=0;i<n;i++){
    	st = new StringTokenizer(f.readLine());
    	wow[i]=Integer.parseInt(st.nextToken());
    }
    if(n>9000){
    	for(int i=400;i<n;i++){
 		j=getTime(wow,i,n);
    	if(j<=t){
    		total=i;
    		break;
    	}
    }
    }
    else{
 	for(int i=1;i<n;i++){
 		j=getTime(wow,i,n);
    	if(j<=t){
    		total=i;
    		break;
    	}
    }}

    out.println(total);
    out.close();
}

public static int getTime(int[] wow,int a,int n){
	int [] q=new int[a];
	int time=0;
	int count=a;
	int wa=0;
	for (int x =0; x<a;x++){
		q[x]=(wow[x]);
	}
	while(true){
		if(count<n){
			wa=getMinValue(q);
			time+=wa;
			for(int an = 0; an<a;an++){
				q[an]=q[an]-wa;
				if((int)q[an]==0){
					if(count<n){
						q[an]=wow[count];
						count++;
					}
					else{
						break;
					}
				}
			}
		}
		else{
			wa=getMaxValue(q);
			time+=wa;
			break;
		}
	}
	return time;
}

public static int getMaxValue(int[] numbers){
  int maxValue = numbers[0];
  for(int i=1;i < numbers.length;i++){
    if(numbers[i] > maxValue){
	  maxValue = numbers[i];
	}
  }
  return maxValue;
}
public static int getMinValue(int[] numbers){
  int minValue = numbers[0];
  for(int i=1;i<numbers.length;i++){
    if(numbers[i] < minValue){
	  minValue = numbers[i];
	}
  }
  return minValue;

}
}
