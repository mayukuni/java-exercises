package exercises;

import java.util.Scanner;

public class fibo {
public static void main(String args[]) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int num = sc.nextInt();a
//		
//		for (int index = 1; index < num; index += 1) {
//			System.out.println(fiboRecursivo(index) + " ");
//		}
//	}
//
//	public static int fiboRecursivo(int n) {
//		if (n <= 1) {
//        	return n;
//    	} else {
//        	return fiboRecursivo(n - 1) + fiboRecursivo(n - 2);
//    	}
//	}		
		Scanner sc = new Scanner(System.in);
		
		
		int num = 0;
		int fib1 =1;
		int fib2 = 1;
		int fibona = 0;
		
		System.out.println("Digite o numero");
		num = sc.nextInt();
		
		
		if (num == 0) {
			
				  fibona = 1;
		}
		
		else if (num == 1) {
			
			      fibona = 1;
		}
		
	    else {
			    	
			    	 for(int i = 2; i<=num; i++) {
			    		 
			    	   fibona = fib1 + fib2;
			    	   fib1 = fib2;
			    	   fib2 = fibona;
			    	 }
	    }
		System.out.println("O número de Fibonacci para " + num + " é: " + fibona);
}
}
