package com.factory;

import java.io.IOException;

import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.ClasspathResourceLoader;

import com.factory.fatory.Model;
import com.factory.fatory.Target;
import com.factory.imple.DaoProvider;
import com.factory.imple.TemplateGen;
/**
 * ���Ը���beetlģ��ȥ�Զ����ɶ�Ӧ���ļ�,�������
 * @author a
 *
 */
public class TestMain {
	public static void main(String[] args) throws IOException {
		Target teGen=new TemplateGen(new Model("tb_test", "com.test", "С��"));
		teGen.flush(new DaoProvider());
		ClasspathResourceLoader path=new ClasspathResourceLoader("/template");
		Configuration conf=Configuration.defaultConfiguration();
		GroupTemplate gt=new GroupTemplate(path, conf);
		Template template= gt.getTemplate("test.txt");
		template.binding("name", "С��");
		String str= template.render();
		System.out.println(str);
	}
}
