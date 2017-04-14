package com.Object.IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class TestObjectInputStream {
	/// 将对象通过对象流从文件中读取出来
	
	public static void main(String[] args) {
		String path = "/Users/DaiSuke/Desktop/MyGitHubProject/JavaLeanDemo/JavaBaseDataType/src/com/Object/IO/IOObject.txt";
		
		try {
			FileInputStream fileInputStream = new FileInputStream(path);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			
			@SuppressWarnings("unchecked")
			List<TestWriteObject> objects = (List<TestWriteObject>)objectInputStream.readObject();
			for (TestWriteObject testWriteObject : objects) {
				System.out.println(testWriteObject.getName());
				System.out.println(testWriteObject.getAddress());
			}
			objectInputStream.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
