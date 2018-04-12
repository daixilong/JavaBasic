package com.factory.imple;

import com.factory.fatory.Model;
import com.factory.fatory.Provider;

public class TemplateGen extends BaseTarget {
	
	private Model model;
	
	public TemplateGen(Model model){
		this.model=model;
	}
	
	@Override
	public void flush(Provider provider) {
		// TODO Auto-generated method stub
	    //≈–∂œ¿‡–Õ
		System.out.println(provider.maker(this, model));
		System.out.println(provider.getName());
	}

}
