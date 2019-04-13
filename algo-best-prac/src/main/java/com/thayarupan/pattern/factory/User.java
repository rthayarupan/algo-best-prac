package com.thayarupan.pattern.factory;

import com.thayarupan.pattern.factory.PlanFactory.PLAN_TYPE;

public class User {
	public static void main(String[] args) {
		Plan plan = PlanFactory.getFactory(PLAN_TYPE.DOMESTIC);
		System.out.println(plan.getRate());
	}
}
