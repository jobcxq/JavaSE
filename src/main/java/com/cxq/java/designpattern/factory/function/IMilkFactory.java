package com.cxq.javaSE.designpattern.factory.function;

import com.cxq.javaSE.designpattern.factory.vo.IMilk;

public interface IMilkFactory {

	//牛奶配比等公共方法
	
	/**
	 * 
	 * @return
	 */
	public IMilk getMilk();
	
}