package javacode;

import java.util.Scanner;

public class evenSumOfFibonacciSeriesTillN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.");
		int n=sc.nextInt();
		// TODO Auto-generated method stub
		int a = 0, b = 1,sum=0;

        for (int i = 1; i <= n; i++) {
            if (a % 2 == 0) {
               sum = sum + a;}
            	
            
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println(sum);
        

	}

}
