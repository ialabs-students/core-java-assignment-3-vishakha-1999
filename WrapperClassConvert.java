package com.assignment3;

public class WrapperClassConvert {

	public static Object convertToWrapper(int obj) {
		// converting primitive data type to Wrapper class
		Integer var1 = new Integer( obj);
		
		// using exception handling
		try {
			// checking if instance exists or not
			if(var1 instanceof Integer) {
				return var1;
			}
			else {
				System.out.println("Give proper primitives in input ");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return var1;
		
	}
	public static void main(String[] args) {
	
		int var = 10;
		// Passing the object of primitive type to function
		System.out.println(convertToWrapper(var));
	}

}
