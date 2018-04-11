package com.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.annotation.ContactAnnotation;
import com.model.User;
/**
 * 注解转换工具
 * @author a
 *
 */
public class AnnotationParser {

	public static void parser(User user) throws IllegalAccessException{
		//获取该类下的所有的字段
		/**
		 * java的反射机制获取类对象的三种方式：1.user.getClass() 2.User.class 3.Class.forname("类所在的位置")
		 */
		Field [] fields= user.getClass().getDeclaredFields();
		for (Field field : fields) {
			//获取属性的注解
			Annotation [] annotations= field.getAnnotations();
			for (Annotation annotation : annotations) {
				if(annotation instanceof ContactAnnotation){
					//私有属性取消验证
					if(field.getModifiers()==Modifier.PRIVATE){
						field.setAccessible(true);
					}
				  	ContactAnnotation contactAnnotation=(ContactAnnotation)annotation;
				  	//获取属性的get的值
				  	String fieldValue= (String)field.get(user);
				  	boolean result=false;
				  	//对获取的值做一下判断
				  	switch (contactAnnotation.type()) {
					case PHONE:
						result=ValidUtil.isPhone(fieldValue);
						break;
						
					case MOBILE:
						result=ValidUtil.isMobile(fieldValue);
						break;

					default:
						break;
					}
				  	if(!result){
				  		System.out.println("invalid["+field.getName()+":"+fieldValue+"]");
				  	}
				}
			}
		}
	}
}
