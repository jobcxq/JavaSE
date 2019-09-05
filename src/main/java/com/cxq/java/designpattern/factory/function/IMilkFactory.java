package com.cxq.java.designpattern.factory.function;

import com.cxq.java.designpattern.factory.vo.IMilk;

public interface IMilkFactory {

	//牛奶配比等公共方法
	
	/**
	 * 
	 * @return
	 */
	public IMilk getMilk();
	
}
