package com.thayarupan.pattern.factory;

public class PlanFactory {
	enum PLAN_TYPE {
		DOMESTIC, COMMERCIAL
	}

	public static Plan getFactory(final PLAN_TYPE type) {
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
