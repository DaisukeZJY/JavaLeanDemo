package com.Object.File;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class TestFile {
	
	// 遍历目录
	public static void scanDic(String dirName) {
		File dirFile = new File(dirName);
		String[] list = dirFile.list();
		for (String string : list) {
			String pathName = dirName + File.separator + string;
			if (true == ".".equals(string) || true == "..".equals(string)) {
				// 排除特殊符号
				continue;
			}
			
			// 绑定当前目录或文件
			File currentFile = new File(pathName);
			if (true == currentFile.isFile()) {
				// 如果是文件
				System.out.println(pathName);
			} else if (true == currentFile.isDirectory()) {
				// 如果是目录
				System.out.println(pathName + ":");
				// 递归
				scanDic(pathName);
			}
			
		}
	}
	
	public static void delegleDir(String path, String dirName) {
		String allPathString = path+dirName;
		File file = new File(allPathString);
		String[] list = file.list();
		for (String fileName : list) {
			String pathNameString = allPathString+File.separator+fileName;
			if (true == ".".equals(fileName) || true == "..".equals(fileName)) {
				continue;
			}
			
			// 绑定当前目录
			File currentFile = new File(pathNameString);
			if (currentFile.isFile()) {
				System.out.println(pathNameString);
				currentFile.delete();
				delegleDir(path, dirName);
			} else if (currentFile.isDirectory()) {
				if (pathNameString.contains(dirName)) {
					currentFile.delete();
				}
			}
			
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		/*
		// 绑定一个文件
		File file = new File("/Users/DaiSuke/Desktop/MyGitHubProject/JavaLeanDemo/JavaBaseDataType/src/com/Object/File/TestFile.txt");
		
		// =========文件操作====== //
		// 创建新文件
		boolean isOk = file.createNewFile();
		System.out.println(isOk);
		// 删除文件
		isOk = file.delete();
		file.deleteOnExit();
		System.out.println(isOk);
		// 判断文件是否存在
		isOk = file.exists();
		// 判断是否是文件
		isOk = file.isFile();
		
		// 判断是否可读
		boolean canRead = file.canRead();
		// 判断是否可写
		boolean canWrite = file.canWrite();
		
		// 得到文件的全路径（路径+文件名）
		String pathString = file.getPath();
		System.out.println("path:"+pathString);
		// 得到文件名
		String nameString = file.getName();
		System.out.println("name:"+nameString);
		// 得到文件路径
		String parentString = file.getParent();
		System.out.println("parent:"+parentString);
		
		
		// 绑定一个路径
		File dirFile = new File("/Users/DaiSuke/Desktop/MyGitHubProject/JavaLeanDemo/JavaBaseDataType/src/com/Object/File/a");
		
		// 创建路径，不能创建多级路径
		boolean flag = dirFile.mkdir();
		System.out.println(flag);
		// 可以创建多级路径
		//flag = dirFile.mkdirs();
		// 删除空路径
		//dirFile.delete();
		//dirFile.deleteOnExit();
		
		// 判断路径是否存在
		flag = dirFile.exists();
		// 判断是否是路径
		flag = dirFile.isDirectory();
		
		// 得到文件的全路径（路径+文件名）
		String path = dirFile.getPath();
		System.out.println("path:"+path);
		// 得到路径下最后一层目录的名字
		String name = dirFile.getName();
		System.out.println("name:"+name);
		// 得到倒数第二层路径
		String parent = dirFile.getParent();
		System.out.println("parent:"+parent);
		*/
		
//		TestFile.scanDic("/Users/DaiSuke/Desktop/MyGitHubProject/JavaLeanDemo/JavaBaseDataType/src/com/Object");
		
		TestFile.delegleDir("/Users/DaiSuke/Desktop/MyGitHubProject/JavaLeanDemo/JavaBaseDataType/src/com/Object", "/File/a");
	}
}
