import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AVeryBigSum {

	static long aVeryBigSum(int n, long[] ar) {
		long theresult = 0;
		
		AVeryBigSum theObj = new AVeryBigSum();
		theresult = theObj.calculateSumOfValuesInLongArray(ar);
		
		return theresult;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] ar = new long[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextLong();
        }
        long result = aVeryBigSum(n, ar);
        System.out.println(result);
    }
    
    private long calculateSumOfValuesInLongArray(long[] longArray)
    {
    	long finalResult = 0;
    	
    	for(int i = 0; i < longArray.length; i++)
    	{
    		finalResult = finalResult + longArray[i];
    	}
    	
    	return finalResult;
    }

}
