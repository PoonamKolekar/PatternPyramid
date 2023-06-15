package com.jsp.pattern;

public class P55 {
	public static void main(String[] args) {
		int n=5;
		
	for(int i=1;i<=n;i++) {
		for(int sp=1;sp<=n-i;sp++) {
			System.out.print(" ");
		}
		for(int j=i;j>=1;j--) {
			System.out.print(j);
		}
		for(int k=2;k<=i;k++) {
			System.out.print(k);
		}
		
		System.out.println();
		
	}
}}



