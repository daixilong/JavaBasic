package com.factory.fatory;
/**
 * 定义常用的属性
 * @author a
 *
 */
public class Model {
	private String tabName;
	
	private String packageInfo;
	
	private String common;

	public String getTabName() {
		return tabName;
	}

	public void setTabName(String tabName) {
		this.tabName = tabName;
	}

	public String getPackageInfo() {
		return packageInfo;
	}

	public void setPackageInfo(String packageInfo) {
		this.packageInfo = packageInfo;
	}

	public String getCommon() {
		return common;
	}

	public void setCommon(String common) {
		this.common = common;
	}

	public Model(String tabName, String packageInfo, String common) {
		super();
		this.tabName = tabName;
		this.packageInfo = packageInfo;
		this.common = common;
	}
	
	
	
}
