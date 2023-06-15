package com.jsp.pattern;

public class P56 {
	public static void main(String[] args) {
		int n=1;
		for(int i=1;i<=n;i++) {
			for(int sp=1;sp<=n-i;sp++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
				if(j<i) {
					System.out.print("*");
				}
			}
		
		System.out.println();
		
	}

}
}