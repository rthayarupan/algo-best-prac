package com.thayarupan.pattern.abstractfactory;

import com.thayarupan.pattern.abstractfactory.PlanFactory.PLAN_TYPE;

public class User {
	public static void main(String[] args) {
		Plan plan = PlanFactory.getFactory(PLAN_TYPE.DOMESTIC);
		System.out.println(plan.getRate());
	}
}
