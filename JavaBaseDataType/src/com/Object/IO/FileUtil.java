package com.Object.IO;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileUtil {

	public static String keyIn() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
	
	
	// 将文本数据已追加的方式写入指定的位置的文档中
	public static void outToFile(String msg, String filePath) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(filePath, true);
			PrintWriter printWriter = new PrintWriter(fileOutputStream);
			printWriter.write(msg);
			printWriter.flush();
			printWriter.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
