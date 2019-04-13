package com.thayarupan.pattern;

public class Singleton {

	private static Singleton instance = null;

	private Singleton() {}

	/*
	 * Double lock check
	 * Lock will not be placed in getInstance - Does not need to block
	 * So Lock will be placed with creating instance.
	 */
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

}
