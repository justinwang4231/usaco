/*
ID: juwang1
LANG: JAVA
TASK: moocast
*/
import java.io.*;
import java.util.*;
import java.util.Collections;

class moocast {

  public static void main (String [] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("moocast.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("moocast.out")));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int n = Integer.parseInt(st.nextToken());
    int [] x = new int [n];
    int [] y = new int [n];
    int [] rad = new int [n];
    int [] sum = new int [n];
    int max=0;
    int wow=0;
    ArrayList<Integer> last=new ArrayList<Integer>();

    for(int i =0; i< n;i++){
    	st = new StringTokenizer(f.readLine());
    	x[i]=Integer.parseInt(st.nextToken());
    	y[i]=Integer.parseInt(st.nextToken());
    	rad[i]=Integer.parseInt(st.nextToken());
    }

    for(int i =0; i< n;i++){
    	last.clear();
    	last.add(i);
    	wow=rec(x,y,rad,i,sum,last);
    	if (wow>max)
    		max=wow;
    }

    out.println(max);
    out.close();
}

public static int rec(int [] a,int [] b,int [] rad,int i,int [] sum, ArrayList<Integer> last){
	//if(sum[i]!=0)
		//return sum[i];
	int[] temp= new int[200];
	int count = 0;
	int x = a[i];
	int y = b[i];
	int radi = rad[i];
	for (int j = 0; j<a.length;j++){
		if((a[j]-x)*(a[j]-x)+(b[j]-y)*(b[j]-y)<=radi*radi){//&&(x!=a[j]||y!=b[j])
			if(!(last.contains(j))){
		temp[count]=j;
		last.add(j);
		count++;}}
	}
	if (count==0){
		sum[i]=1;
		return 1;
	}
	int total=1;
	for(int pew=0;pew<count;pew++){
		total+=rec(a,b,rad,temp[pew],sum,last);
		//System.out.println(i);
	}
	//sum[i]=total;
	return total;
}

}
