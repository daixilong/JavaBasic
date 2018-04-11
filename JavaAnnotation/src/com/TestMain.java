package com;

import com.model.User;
import com.util.AnnotationParser;

/**
 * 测试的主类
 * @author a
 *
 */
public class TestMain {
	public static void main(String[] args) throws IllegalAccessException {
		User user =new User();
		user.setId(1);
		user.setName("小呆");
		user.setMobile("15201506104");
		user.setPhone("222");
		AnnotationParser.parser(user);
	}
}
