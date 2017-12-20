/*
ID: juwang1
LANG: JAVA
TASK: homework
*/
import java.io.*;
import java.util.*;
import java.util.Collections;


class homework {

  public static void main (String [] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("homework.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("homework.out")));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int n = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(f.readLine());
    int[] things = new int[n];
    for(int i=0;i<n;i++){
    	things[i]=Integer.parseInt(st.nextToken());
    }
    //calc average/min in clever way, only calculating if you need and store in array (only n-2 possible)
    double[] averages=new double[n-2];
    int min=min(things);
    int currSum=sum(things);
    int average=0;
    int check=0;

    for(int i =0;i<n-2;i++){
    	currSum-=things[i];
    	check=things[i];
    	if (check==min){
    		min=min2(things,i);
    	}
    	averages[i]=(double)(currSum-min)/(n-2-i);
    }
    double max=max(averages);

    for (int i=0;i<n-2;i++){
    	if (averages[i]==max){
    		out.println(i+1);
    	}
    }
    out.close();
}
public static int min(int[] things){
	int sum=things[0];
	for (int i=0;i<things.length;i++){
		if(sum>things[i]){
			sum=things[i];
		}
	}
	return sum;
}

public static int min2(int[] things, int index){
	int sum=things[0];
	for (int i=index;i<things.length;i++){
		if(sum>things[i]){
			sum=things[i];
		}
	}
	return sum;
}

public static int sum(int[] things){
	int sum=0;
	for (int i=0;i<things.length;i++){
		sum+=things[i];
	}
	return sum;
}

public static double max(double[] things){
	double sum=things[0];
	for (int i=0;i<things.length;i++){
		if(sum<things[i]){
			sum=things[i];
		}
	}
	return sum;
}
}
