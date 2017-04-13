package com.Object.IO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestBufferedReader {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream = null;
		InputStreamReader inputStreamReader = null;
		BufferedReader bufferedReader = null;
		String path = "/Users/DaiSuke/Desktop/MyGitHubProject/JavaLeanDemo/JavaBaseDataType/src/com/Object/IO/IO.txt";
		
		try {
			fileInputStream = new FileInputStream(path);
			inputStreamReader = new InputStreamReader(fileInputStream);
			bufferedReader = new BufferedReader(inputStreamReader);
			
			while (true) {
				String messageString = bufferedReader.readLine();
				// 读取数据为null，认为读取完毕
				if (messageString == null) return;
				System.out.println(messageString);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
