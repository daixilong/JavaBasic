package com.factory.fatory;

/**
 * 提供两个方法
 * @author a
 *
 */
public interface Provider {
	
	public String maker(Target target,Model model);
	
	public String getName();
}
