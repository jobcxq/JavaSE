package com.cxq.designPattern.factory.function;

import com.cxq.designPattern.factory.vo.IMilk;
import com.cxq.designPattern.factory.vo.MengniuMilk;

public class MengniuFactory implements IMilkFactory {

	@Override
	public IMilk getMilk() {
		return new MengniuMilk();
	}

}
