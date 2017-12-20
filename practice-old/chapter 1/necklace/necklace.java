/*
ID: juwang1
LANG: JAVA
TASK: beads
*/
import java.io.*;
import java.util.*;

class beads {
  public static void main (String [] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("beads.in"));
                                                  // input file name goes above
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")));
    // Use StringTokenizer vs. readLine/split -- lots faster
    StringTokenizer st = new StringTokenizer(f.readLine());
	int curr=0;			  // Get line, break into tokens
    int i1 = Integer.parseInt(st.nextToken());    // first integer
	st = new StringTokenizer(f.readLine());
	String beads=st.nextToken();
	ArrayList<Integer> blue = new ArrayList<Integer>();
ArrayList<Integer> red = new ArrayList<Integer>();
if (!beads.contains("b")&&!beads.contains("r"))
{
out.println(beads.length());                           // output result
    out.close();
System.exit(0);
}
else if (beads.contains("b")&&!beads.contains("r"))
{
out.println(beads.length());                           // output result
    out.close();
System.exit(0);
}
else if (!beads.contains("b")&&beads.contains("r"))
{
out.println(beads.length());                           // output result
    out.close();
System.exit(0);
}
String beads1=beads+beads+beads;
int max = 0;
int start;
int count;
int index;
int currs =0;
for (int i =0; i<beads.length();i++)
{
count = 0;
start = (i+beads.length());
index = start;
while (beads1.charAt(index) != 'r' && beads1.charAt(index) != 'b')
{
count += 1;
index -= 1;
}
if (beads1.charAt(index)=='r')
{
while(beads1.charAt(index)!='b'){
count++;
index-=1;
}
}
else if (beads1.charAt(index)=='b')
{
while(beads1.charAt(index)!='r'){
count++;
index-=1;
}
}

index = start+1;
while (beads1.charAt(index) != 'r' && beads1.charAt(index) != 'b')
{
count += 1;
index += 1;
}
if (beads1.charAt(index)=='r')
{
while(beads1.charAt(index)!='b'){
count++;
index+=1;
}
}
else if (beads1.charAt(index)=='b')
{
while(beads1.charAt(index)!='r'){
count++;
index+=1;
}
}
currs=count;
if (max<currs)
{
max=currs;
}
}
if (max>beads.length())
{
max=beads.length();
}
    out.println(max);                           // output result
    out.close();                                  // close the output file
  }
}



