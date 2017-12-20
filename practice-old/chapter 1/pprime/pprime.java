/*
ID: juwang1
LANG: JAVA
TASK: pprime
*/
import java.io.*;
import java.util.*;
import java.util.Collections;


class pprime {

  public static void main (String [] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("pprime.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("pprime.out")));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
        if (5>=a&&5<=b)
    out.println(5);
    if (7>=a&&7<=b)
    out.println(7);
if (11>=a&&11<=b)
    out.println(11);
	int palindrome;
    for (int d1 = 1; d1 <= 9; d1+=2) {	/* only odd; evens aren't so prime */
    for (int d2 = 0; d2 <= 9; d2++) {
	    palindrome = 100*d1+ 10*d2 + d1;
	    if (isPrime(palindrome)){
	    	if (palindrome>=a&&palindrome<=b)
	    	out.println(palindrome);
	    }
    }
}

    for (int d1 = 1; d1 <= 9; d1+=2) {	/* only odd; evens aren't so prime */
    for (int d2 = 0; d2 <= 9; d2++) {
	    palindrome = 1000*d1 + 100*d2 + 10*d2 + d1;
	    if (isPrime(palindrome)){
	    	if (palindrome>=a&&palindrome<=b)
	    	out.println(palindrome);
	    }
    }
}

    for (int d1 = 1; d1 <= 9; d1+=2) {	/* only odd; evens aren't so prime */
    for (int d2 = 0; d2 <= 9; d2++) {
        for (int d3 = 0; d3 <= 9; d3++) {
	    palindrome = 10000*d1 + 1000*d2 +100*d3 + 10*d2 + d1;
	    if (isPrime(palindrome)){
	    	if (palindrome>=a&&palindrome<=b)
	    	out.println(palindrome);
	    }
	}
    }
}

    for (int d1 = 1; d1 <= 9; d1+=2) {	/* only odd; evens aren't so prime */
    for (int d2 = 0; d2 <= 9; d2++) {
        for (int d3 = 0; d3 <= 9; d3++) {
	    palindrome = 100000*d1 + 10000*d2 +1000*d3 +100*d3+ 10*d2 + d1;
	    if (isPrime(palindrome)){
	    	if (palindrome>=a&&palindrome<=b)
	    	out.println(palindrome);
	    }
	}
    }
}

    for (int d1 = 1; d1 <= 9; d1+=2) {	/* only odd; evens aren't so prime */
    for (int d2 = 0; d2 <= 9; d2++) {
        for (int d3 = 0; d3 <= 9; d3++) {
        	for (int d4 = 0; d4 <= 9; d4++){
	    palindrome = 1000000*d1 + 100000*d2 +10000*d3+ 1000*d4+100*d3+ 10*d2 + d1;
	    if (isPrime(palindrome)){
	    	if (palindrome>=a&&palindrome<=b)
	    	out.println(palindrome);
	    }

	}
	}
    }
}

    for (int d1 = 1; d1 <= 9; d1+=2) {	/* only odd; evens aren't so prime */
    for (int d2 = 0; d2 <= 9; d2++) {
        for (int d3 = 0; d3 <= 9; d3++) {
        	for (int d4 = 0; d4 <= 9; d4++){
	    palindrome = 10000000*d1 + 1000000*d2 +100000*d3+ 10000*d4+1000*d4+100*d3+ 10*d2 + d1;
	    if (isPrime(palindrome)){
	    	if (palindrome>=a&&palindrome<=b)
	    	out.println(palindrome);
	    }

	}
	}
    }
}

    out.close();
}

public static boolean isPrime(long n) {
    if(n < 2) return false;
    if(n == 2 || n == 3) return true;
    if(n%2 == 0 || n%3 == 0) return false;
    long sqrtN = (long)Math.sqrt(n)+1;
    for(long i = 6L; i <= sqrtN; i += 6) {
        if(n%(i-1) == 0 || n%(i+1) == 0) return false;
    }
    return true;
}

}
