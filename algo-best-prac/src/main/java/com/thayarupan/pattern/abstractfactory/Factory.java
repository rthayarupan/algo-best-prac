package com.thayarupan.pattern.abstractfactory;

import com.thayarupan.pattern.abstractfactory.PlanFactory.PLAN_TYPE;

public abstract class Factory {
	
	public abstract Plan getFactory(final PLAN_TYPE type);

}
