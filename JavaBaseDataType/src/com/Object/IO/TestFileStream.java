package com.Object.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileStream {
	/**
	 * IO流的用处：
	 * 1、让程序的内存和外界交换数据
	 * - 程序和硬盘
	 * - 程序和网络
	 * - 程序和其他终端设备
	 * 2、简单说就是：
	 * - 把内存中的数据写到终端
	 * - 把终端的数据读取加载到内存
	 * 
	 * 内存中数据的种类： String, Int, Object...
	 * 
	 * 终端类型：硬盘、网络、其他终端...
	 * 
	 * 流的分类：
	 * 1、从处理对象来看：
	 * - 高端流：处理内存的
	 * - 低端流：处理终端的
	 * 
	 * 2、从数据流向来看
	 * - 输入流：将数据读入内存的
	 * - 输出流：将数据从内存中导出的
	 * 
	 * 3、从处理的数据类型来看
	 * - 字符流：处理文本（储存字符类型的文件）
	 * - 字节流：处理二进制的数据（0和1的数据）
	 * @throws IOException 
	 * 
	 * 
	 * */
	
	public static void readData(String path) throws IOException {
		/// 硬盘与内存交互：按字节读取数据
		// 1、处理硬盘的低端，输入流。低端流绑定硬盘的文件
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(path);
			
			// 规定读取字节数
			byte[] buffer = new byte[1024];
			
			// 循环读取流里面的数据
			while (true) {
				int len = fileInputStream.read(buffer);
				if (-1 == len) {
					// 如果已经读到文件末尾
					break;
				}
				String string = new String(buffer, 0, len);
				System.out.println(string);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 关闭流
			fileInputStream.close();
		}
	}
	
	public static void writeData(String path) throws Exception{
		// 低端绑定硬盘，输出流
		FileOutputStream fileOutputStream = null;
		try {
			// 低端流绑定硬盘上的文件
			fileOutputStream = new FileOutputStream(path);
			// 写二进制数据
			fileOutputStream.write(0);
			fileOutputStream.write(1);
			fileOutputStream.write(1);
			fileOutputStream.write(1);
			fileOutputStream.write(1);
			fileOutputStream.write(1);
			fileOutputStream.write(1);
			fileOutputStream.flush();
			System.out.println("写入成功");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			fileOutputStream.close();
		}
	}
	
	
	public static void main(String[] args) throws Exception{
		
		String path = "/Users/DaiSuke/Desktop/MyGitHubProject/JavaLeanDemo/JavaBaseDataType/src/com/Object/IO/IO.txt";
		
		// 写入文件数据
		TestFileStream.writeData(path);
		
		// 读取文件数据
		TestFileStream.readData(path);
		
		
		
	}
	
	
}
