package com.thayarupan.pattern.abstractfactory;

public class PlanFactory extends Factory {
	enum PLAN_TYPE {
		DOMESTIC, COMMERCIAL
	}
	public Plan getFactory(final PLAN_TYPE type) {
		Plan plan = null;
		switch (type) {
		case DOMESTIC:
			plan = new DomesticPlan();
			break;

		case COMMERCIAL:
			plan = new CommercialPlan();
			break;
		default:
			break;
		}
		return plan;
	}
}
