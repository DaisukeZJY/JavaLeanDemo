package com.Object.IO;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		while (true) {
//			String message = scanner.nextLine();
			// 按照空格自动分段
			String message = scanner.next();
			System.out.println("you input:"+message);
		}
	}
}
