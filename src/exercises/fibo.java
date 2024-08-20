package exercises;

import java.util.Scanner;

public class fibo {
public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int index = 1; index < num; index += 1) {
			System.out.println(fiboRecursivo(index) + " ");
		}
	}

	public static int fiboRecursivo(int n) {
		if (n <= 1) {
        	return n;
    	} else {
        	return fiboRecursivo(n - 1) + fiboRecursivo(n - 2);
    	}
	}
}
