package com.Object.IO;

public class TestFileUtil {

	public static void main(String[] args) {
		String msg = FileUtil.keyIn();
		String path = "/Users/DaiSuke/Desktop/MyGitHubProject/JavaLeanDemo/JavaBaseDataType/src/com/Object/IO/IO.txt";
		
		FileUtil.outToFile(msg, path);
	}
}
