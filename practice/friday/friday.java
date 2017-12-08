/*
ID: juwang1
LANG: JAVA
TASK: friday
*/
import java.io.*;
import java.util.*;

class friday {
  public static void main (String [] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("friday.in"));
                                                  // input file name goes above
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));
    // Use StringTokenizer vs. readLine/split -- lots faster
int arr[]={0,0,0,0,0,0,0};
    StringTokenizer st = new StringTokenizer(f.readLine());
	int curr=0;			  // Get line, break into tokens
    int i1 = Integer.parseInt(st.nextToken());    // first integer
	for (int i = 1900; i<1900+i1;i++){
		if (i%400==0)
{
arr[curr]=arr[curr]+1;
curr=(curr+31)%7;
arr[curr]=arr[curr]+1;
curr=(curr+29)%7;
arr[curr]=arr[curr]+1;
curr=(curr+31)%7;
arr[curr]=arr[curr]+1;
curr=(curr+30)%7;
arr[curr]=arr[curr]+1;
curr=(curr+31)%7;
arr[curr]=arr[curr]+1;
curr=(curr+30)%7;
arr[curr]=arr[curr]+1;
curr=(curr+31)%7;
arr[curr]=arr[curr]+1;
curr=(curr+31)%7;
arr[curr]=arr[curr]+1;
curr=(curr+30)%7;
arr[curr]=arr[curr]+1;
curr=(curr+31)%7;
arr[curr]=arr[curr]+1;
curr=(curr+30)%7;
arr[curr]=arr[curr]+1;
curr=(curr+31)%7;
}
else if (i%100==0)
{
arr[curr]=arr[curr]+1;
curr=(curr+31)%7;
arr[curr]=arr[curr]+1;
curr=(curr+28)%7;
arr[curr]=arr[curr]+1;
curr=(curr+31)%7;
arr[curr]=arr[curr]+1;
curr=(curr+30)%7;
arr[curr]=arr[curr]+1;
curr=(curr+31)%7;
arr[curr]=arr[curr]+1;
curr=(curr+30)%7;
arr[curr]=arr[curr]+1;
curr=(curr+31)%7;
arr[curr]=arr[curr]+1;
curr=(curr+31)%7;
arr[curr]=arr[curr]+1;
curr=(curr+30)%7;
arr[curr]=arr[curr]+1;
curr=(curr+31)%7;
arr[curr]=arr[curr]+1;
curr=(curr+30)%7;
arr[curr]=arr[curr]+1;
curr=(curr+31)%7;
}
else if (i%4==0)
{
arr[curr]=arr[curr]+1;
curr=(curr+31)%7;
arr[curr]=arr[curr]+1;
curr=(curr+29)%7;
arr[curr]=arr[curr]+1;
curr=(curr+31)%7;
arr[curr]=arr[curr]+1;
curr=(curr+30)%7;
arr[curr]=arr[curr]+1;
curr=(curr+31)%7;
arr[curr]=arr[curr]+1;
curr=(curr+30)%7;
arr[curr]=arr[curr]+1;
curr=(curr+31)%7;
arr[curr]=arr[curr]+1;
curr=(curr+31)%7;
arr[curr]=arr[curr]+1;
curr=(curr+30)%7;
arr[curr]=arr[curr]+1;
curr=(curr+31)%7;
arr[curr]=arr[curr]+1;
curr=(curr+30)%7;
arr[curr]=arr[curr]+1;
curr=(curr+31)%7;
}
else
{
arr[curr]=arr[curr]+1;
curr=(curr+31)%7;
arr[curr]=arr[curr]+1;
curr=(curr+28)%7;
arr[curr]=arr[curr]+1;
curr=(curr+31)%7;
arr[curr]=arr[curr]+1;
curr=(curr+30)%7;
arr[curr]=arr[curr]+1;
curr=(curr+31)%7;
arr[curr]=arr[curr]+1;
curr=(curr+30)%7;
arr[curr]=arr[curr]+1;
curr=(curr+31)%7;
arr[curr]=arr[curr]+1;
curr=(curr+31)%7;
arr[curr]=arr[curr]+1;
curr=(curr+30)%7;
arr[curr]=arr[curr]+1;
curr=(curr+31)%7;
arr[curr]=arr[curr]+1;
curr=(curr+30)%7;
arr[curr]=arr[curr]+1;
curr=(curr+31)%7;
}
}
String fe = "";
for (int i =0;i<7;i++)
{
fe=fe+((arr[i]))+" ";
}
	fe=fe.substring(0,fe.length()-1);
    out.println(fe);                           // output result
    out.close();                                  // close the output file
  }
}

