package com.iu.s4.objects4;

public final class God {
	
	private static final String MT_NAME="";
	
	private static God god;

	private String name;
	
	private God() {
//		this.name ="test";
	}
	
	public static God getInstance() {
		if(God.god == null) {
			God.god = new God();
		}
		return god;
		
	}

	public final String getName() {
		return getName();
	}

	public void setName(String name) {
		this.name = name;
	}

}
