package com.jsp.pattern;

public class P54 {
public static void main(String[] args) {
	int n=5;
	
	for(int i=1;i<=n;i++) {
		for(int sp=1;sp<=n-i;sp++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print(j);
		}
		for(int k=i-1;k>0;k--) {
			System.out.print(k);
		}
		
		System.out.println();
		
	}
}}

//    1
//   121
//  12321
// 1234321
//123454321
