package com.factory.imple;

import com.factory.fatory.Model;
import com.factory.fatory.Provider;
import com.factory.fatory.Target;

public class DaoProvider implements Provider {

	@Override
	public String maker(Target target, Model model) {
		// TODO Auto-generated method stub
		//����ģ�����������
		System.out.println("��ʼ����ģ��"+target.getTemplate());
		System.out.println("��ģ�����ֵ"+model.getPackageInfo());
		System.out.println("��ģ���ำֵ"+model.getTabName());
		return "���ɺ��dao�ļ�";
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
		System.out.println("��ʼ����ģ��"+target.getTemplate());
		System.out.println("��ģ�����ֵ"+model.getPackageInfo());
		System.out.println("��ģ���ำֵ"+model.getTabName());
		return "���ɺ��service�ļ�";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "serviceName";
	}
	
}
