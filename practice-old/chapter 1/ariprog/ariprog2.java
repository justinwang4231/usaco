/*
ID: juwang1
LANG: JAVA
TASK: ariprog
*/
import java.io.*;
import java.util.*;

class ariprog2 {
  public static void main (String [] args) throws IOException {
  	long startTime = System.currentTimeMillis();

    BufferedReader f = new BufferedReader(new FileReader("ariprog.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ariprog.out")));
    StringTokenizer st = new StringTokenizer(f.readLine());
    ArrayList<Integer> lmao = new ArrayList<Integer>();
    ArrayList<int[]> lmao2 = new ArrayList<int[]>();
    int n = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(f.readLine());
    int m = Integer.parseInt(st.nextToken());
    int check=m*m+m*m;
    int curr;
    int diff;
    int count=1;
    int number=0;
    boolean wa=false;
    boolean checker=false;
    int last;
    for (int i = 0; i < m+1;i++){
	for (int j = i; j < m+1;j++){
		lmao.add(i*i+j*j);
	}
}

	Collections.sort(lmao);

 	for (Integer p: lmao){
 		count=1;
 		while (true){
 			//System.out.println((int)(lmao.get(number))==(int)(p));
 			if (count+number>=lmao.size()){
 				break;
 			}
 			if ((lmao.get(number+count)-lmao.get(number))*(n-1)+lmao.get(number)>check){
 				//System.out.println(p+" "+(lmao.get(number+count)-lmao.get(number)));
 				break;
 			}
 			else{
 				checker=true;
 				curr=p;
 				for (int i=0;i<n-1;i++){
 					curr+=lmao.get(number+count)-lmao.get(number);
 					for(int xx = number+count;xx<lmao.size();xx++){
 					if ((int)(lmao.get(xx))==(int)(curr)){
 						checker=true;
 						break;
 					}
 					else{
 						checker=false;
 					}
 				}
 				if(checker==false){
 					break;
 				}
 				}
 				if (checker==false){
 					//System.out.println(p+" "+(lmao.get(number+count)-lmao.get(number)));
 					count=count;
 				}
 				else{
 					if(!cmp(p,(lmao.get(number+count)-lmao.get(number)),lmao2) && (lmao.get(number+count)-lmao.get(number)) != 0){
 						lmao2.add(new int[] {p,(lmao.get(number+count)-lmao.get(number))});}
 					
 					wa=true;
 				}
 				count++;
 			}
 		}
 		number++;
 	} 

System.out.println((new Date()).getTime() - startTime);
 	Collections.sort(lmao2,new Comparator<int[]>() {
            public int compare(int[] strings, int[] otherStrings) {
                if (strings[1]==(otherStrings[1])){
                	return (strings[0]>(otherStrings[0]))?1:-1;
            }
            return (strings[1]>(otherStrings[1]))?1:-1;
        }
        });
 	for (int[] ra:lmao2){
 		out.println(ra[0]+" "+ra[1]);
 	}
 	if(lmao2.size()==0){
 		wa=false;
 	}

 	if(!(wa)){
 		out.println("NONE");
 	}                      
    out.close();  
                    
  }
  public static boolean cmp(int a, int b, ArrayList<int[]> ra){
  	boolean ret = false;
  	for (int i=0; i<ra.size();i++){
  		if ((int)(ra.get(i)[0])==a &&(int)(ra.get(i)[1])==b){
  			ret=true;
  		}
  	}

  	return ret;
  }
}
