package com;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.TypeVariable;
import java.util.Properties;

import com.model.Person;

public class TestMain {
    public static void main(String[] args) {
    	Properties properties=new Properties();
    	InputStream inputStream= TestMain.class.getClassLoader().getResourceAsStream("info.properties");
    	try {
			properties.load(inputStream);
			String className= (String) properties.get("classname");
			//��ȡ����
			Class class1= Class.forName(className);
			//��ȡ��
			Person person=(Person)class1.newInstance();
			//��ȡ����������еķ���1.
			Method [] methods= class1.getMethods();
			for (Method method : methods) {
				System.out.println(method.getName());
				Class [] classes= method.getParameterTypes();
				for (Class class2 : classes) {
					System.out.println(class2.getName()+"---"+class2.getSimpleName());
				}
			}
			//��ȡ��������������
		 	Field [] fields= class1.getDeclaredFields();
		 	for (Field field : fields) {
				System.out.println("field["+field.getName()+"]"+"--["+field.getModifiers()+"]--["+Modifier.PRIVATE+"]--["+field.getType().getSimpleName()+"]");
			}
		 	
		 	System.out.print("sa"+System.getProperty("line.separator")+"55");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
	}
}
