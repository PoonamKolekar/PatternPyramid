package com.jsp.pattern;

public class P52 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int sp=1;sp<=n-i;sp++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				if(j%2==0){
					System.out.print(0);
					}else {System.out.print(1);
			}
			}
				System.out.println();
		}
		
	}
}


//    1
//   101
//  10101
// 1010101
//101010101
