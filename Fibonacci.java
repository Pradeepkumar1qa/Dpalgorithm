package Dpalgorithm;

public class Fibonacci {
  
	
	public static long  compute(int n) {
		long [] arr=new long[1200000];
	    arr[0]=0;
	    arr[1]=1;
	     if(arr[n]==0 && (n!=0)) {
	    	 return fib(n,arr); 
	     }
	     else 
	    	 return arr[n];
	}
	
	private static long  fib(int n, long[] arr) {
		if(arr[n]==0 && n>1) {
			arr[n]=fib(n-1,arr)+fib(n-2,arr);
			
		}
	     return arr[n];
		
	}

	public static void main(String[] args) {
		System.out.println(compute(15000));

	}

}
