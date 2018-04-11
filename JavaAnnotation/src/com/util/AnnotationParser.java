package com.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.annotation.ContactAnnotation;
import com.model.User;
/**
 * ע��ת������
 * @author a
 *
 */
public class AnnotationParser {

	public static void parser(User user) throws IllegalAccessException{
		//��ȡ�����µ����е��ֶ�
		/**
		 * java�ķ�����ƻ�ȡ���������ַ�ʽ��1.user.getClass() 2.User.class 3.Class.forname("�����ڵ�λ��")
		 */
		Field [] fields= user.getClass().getDeclaredFields();
		for (Field field : fields) {
			//��ȡ���Ե�ע��
			Annotation [] annotations= field.getAnnotations();
			for (Annotation annotation : annotations) {
				if(annotation instanceof ContactAnnotation){
					//˽������ȡ����֤
					if(field.getModifiers()==Modifier.PRIVATE){
						field.setAccessible(true);
					}
				  	ContactAnnotation contactAnnotation=(ContactAnnotation)annotation;
				  	//��ȡ���Ե�get��ֵ
				  	String fieldValue= (String)field.get(user);
				  	boolean result=false;
				  	//�Ի�ȡ��ֵ��һ���ж�
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
