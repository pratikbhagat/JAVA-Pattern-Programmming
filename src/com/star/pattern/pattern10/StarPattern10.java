package com.star.pattern.pattern10;

// *
//  *
//   *
//    *

public class StarPattern10 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				if (i >= 2 && j <= i - 1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
