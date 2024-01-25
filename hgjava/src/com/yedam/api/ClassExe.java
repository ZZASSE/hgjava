package com.yedam.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassExe {
	public static void main(String[] args) throws FileNotFoundException {
		
		//클래스.class가져오는 법
		Class cls = String.class;
		String str = "";
		cls = str.getClass();
		try {
			cls = Class.forName("com.yedam.api.Member");			
		} catch (ClassNotFoundException e) {
			
		}
		
		Method[] methods = cls.getDeclaredMethods();
		for(Method method : methods) {
			System.out.println(method.getName());
		}
		
		Field[] fields = cls.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getName());
		}
		
		//경로정보
		String path = cls.getResource("sample.txt").getPath();
		System.out.println(path);
		
		Scanner scn = new Scanner(new File(path));
	}
}
