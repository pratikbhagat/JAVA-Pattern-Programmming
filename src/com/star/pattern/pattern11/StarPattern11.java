package com.star.pattern.pattern11;

//    *
//   * 
//  *  
// *   


public class StarPattern11 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				if (i >= 2 && k > 1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
