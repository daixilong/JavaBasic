package com;

import com.model.User;
import com.util.AnnotationParser;

/**
 * ���Ե�����
 * @author a
 *
 */
public class TestMain {
	public static void main(String[] args) throws IllegalAccessException {
		User user =new User();
		user.setId(1);
		user.setName("С��");
		user.setMobile("15201506104");
		user.setPhone("222");
		AnnotationParser.parser(user);
	}
}
