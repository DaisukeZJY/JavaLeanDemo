package com.Object.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestStreamRW {
	
	/**
	 * BufferedReader
	 * - 高端流
	 * - 输入流
	 * - 字符流
	 * 
	 * */
	
	
	public static void readData(String path) throws IOException {
		// 处理高端流：读取文本数据
		// 处理硬盘的低端，输入流
		FileInputStream fileInputStream = null;
		// 处理内存的高端，字符流
		InputStreamReader inputStreamReader = null;
		
		try {
			// 低端流绑定硬盘上的文件
			fileInputStream = new FileInputStream(path);
			// 高端流绑定低端流
			inputStreamReader = new InputStreamReader(fileInputStream);
			
			char[] buffer = new char[1024];
			while (true) {
				int len = inputStreamReader.read(buffer);
				// 如果读到文件末尾，跳出
				if (-1 == len) break;
				String string = new String(buffer, 0, len);
				System.out.println(string);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			fileInputStream.close();
			inputStreamReader.close();
		}
		
	}
	
	/**
	 * OutputStreamWriter
	 * - 高端流
	 * - 输出流
	 * - 字符流
	 * 
	 * PrintWriter
	 * - 既是高端流也是低端流
	 * - 输出流
	 * - 字符流
	 * 
	 * */
	public static void writeData(String path) throws IOException {
		FileOutputStream fileOutputStream = null;
		OutputStreamWriter outputStreamWriter = null;
		
		try {
			fileOutputStream = new FileOutputStream(path);
			outputStreamWriter = new OutputStreamWriter(fileOutputStream);
			
			// 写数据
			outputStreamWriter.write("增增加的");
			outputStreamWriter.write(123);
			outputStreamWriter.flush();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			fileOutputStream.close();
			outputStreamWriter.close();
		}
	}

	public static void main(String[] args) throws IOException {
		
		String path = "/Users/DaiSuke/Desktop/MyGitHubProject/JavaLeanDemo/JavaBaseDataType/src/com/Object/IO/IO.txt";
		
		TestStreamRW.writeData(path);
		
		TestStreamRW.readData(path);
		
		
	}
}
