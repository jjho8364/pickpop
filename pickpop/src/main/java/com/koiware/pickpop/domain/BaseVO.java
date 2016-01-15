package com.koiware.pickpop.domain;

import java.lang.reflect.Field;

public class BaseVO {
	public void about() {
		  Object obj = this;
		  System.out.println(this.toString());		  
		  for (Field f : obj.getClass().getDeclaredFields()) {
		    f.setAccessible(true);
		    Object value = null;
			try {
				value = f.get(obj);
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    System.out.println(f.getName() + ":" + value);
		  }
		}
}
