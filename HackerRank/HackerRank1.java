package com.Te.HackerRank;

import java.util.Scanner;

public class HackerRank1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String ans;

		if (n % 2 == 1 || (n >= 6 && n <= 20)) {
			ans = "Weird";
		} else {
			ans = "Not Weird";
		}

	}

}
