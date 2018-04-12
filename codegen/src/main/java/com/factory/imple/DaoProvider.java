package com.factory.imple;

import com.factory.fatory.Model;
import com.factory.fatory.Provider;
import com.factory.fatory.Target;

public class DaoProvider implements Provider {

	@Override
	public String maker(Target target, Model model) {
		// TODO Auto-generated method stub
		//调用模板里面的配置
		System.out.println("开始调用模板"+target.getTemplate());
		System.out.println("给模板包赋值"+model.getPackageInfo());
		System.out.println("给模板类赋值"+model.getTabName());
		return "生成后的dao文件";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "daoName";
	}

}

class ServiceProvider implements Provider{

	@Override
	public String maker(Target target, Model model) {
		// TODO Auto-generated method stub
		System.out.println("开始调用模板"+target.getTemplate());
		System.out.println("给模板包赋值"+model.getPackageInfo());
		System.out.println("给模板类赋值"+model.getTabName());
		return "生成后的service文件";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "serviceName";
	}
	
}
