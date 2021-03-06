package com.cxq.java.designpattern.factory.simple;

import com.cxq.java.designpattern.factory.vo.IMilk;
import com.cxq.java.designpattern.factory.vo.MengniuMilk;
import com.cxq.java.designpattern.factory.vo.TelunsuMilk;
import com.cxq.java.designpattern.factory.vo.YiliMilk;

public class SimpleFactory {

	public IMilk getMilk(String name){
		if("蒙牛".equals(name)){
			return new MengniuMilk();
		}else if("特仑苏".equals(name)){
			return new TelunsuMilk();
		}else if("伊利".equals(name)){
			return new YiliMilk();
		}else{
			System.out.println("无指定的牛奶：" + name);
			return null;
		}
	}
	
}
